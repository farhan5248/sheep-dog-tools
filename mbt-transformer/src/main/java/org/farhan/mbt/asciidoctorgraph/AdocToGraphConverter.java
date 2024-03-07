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
	private AsciiDoctorProject srcPrj;

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
		tgt.setTag(getSectionAttributes(src));
		for (StructuralNode block : src.getBlocks()) {
			if (block instanceof Section) {
				convertSections(tgt, (Section) block);
			} else if (block instanceof Block) {
				tgt.setDescription(getSectionText(block));
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
				// back to bite me. What I did learn is that I can read an empty adoc file and
				// then dynamically create the sections :)
				steps.getLast().getBlocks().add(block);
			}
		}
		g.createEdgeWithVertices(g.getStartVertex().getLabel(), steps.getFirst().getText(), "", "");
		MBTEdge edge = null;
		for (int i = 0; i < steps.size(); i++) {
			String source = steps.get(i).getText();
			String target;
			if (i == steps.size() - 1) {
				target = g.getEndVertex().getLabel();
			} else {
				target = steps.get(i + 1).getText();
			}
			edge = g.createEdgeWithVertices(source, target, scenario.getTitle(), "");
			convertTableToGraph(edge, steps.get(i));
		}
		edge.setLabel(scenario.getTitle());
		edge.setTag(getSectionAttributes(scenario));
		edge.setDescription(getSectionText(scenario));
	}

	private String getSectionAttributes(StructuralNode section) {
		String tags = (String) section.getAttributes().get("tags");
		if (tags == null) {
			return "";
		} else {
			return tags;
		}
	}

	private String getSectionText(StructuralNode section) {
		String text = "";
		for (StructuralNode block : section.getBlocks()) {
			if (block instanceof Block) {
				text += "\n\n" + ((Block) block).getSource();
			} else {
				break;
			}
		}
		text = text.trim();
		return text;
	}

	private void convertTableToGraph(MBTEdge inputs, ListItem step) {
		for (StructuralNode block : step.getBlocks()) {
			if (block instanceof Table) {
				JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(step.getText()));
				MBTGraph<MBTVertex, MBTEdge> tgt = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
				Table table = (Table) block;
				convertTableToEdges(table, tgt);
				// TODO this inner graph has a .graph file, so instead of saving this
				// graph in one combined file, make this a pointer to the actual file rather
				// than embedding its contents

				// TODO instead of setting the graph, make a link to its start and end nodes.
				// When doing this make sure the level of each node is set
				inputs.setValue(gtf.get());
			}
		}
	}

	private void convertTableToEdges(Table table, MBTGraph<MBTVertex, MBTEdge> graph) {

		MBTVertex lastVertex = graph.getStartVertex();
		String lastEdgeLabel = "";
		int rowCnt = table.getBody().size();
		for (int i = 0; i < rowCnt; i++) {
			Row row = table.getBody().get(i);
			int cellCnt = row.getCells().size();
			for (int j = 0; j < cellCnt; j++) {
				// make a new vertex
				MBTVertex newVertex = graph
						.createVertex(i + " " + table.getHeader().get(0).getCells().get(j).getText());
				String newEdgeLabel = row.getCells().get(j).getText();
				if (i == 0 && j == 0) {
					// first row first cell
					graph.createEdgeWithInput(lastVertex, newVertex, lastEdgeLabel, lastEdgeLabel);
				} else {
					graph.createEdgeWithInput(lastVertex, newVertex, lastEdgeLabel, lastEdgeLabel);
				}
				lastVertex = newVertex;
				lastEdgeLabel = newEdgeLabel;
			}
		}
		// TODO this assumes the last column isn't blank, check it
		graph.createEdgeWithInput(lastVertex, graph.getEndVertex(), lastEdgeLabel, lastEdgeLabel);
	}
}
