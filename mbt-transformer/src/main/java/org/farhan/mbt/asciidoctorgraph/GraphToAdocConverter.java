package org.farhan.mbt.asciidoctorgraph;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.ast.impl.SectionImpl;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.List;
import org.asciidoctor.ast.ListItem;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToDocumentConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;

public class GraphToAdocConverter extends ToDocumentConverter {

	private AsciiDoctorAdocWrapper tgtWrp;
	private JGraphTProject srcPrj;
	private JRubyProcessor jrp;
	private int pathCnt;

	public GraphToAdocConverter(String layer, JGraphTProject source, AsciiDoctorProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.pathCnt = -1;
		this.jrp = new JRubyProcessor();
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
		JGraphTGraphWrapper adaw = (JGraphTGraphWrapper) object;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) adaw.get();
		tgtWrp = (AsciiDoctorAdocWrapper) tgtPrj.createObject(convertObjectName(g.getName()));
		Document theDoc = (Document) tgtWrp.get();
		theDoc.setTitle(g.getName());
		theDoc.getAttributes().put("tags", g.getTags());
		Block block = jrp.createBlock(theDoc, "paragraph", g.getDescription());
		theDoc.getBlocks().add(block);
	}

	@Override
	protected String convertObjectName(String documentTitle) {
		return convertObjectName(documentTitle, tgtPrj.FIRST_LAYER);
	}

	private String convertObjectName(String documentTitle, String layer) {
		return tgtPrj.getDir(layer).getAbsolutePath() + File.separator + documentTitle.replace(",", "")
				+ tgtPrj.getFileExt(layer);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertElements(ConvertibleObject object) throws Exception {

	}

	private void convertSectionsToScenarios(MBTGraph<MBTVertex, MBTEdge> g, Section scenario) {

		pathCnt++;
		g.addPath(String.valueOf(pathCnt), scenario.getTitle(), convertSectionAttributesToTags(scenario),
				convertSectionTextToDescription(scenario));
		ArrayList<ListItem> steps = convertBlocksToSteps(scenario);
		g.createEdgeWithVertices(g.getStartVertex().getLabel(), steps.getFirst().getText(), "",
				String.valueOf(pathCnt));
		for (int i = 0; i < steps.size(); i++) {
			String source = steps.get(i).getText();
			String target;
			if (i == steps.size() - 1) {
				target = g.getEndVertex().getLabel();
			} else {
				target = steps.get(i + 1).getText();
			}
			g.createEdgeWithVertices(source, target, "", String.valueOf(pathCnt));
			convertTableToGraph(steps.get(i), scenario.getTitle());
		}
	}

	private ArrayList<ListItem> convertBlocksToSteps(Section scenario) {
		ArrayList<ListItem> steps = new ArrayList<ListItem>();
		for (StructuralNode block : scenario.getBlocks()) {
			if (block instanceof List) {
				for (StructuralNode step : ((List) block).getItems()) {
					steps.add((ListItem) step);
				}
			} else if (block instanceof Table) {
				// So this is a hack to reduce code changes for now. Not sure if this will come
				// back to bite me. What I did learn is that I can read an empty adoc file and
				// then dynamically create the sections :)
				steps.getLast().getBlocks().add(block);
			}
		}
		return steps;
	}

	private String convertSectionAttributesToTags(StructuralNode section) {
		String tags = (String) section.getAttributes().get("tags");
		if (tags == null) {
			return "";
		} else {
			return tags;
		}
	}

	private String convertSectionTextToDescription(StructuralNode section) {
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

	private void convertTableToGraph(ListItem step, String scenarioTitle) {
		for (StructuralNode block : step.getBlocks()) {
			if (block instanceof Table) {
				JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj
						.createObject(convertObjectName(step.getText(), tgtPrj.SECOND_LAYER));
				MBTGraph<MBTVertex, MBTEdge> fieldGraph = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
				fieldGraph.setName(step.getText());
				Table table = (Table) block;
				MBTVertex lastVertex = fieldGraph.getStartVertex();
				String lastEdgeLabel = "";
				int rowCnt = table.getBody().size();
				for (int i = 0; i < rowCnt; i++) {
					Row row = table.getBody().get(i);
					int cellCnt = row.getCells().size();
					for (int j = 0; j < cellCnt; j++) {
						MBTVertex newVertex = fieldGraph
								.createVertex(i + " " + table.getHeader().get(0).getCells().get(j).getText());
						String newEdgeLabel = row.getCells().get(j).getText();
						if (i == 0 && j == 0) {
							fieldGraph.createEdge(lastVertex, newVertex, lastEdgeLabel, String.valueOf(pathCnt));
						} else {
							fieldGraph.createEdge(lastVertex, newVertex, lastEdgeLabel, String.valueOf(pathCnt));
						}
						lastVertex = newVertex;
						lastEdgeLabel = newEdgeLabel;
					}
				}
				// TODO this assumes the last column isn't blank, check it
				fieldGraph.createEdge(lastVertex, fieldGraph.getEndVertex(), lastEdgeLabel, String.valueOf(pathCnt));
			}
		}
	}
}
