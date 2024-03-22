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
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.graph.MBTVertex;

public class AdocToGraphConverter extends ToGraphConverter {

	private JGraphTGraphWrapper tgtObj;
	private AsciiDoctorProject srcPrj;

	// This is used to assign each testcase or testcase data
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
	protected void selectFeatures() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	@Override
	protected void convertFeature(ConvertibleObject srcObj) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) srcObj;
		tgtObj = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(adaw.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(adaw.getFeatureName());
		tgtObj.setFeatureTags(adaw.getFeatureTags());
		tgtObj.setFeatureDescription(adaw.getFeatureDescription());
	}

	@Override
	protected void convertAbstractScenarios(ConvertibleObject object) throws Exception {
		AsciiDoctorAdocWrapper adaw = (AsciiDoctorAdocWrapper) object;
		MBTVertex startVertex = tgtObj.getStartVertex();
		for (Section abstractScenario : adaw.getAbstractScenarios()) {
			// TODO push these three into createBackground, Scenario etc, there shouldn't be
			// any public AbstractScenario methods
			ArrayList<Section> steps = adaw.getSteps(abstractScenario);
			String tags = adaw.getAbstractScenarioTags(abstractScenario);
			String description = adaw.getAbstractScenarioDescription(abstractScenario);
			if (!adaw.isScenarioOutline(abstractScenario)) {
				if (adaw.isBackground(abstractScenario)) {
					convertBackground(startVertex, steps, abstractScenario.getTitle(), description);
					// TODO this is a temp hack, this should be hidden in the wrapper. Save the
					// background end vertex there in the add to list
					startVertex = tgtObj.getBackgroundEndVertex();

				} else {
					convertScenario(startVertex, steps, abstractScenario.getTitle(), tags, description);
				}
			} else {
				ArrayList<Section> examples = adaw.getExamples(abstractScenario);
				for (Section example : examples) {
					ArrayList<HashMap<String, String>> replacements = getTestCaseData(example);
					for (int i = 0; i < replacements.size(); i++) {
						convertScenarioOutline(startVertex, steps,
								abstractScenario.getTitle() + "/" + example.getTitle() + "/" + String.valueOf(i), tags,
								description, replacements.get(i));

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

	private void convertBackground(MBTVertex startVertex, ArrayList<Section> steps, String name, String description) {
		MBTPathInfo background = tgtObj.createBackground(pathCnt);
		// TODO rename these methods to setBackgroundName etc
		tgtObj.setAbstractScenarioName(background, name);
		tgtObj.setAbstractScenarioDescription(background, description);
		convertSteps(startVertex, steps, name, new HashMap<String, String>());
		// TODO make this addBackground and that's when to remove the last edge and save
		// the last vertex
		tgtObj.addAbstractScenario(background);
	}

	private void convertScenario(MBTVertex startVertex, ArrayList<Section> steps, String name, String tags,
			String description) {
		MBTPathInfo scenario = tgtObj.createScenario(pathCnt);
		// TODO rename these methods to setScenarioName etc
		tgtObj.setAbstractScenarioName(scenario, name);
		tgtObj.setAbstractScenarioDescription(scenario, description);
		tgtObj.setAbstractScenarioTags(scenario, tags);
		convertSteps(startVertex, steps, name, new HashMap<String, String>());
		tgtObj.addAbstractScenario(scenario);
	}

	private void convertScenarioOutline(MBTVertex startVertex, ArrayList<Section> steps, String name, String tags,
			String description, HashMap<String, String> outlineParameterReplacements) {
		MBTPathInfo scenarioOutline = tgtObj.createScenarioOutline(pathCnt);
		// TODO rename these methods to setScenarioOutlineName etc
		tgtObj.setAbstractScenarioName(scenarioOutline, name);
		tgtObj.setAbstractScenarioTags(scenarioOutline, tags);
		tgtObj.setAbstractScenarioDescription(scenarioOutline, description);
		tgtObj.setAbstractScenarioOutlineParameters(scenarioOutline, outlineParameterReplacements.keySet());
		convertSteps(startVertex, steps, name, outlineParameterReplacements);
		tgtObj.addAbstractScenario(scenarioOutline);
	}

	private void convertSteps(MBTVertex startVertex, ArrayList<Section> steps, String name,
			HashMap<String, String> outlineParameterReplacements) {
		// TODO maybe all the graph start/end stuff should be hidden like it is for
		// message occurence specification
		convertStep(startVertex.getLabel(), steps.getFirst().getTitle());
		for (int i = 0; i < steps.size() - 1; i++) {
			convertStep(steps.get(i).getTitle(), steps.get(i + 1).getTitle());
			convertTestStepData(steps.get(i), name, outlineParameterReplacements);
		}
		convertStep(steps.getLast().getTitle(), tgtObj.getEndVertex().getLabel());
		convertTestStepData(steps.getLast(), name, outlineParameterReplacements);
		pathCnt++;
	}

	private ArrayList<HashMap<String, String>> getTestCaseData(Section examples) {
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

	private void convertStep(String source, String target) {
		tgtObj.createStep(source, target, pathCnt);
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
