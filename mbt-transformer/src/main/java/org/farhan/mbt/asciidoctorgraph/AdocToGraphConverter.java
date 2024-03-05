package org.farhan.mbt.asciidoctorgraph;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.List;
import org.asciidoctor.ast.ListItem;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;

public class AdocToGraphConverter extends ToGraphConverter {

	private JGraphTGraphWrapper tgtWrp;
	AsciiDoctorProject srcPrj;

	public AdocToGraphConverter(String layer, AsciiDoctorProject source, JGraphTProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
	}

	@Override
	protected void selectObjects() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	@Override
	protected void convertObject(ConvertibleObject object) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) object;
		tgtWrp = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(adaw.getFile().getName()));

	}

	@Override
	protected String convertObjectName(String fullName) {
		return tgtPrj.getDir(tgtPrj.FIRST_LAYER).getAbsolutePath() + File.separator
				+ fullName.replace(srcPrj.getFileExt(srcPrj.FIRST_LAYER), "") + tgtPrj.getFileExt(tgtPrj.FIRST_LAYER);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertElements(ConvertibleObject object) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) object;
		Document src = (Document) adaw.get();
		MBTGraph<MBTVertex, MBTEdge> tgt = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		for (StructuralNode block : src.getBlocks()) {
			if (block instanceof Section) {
				convertSections(tgt, (Section) block);
			}
		}
	}

	private void convertSections(MBTGraph<MBTVertex, MBTEdge> g, Section scenario) {

		ArrayList<ListItem> steps = new ArrayList<ListItem>();
		for (StructuralNode block : scenario.getBlocks()) {
			if (block instanceof List) {
				List l = (List) block;
				for (StructuralNode listItem : l.getItems()) {
					ListItem li = (ListItem) listItem;
					steps.add(li);
				}
			} else if (block instanceof Table) {
				// So this is a hack to reduce code changes for now. Not sure if this will come
				// back to bite me in the ***. What I did learn is that I can read an empty adoc
				// file and then dynamically create the sections :)
				steps.getLast().getBlocks().add(block);
			}
		}
		g.createEdgeWithVertices(g.getStartVertex().getLabel(), steps.getFirst().getText(), "", null);
		MBTEdge edge = null;
		for (int i = 0; i < steps.size(); i++) {
			String source = steps.get(i).getText();
			String target;
			if (i == steps.size() - 1) {
				target = g.getEndVertex().getLabel();
			} else {
				target = steps.get(i + 1).getText();
			}
			edge = g.createEdgeWithVertices(source, target, scenario.getTitle(), null);
			convertTableToGraph(edge, steps.get(i));
		}
		edge.setLabel(scenario.getTitle());
		edge.setTag(getSectionAttributes(scenario));
		edge.setDescription(getSectionText(scenario));
	}

	private String getSectionAttributes(Section scenario) {
		Map<String, Object> attrs = scenario.getAttributes();
		String tags = (String) attrs.get("tags");
		if (tags == null) {
			return "";
		} else {
			return tags;
		}
	}

	private String getSectionText(Section scenario) {
		String text = "";
		for (StructuralNode block : scenario.getBlocks()) {
			if (block instanceof Block) {
				text += "\n\n" + ((Block) block).getSource();
			} else {
				text = text.trim();
				break;
			}
		}
		return text;
	}

	private void convertTableToGraph(MBTEdge inputs, ListItem step) {

		// loop through the blocks which are tables
		for (StructuralNode block : step.getBlocks()) {
			if (block instanceof Table) {
				// TODO this inner graph will have an associated file, so instead of saving the
				// graph in one massive file, make it a pointer to the actual file for now
				JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(step.getText()));
				MBTGraph<MBTVertex, MBTEdge> tgt = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
				Table table = (Table) block;
				ArrayList<MBTVertex> vertices = convertTableToVertices(table, tgt);
				convertTableToEdges(table, tgt, vertices);
				inputs.setValue(gtf.get());
			}
		}
	}

	private void convertTableToEdges(Table table, MBTGraph<MBTVertex, MBTEdge> tgt, ArrayList<MBTVertex> vertices) {
		// go through each row and convert to edge
		for (int i = 0; i < table.getBody().size(); i++) {

			tgt.createEdgeWithInput(tgt.getStartVertex(), vertices.getFirst(), "", "");

			Row row = table.getBody().get(i);
			for (int j = 0; j < vertices.size() - 1; j++) {
				String label = row.getCells().get(j).getText();
				if (!label.isEmpty()) {
					tgt.createEdgeWithInput(vertices.get(j), vertices.get(j + 1), label, label);
				}
			}
			// TODO this assumes the last column isn't blank, check it
			tgt.createEdgeWithInput(vertices.getLast(), tgt.getEndVertex(), row.getCells().getLast().getText(),
					row.getCells().getLast().getText());
		}
	}

	private ArrayList<MBTVertex> convertTableToVertices(Table table, MBTGraph<MBTVertex, MBTEdge> graph) {
		ArrayList<MBTVertex> vertices = new ArrayList<MBTVertex>();
		// TODO validate the table has at least two rows
		for (Row r : table.getHeader()) {
			for (Cell c : r.getCells()) {
				vertices.add(graph.createVertex(c.getText()));
			}
		}
		return vertices;
	}
}
