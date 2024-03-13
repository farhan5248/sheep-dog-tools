package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Document;
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

	// This is used to assign each testcase/path/scenario/scenario outline example
	// row with a unique ID which is then stored in the collection of path
	// information in the graph
	private int pathCnt;

	public AdocToGraphConverter(String layer, AsciiDoctorProject source, JGraphTProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.pathCnt = 0;
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
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) theObject;
		Document src = (Document) adaw.get();
		tgtWrp = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(adaw.getFile().getAbsolutePath()));
		MBTGraph<MBTVertex, MBTEdge> tgt = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		tgt.setName(src.getTitle());
		tgt.setTags(convertSectionAttributesToTags(src));
		for (StructuralNode block : src.getBlocks()) {
			if (!(block instanceof Section)) {
				tgt.setDescription(convertSectionTextToDescription(block));
			}
		}
	}

	@Override
	protected void convertElements(ConvertibleObject object) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) object;
		Document src = (Document) adaw.get();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		for (StructuralNode block : src.getBlocks()) {
			if (block instanceof Section) {
				Section scenario = (Section) block;
				ArrayList<Section> steps = convertBlocksToSteps(scenario, true);
				ArrayList<Section> examples = convertBlocksToSteps(scenario, false);
				String tags = convertSectionAttributesToTags(scenario);
				String description = convertSectionTextToDescription(scenario);
				if (examples.isEmpty()) {
					convertSectionToPath(g, steps, scenario.getTitle(), tags, description,
							new HashMap<String, String>());
				} else {
					for (Section example : examples) {
						ArrayList<HashMap<String, String>> replacements = convertExamplesToMaps(example);
						for (int i = 0; i < replacements.size(); i++) {
							convertSectionToPath(g, steps,
									scenario.getTitle() + "/" + example.getTitle() + "/" + String.valueOf(i), tags,
									description, replacements.get(i));

						}
					}
				}
			}
		}
	}

	@Override
	protected String convertObjectName(String fileName) {
		// TODO add the layer parameter to the super class method
		return convertObjectName(fileName, tgtPrj.FIRST_LAYER);
	}

	private String convertObjectName(String fileName, String layer) {
		// TODO make this a supertype method but with the additional delimiter parameter
		// which can be :: or File.separator
		String qualifiedName = fileName.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath() + File.separator, "");
		qualifiedName = tgtPrj.getDir(layer) + File.separator + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertSectionToPath(MBTGraph<MBTVertex, MBTEdge> g, ArrayList<Section> steps, String title,
			String tags, String description, HashMap<String, String> replacements) {

		g.addPath(String.valueOf(pathCnt), title, tags, description, replacements.keySet());
		g.createEdgeWithVertices(g.getStartVertex().getLabel(), steps.getFirst().getTitle(), "",
				String.valueOf(pathCnt));
		for (int i = 0; i < steps.size(); i++) {
			String source = steps.get(i).getTitle();
			String target;
			if (i == steps.size() - 1) {
				target = g.getEndVertex().getLabel();
			} else {
				target = steps.get(i + 1).getTitle();
			}
			g.createEdgeWithVertices(source, target, "", String.valueOf(pathCnt));
			convertTableToGraph(steps.get(i), title, replacements);
		}
		pathCnt++;
	}

	private ArrayList<Section> convertBlocksToSteps(Section scenario, boolean skipExamples) {
		ArrayList<Section> steps = new ArrayList<Section>();
		for (StructuralNode block : scenario.getBlocks()) {
			if (block instanceof Section) {
				if (block.getAttributes().get("examples") != null && !skipExamples) {
					steps.add((Section) block);
				} else if (block.getAttributes().get("examples") == null && skipExamples) {
					steps.add((Section) block);
				}
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

	private ArrayList<HashMap<String, String>> convertExamplesToMaps(Section examples) {
		ArrayList<HashMap<String, String>> replacements = new ArrayList<HashMap<String, String>>();
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				Table table = (Table) block;
				ArrayList<String> paramNames = new ArrayList<String>();
				for (Cell cell : table.getHeader().getFirst().getCells()) {
					paramNames.add(cell.getText());
				}
				int rowCnt = table.getBody().size();
				for (int i = 0; i < rowCnt; i++) {
					Row row = table.getBody().get(i);
					HashMap<String, String> map = new HashMap<String, String>();
					int cellCnt = row.getCells().size();
					for (int j = 0; j < cellCnt; j++) {
						map.put(paramNames.get(j), row.getCells().get(j).getText());
					}
					replacements.add(map);
				}
			}
		}
		return replacements;
	}

	private void convertTableToGraph(Section step, String scenarioTitle, HashMap<String, String> replacements) {
		for (StructuralNode block : step.getBlocks()) {
			if (block instanceof Table) {
				JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj
						.createObject(convertObjectName(step.getTitle(), tgtPrj.SECOND_LAYER));
				MBTGraph<MBTVertex, MBTEdge> fieldGraph = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
				fieldGraph.setName(step.getTitle());
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
						String newEdgeLabel = replaceWithExampleData(replacements, row.getCells().get(j).getText());
						fieldGraph.createEdge(lastVertex, newVertex, lastEdgeLabel, String.valueOf(pathCnt));
						lastVertex = newVertex;
						lastEdgeLabel = newEdgeLabel;
					}
				}
				fieldGraph.createEdge(lastVertex, fieldGraph.getEndVertex(), lastEdgeLabel, String.valueOf(pathCnt));
			}
		}
	}

	private String replaceWithExampleData(HashMap<String, String> replacements, String text) {
		if (text.startsWith("&lt;")) {
			for (String key : replacements.keySet()) {
				String value = replacements.get(key);
				if (text.contentEquals("&lt;" + key + "&gt;")) {
					return replacements.get(key);
				}
			}
		}
		return text;
	}

}
