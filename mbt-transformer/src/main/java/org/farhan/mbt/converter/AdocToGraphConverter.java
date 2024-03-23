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

	// This is used to assign each testcase or testcase data
	// row with a unique ID which is then stored in the collection of path
	// information in the graph
	private int pathCnt;
	private AsciiDoctorProject srcPrj;

	private JGraphTGraphWrapper tgtObj;

	public AdocToGraphConverter(String layer, AsciiDoctorProject source, JGraphTProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.pathCnt = 0;
	}

	@Override
	protected void convertAbstractScenarios(ConvertibleObject object) throws Exception {
		AsciiDoctorAdocWrapper srcObj = (AsciiDoctorAdocWrapper) object;
		for (Section abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(srcObj, abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(srcObj, abstractScenario);
			} else {
				convertScenario(srcObj, abstractScenario);
			}
		}
	}

	@Override
	protected void convertFeature(ConvertibleObject anObject) throws Exception {
		AsciiDoctorAdocWrapper srcObj = (AsciiDoctorAdocWrapper) anObject;
		tgtObj = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
	}

	@Override
	protected String convertObjectName(String fileName) {
		// TODO add the layer parameter to the super class method
		return convertFeatureName(fileName, tgtPrj.FIRST_LAYER);
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

	private void convertBackground(AsciiDoctorAdocWrapper srcObj, Section abstractScenario) {
		MBTPathInfo background = tgtObj.createBackground(pathCnt);
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addBackground(background);
	}

	private void convertExamples(AsciiDoctorAdocWrapper srcObj, Section abstractScenario, Section examples) {
		ArrayList<HashMap<String, String>> examplesRows = srcObj.getExamplesRows(examples);
		for (int rowNum = 0; rowNum < examplesRows.size(); rowNum++) {
			HashMap<String, String> examplesRow = examplesRows.get(rowNum);
			convertExamplesRow(srcObj, abstractScenario, examples, examplesRow, rowNum);
		}
	}

	private void convertExamplesRow(AsciiDoctorAdocWrapper srcObj, Section abstractScenario, Section example,
			HashMap<String, String> examplesRow, int rowNum) {
		// TODO have one named path (coverage) per example to save the name
		// have multiple indices for each row
		// TODO maybe pathCnt shouldn't be tracked here but in srcObj instead
		MBTPathInfo scenarioOutline = tgtObj.createScenarioOutline(pathCnt);
		tgtObj.setScenarioOutlineName(scenarioOutline, srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		tgtObj.setScenarioOutlineParameters(scenarioOutline, srcObj.getScenarioOutlineParameters(examplesRow));

		MBTPathInfo examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(example));
		tgtObj.setExamplesRowName(tgtObj.createExamplesRow(examples), srcObj.getExamplesRowName(rowNum));

		convertStepList(srcObj.getStepList(abstractScenario), examplesRow);
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	private String convertFeatureName(String fileName, String layer) {
		// TODO make this a supertype method but with the additional delimiter parameter
		// which can be :: or File.separator
		String qualifiedName = fileName.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath() + File.separator, "");
		qualifiedName = tgtPrj.getDir(layer) + File.separator + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertScenario(AsciiDoctorAdocWrapper srcObj, Section abstractScenario) {
		MBTPathInfo scenario = tgtObj.createScenario(pathCnt);
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioName(scenario, srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(AsciiDoctorAdocWrapper srcObj, Section abstractScenario) {
		ArrayList<Section> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Section examples : examplesList) {
			convertExamples(srcObj, abstractScenario, examples);
		}
	}

	private void convertStep(String source, String target) {
		tgtObj.createStep(source, target, pathCnt);
	}

	private void convertDataTable(Section step, HashMap<String, String> replacements) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				Table table = (Table) sn;
				// TODO move this inside tgtObj and srcObj
				MBTGraph<MBTVertex, MBTEdge> fieldGraph = createGraph(step.getTitle());
				for (int i = 0; i < table.getBody().size(); i++) {
					for (int j = 0; j < table.getBody().get(i).getCells().size(); j++) {
						createTestStepData(fieldGraph, table, i, j, replacements);
					}
				}
				createTestStepData(fieldGraph, table, table.getBody().size() - 1,
						table.getHeader().get(0).getCells().size(), replacements);
			} else if (sn instanceof Block) {
				// TODO put this in convertDocString
				Block block = (Block) sn;
				MBTGraph<MBTVertex, MBTEdge> fieldGraph = createGraph(step.getTitle());
				String fileName = tgtPrj.createResource(step.getTitle(), block.getSource());
				createDataTable(fieldGraph, "Content", fileName);
			}
		}
	}

	private void convertStepList(ArrayList<Section> steps, HashMap<String, String> outlineParameterReplacements) {
		convertStep(null, steps.getFirst().getTitle());
		for (int i = 0; i < steps.size() - 1; i++) {
			convertStep(steps.get(i).getTitle(), steps.get(i + 1).getTitle());
			convertDataTable(steps.get(i), outlineParameterReplacements);
		}
		convertStep(steps.getLast().getTitle(), null);
		convertDataTable(steps.getLast(), outlineParameterReplacements);
		pathCnt++;
	}

	private MBTGraph<MBTVertex, MBTEdge> createGraph(String title) {
		// TODO move this inside tgtObj
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertFeatureName(title, tgtPrj.SECOND_LAYER));
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		fieldGraph.setName(title);
		return fieldGraph;
	}

	private void createDataTable(MBTGraph<MBTVertex, MBTEdge> g, String vertexLabel, String edgeLabel) {
		// TODO this won't be needed once the wrapper is managing the steps below
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
