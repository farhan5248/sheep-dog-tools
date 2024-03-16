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
	protected ArrayList<ConvertibleObject> getSourceObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void selectSourceObjects() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) theObject;
		Document src = (Document) adaw.get();
		tgtWrp = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(adaw.getFile().getAbsolutePath()));
		MBTGraph<MBTVertex, MBTEdge> tgt = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		tgt.setName(src.getTitle());
		tgt.setTags(getTestCaseProperties(src));
		for (StructuralNode block : src.getBlocks()) {
			if (!(block instanceof Section)) {
				tgt.setDescription(getTestCaseDecription(block));
			}
		}
	}

	@Override
	protected void convertElements(ConvertibleObject object) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) object;
		Document src = (Document) adaw.get();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		MBTVertex startVertex = g.getStartVertex();
		for (StructuralNode block : src.getBlocks()) {
			if (block instanceof Section) {
				Section scenario = (Section) block;
				ArrayList<Section> steps = getTestStep(scenario);
				ArrayList<Section> examples = getTestCaseData(scenario);
				String tags = getTestCaseProperties(scenario);
				String description = getTestCaseDecription(scenario);
				if (examples.isEmpty()) {
					convertTestCase(g, startVertex, steps, scenario.getTitle(), tags, description,
							new HashMap<String, String>());
					if (scenario.getAttributes().get("background") != null) {
						// backgrounds don't have tags so use that field for now
						g.getPathInfo().getFirst().setTags("background");
						// the only edge going into the end vertex is the last background element
						MBTEdge edge = null;
						for (MBTEdge e : g.incomingEdgesOf(g.getEndVertex())) {
							startVertex = g.getEdgeSource(e);
							edge = e;
						}
						g.removeEdge(edge);
					}
				} else {
					for (Section example : examples) {
						ArrayList<HashMap<String, String>> replacements = convertTestCaseData(example);
						for (int i = 0; i < replacements.size(); i++) {
							convertTestCase(g, startVertex, steps,
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

	private void convertTestCase(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex startVertex, ArrayList<Section> steps,
			String title, String tags, String description, HashMap<String, String> replacements) {

		g.addPath(String.valueOf(pathCnt), title, tags, description, replacements.keySet());
		convertTestStep(g, startVertex.getLabel(), steps.getFirst().getTitle());
		for (int i = 0; i < steps.size() - 1; i++) {
			convertTestStep(g, steps.get(i).getTitle(), steps.get(i + 1).getTitle());
			convertTestStepData(steps.get(i), title, replacements);
		}
		convertTestStep(g, steps.getLast().getTitle(), g.getEndVertex().getLabel());
		convertTestStepData(steps.getLast(), title, replacements);
		pathCnt++;
	}

	private ArrayList<HashMap<String, String>> convertTestCaseData(Section examples) {
		// TODO put this inside getTestCaseData. All converters should return a list of
		// maps like this or something consistent
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

	private void convertTestStep(MBTGraph<MBTVertex, MBTEdge> g, String source, String target) {
		g.createEdgeWithVertices(source, target, "", String.valueOf(pathCnt));
	}

	private void convertTestStepData(Section step, String scenarioTitle, HashMap<String, String> replacements) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				Table table = (Table) sn;
				MBTGraph<MBTVertex, MBTEdge> fieldGraph = createGraph(step.getTitle());
				for (int i = 0; i < table.getBody().size(); i++) {
					for (int j = 0; j < table.getBody().get(i).getCells().size(); j++) {
						createTestStepData(fieldGraph, table, i, j, replacements);
					}
				}
				createTestStepData(fieldGraph, table, table.getBody().size() - 1,
						table.getHeader().get(0).getCells().size(), replacements);
			} else if (sn instanceof Block) {
				Block block = (Block) sn;
				MBTGraph<MBTVertex, MBTEdge> fieldGraph = createGraph(step.getTitle());
				String fileName = tgtPrj.createResource(step.getTitle(), block.getSource());
				createTestStepData(fieldGraph, "Content", fileName);
			}
		}
	}

	private void createTestStepData(MBTGraph<MBTVertex, MBTEdge> g, String vertexLabel, String edgeLabel) {
		g.createEdge(g.getStartVertex(), g.createVertex(vertexLabel), "", String.valueOf(pathCnt));
		g.createEdge(g.getVertex(vertexLabel), g.getEndVertex(), edgeLabel, String.valueOf(pathCnt));
	}

	private MBTEdge createTestStepData(MBTGraph<MBTVertex, MBTEdge> g, Table table, int rowNum, int colNum,
			HashMap<String, String> replacements) {

		MBTVertex lastVertex;
		String lastEdgeLabel;
		if (colNum == 0) {
			if (rowNum == 0) {
				lastVertex = g.getStartVertex();
				lastEdgeLabel = "";
			} else {
				lastVertex = g.getVertex((rowNum - 1) + " " + table.getHeader().get(0).getCells().getLast().getText());
				lastEdgeLabel = table.getBody().get(rowNum - 1).getCells().getLast().getText();
			}
		} else {
			lastVertex = g.getVertex(rowNum + " " + table.getHeader().get(0).getCells().get(colNum - 1).getText());
			lastEdgeLabel = table.getBody().get(rowNum).getCells().get(colNum - 1).getText();
		}
		lastEdgeLabel = replaceWithTestCaseData(replacements, lastEdgeLabel);
		MBTVertex newVertex;
		if (colNum == table.getHeader().get(0).getCells().size()) {
			newVertex = g.getEndVertex();
		} else {
			newVertex = g.createVertex(rowNum + " " + table.getHeader().get(0).getCells().get(colNum).getText());

		}
		return g.createEdge(lastVertex, newVertex, lastEdgeLabel, String.valueOf(pathCnt));
	}

	private MBTGraph<MBTVertex, MBTEdge> createGraph(String title) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertObjectName(title, tgtPrj.SECOND_LAYER));
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		fieldGraph.setName(title);
		return fieldGraph;
	}

	private ArrayList<Section> getTestCaseData(Section scenario) {
		ArrayList<Section> steps = new ArrayList<Section>();
		for (StructuralNode block : scenario.getBlocks()) {
			if (block instanceof Section) {
				if (block.getAttributes().get("examples") != null) {
					steps.add((Section) block);
				}
			}
		}
		return steps;
	}

	private String getTestCaseProperties(StructuralNode section) {
		String tags = (String) section.getAttributes().get("tags");
		if (tags == null) {
			return "";
		} else {
			return tags;
		}
	}

	private String getTestCaseDecription(StructuralNode section) {
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

	private ArrayList<Section> getTestStep(Section testCase) {
		ArrayList<Section> steps = new ArrayList<Section>();
		for (StructuralNode testStep : testCase.getBlocks()) {
			if (testStep instanceof Section) {
				if (testStep.getAttributes().get("examples") == null) {
					steps.add((Section) testStep);
				}
			}
		}
		return steps;
	}

	private String replaceWithTestCaseData(HashMap<String, String> replacements, String text) {
		if (text.startsWith("{")) {
			for (String key : replacements.keySet()) {
				if (text.contentEquals("{" + key + "}")) {
					return replacements.get(key);
				}
			}
		}
		return text;
	}

}
