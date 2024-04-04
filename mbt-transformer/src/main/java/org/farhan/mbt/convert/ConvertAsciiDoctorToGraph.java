package org.farhan.mbt.convert;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.asciidoctor.ast.Section;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertToGraph;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.MBTPathInfo;

public class ConvertAsciiDoctorToGraph extends ConvertToGraph {

	private AsciiDoctorAdocWrapper srcObj;

	private AsciiDoctorProject srcPrj;

	private JGraphTGraphWrapper tgtObj;

	protected void convertAbstractScenarioList() throws Exception {
		for (Section abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	private void convertBackground(Section abstractScenario) {
		MBTPathInfo background = tgtObj.createBackground();
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addBackground(background);
	}

	private void convertDataTable(MBTPathInfo abstractScenario, Section step, HashMap<String, String> examplesRow) {
		String name = srcObj.getStep(step);
		JGraphTGraphWrapper stepDefObj = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertObjectName(name, tgtPrj.SECOND_LAYER));
		stepDefObj.setStepDefinitionName(name);
		ArrayList<ArrayList<String>> dataTableCellList = srcObj.getDataTable(step, examplesRow);
		stepDefObj.createDataTable(abstractScenario, dataTableCellList);
	}

	private void convertDocString(MBTPathInfo abstractScenario, Section step) {
		String name = srcObj.getStep(step);
		JGraphTGraphWrapper stepDefObj = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertObjectName(name, tgtPrj.SECOND_LAYER));
		stepDefObj.setStepDefinitionName(name);
		String fileName = tgtPrj.createResource(name, srcObj.getDocString(step));
		stepDefObj.createDocString(abstractScenario, fileName);
	}

	private void convertExamples(Section abstractScenario, Section examples) {
		ArrayList<HashMap<String, String>> examplesRows = srcObj.getExamplesRowList(examples);
		for (int rowNum = 0; rowNum < examplesRows.size(); rowNum++) {
			HashMap<String, String> examplesRow = examplesRows.get(rowNum);
			convertExamplesRow(abstractScenario, examples, examplesRow, rowNum);
		}
	}

	private void convertExamplesRow(Section abstractScenario, Section examplesSrc, HashMap<String, String> examplesRow,
			int rowNum) {
		// TODO maybe have one named path (coverage) per example
		MBTPathInfo scenarioOutline = tgtObj.createScenarioOutline();
		tgtObj.setScenarioOutlineName(scenarioOutline, srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));

		MBTPathInfo examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(scenarioOutline, srcObj.getExamplesTable(examplesRow));
		// TODO derive the rowNum by getting a count on all the existing rows
		tgtObj.createExamplesRow(examples, rowNum);
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), examplesRow);
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	@Override
	protected void convertFeature(ConvertibleObject anObject) throws Exception {
		srcObj = (AsciiDoctorAdocWrapper) anObject;
		tgtObj = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

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

	private void convertScenario(Section abstractScenario) {
		MBTPathInfo scenario = tgtObj.createScenario();
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioName(scenario, srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(Section abstractScenario) {
		ArrayList<Section> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Section examples : examplesList) {
			convertExamples(abstractScenario, examples);
		}
	}

	private void convertStep(MBTPathInfo abstractScenario, Section step) {
		tgtObj.createStep(abstractScenario, srcObj.getStep(step));
	}

	private void convertStepList(MBTPathInfo abstractScenario, ArrayList<Section> stepList,
			HashMap<String, String> examplesRow) {
		for (Section step : stepList) {
			convertStep(abstractScenario, step);
			if (srcObj.hasDocString(step)) {
				convertDocString(abstractScenario, step);
			} else if (srcObj.hasDataTable(step)) {
				convertDataTable(abstractScenario, step, examplesRow);
			}
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void initProjects() throws Exception {
		srcPrj = new AsciiDoctorProject();
		tgtPrj = new JGraphTProject();
	}

	@Override
	protected void save() throws Exception {
		tgtPrj.save();
	}

	@Override
	protected void loadFeatures() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

}
