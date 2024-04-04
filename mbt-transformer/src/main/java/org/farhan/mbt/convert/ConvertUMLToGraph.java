package org.farhan.mbt.convert;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.core.ConvertToGraph;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToGraph extends ConvertToGraph {

	private UMLClassWrapper srcObj;

	private UMLProject srcPrj;

	private JGraphTGraphWrapper tgtObj;

	protected void convertAbstractScenarioList() throws Exception {
		for (Interaction abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	private void convertBackground(Interaction abstractScenario) {
		MBTPathInfo background = tgtObj.createBackground();
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addBackground(background);
	}

	private void convertDataTable(MBTPathInfo abstractScenario, Message step, HashMap<String, String> examplesRow) {
		String name = srcObj.getStep(step);
		JGraphTGraphWrapper stepDefObj = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertObjectName(name, tgtPrj.SECOND_LAYER));
		stepDefObj.setStepDefinitionName(name);
		ArrayList<ArrayList<String>> dataTableCellList = srcObj.getDataTable(step, examplesRow);
		stepDefObj.createDataTable(abstractScenario, dataTableCellList);
	}

	private void convertDocString(MBTPathInfo abstractScenario, Message step) {
		String name = srcObj.getStep(step);
		JGraphTGraphWrapper stepDefObj = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertObjectName(name, tgtPrj.SECOND_LAYER));
		stepDefObj.setStepDefinitionName(name);
		String fileName = tgtPrj.createResource(name, srcObj.getDocString(step));
		stepDefObj.createDocString(abstractScenario, fileName);
	}

	private void convertExamples(Interaction abstractScenario, EAnnotation examples) {

		ArrayList<HashMap<String, String>> examplesRows = srcObj.getExamplesRowList(examples);
		for (int rowNum = 0; rowNum < examplesRows.size(); rowNum++) {
			HashMap<String, String> examplesRow = examplesRows.get(rowNum);
			convertExamplesRow(abstractScenario, examples, examplesRow, rowNum);
		}
	}

	private void convertExamplesRow(Interaction abstractScenario, EAnnotation examplesSrc,
			HashMap<String, String> examplesRow, int rowNum) {
		MBTPathInfo scenarioOutline = tgtObj.createScenarioOutline();
		tgtObj.setScenarioOutlineName(scenarioOutline, srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));

		MBTPathInfo examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(scenarioOutline, srcObj.getExamplesTable(examplesRow));
		tgtObj.createExamplesRow(examples, rowNum);
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), examplesRow);
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	@Override
	protected void convertFeature(ConvertibleObject anObject) throws Exception {
		srcObj = (UMLClassWrapper) anObject;
		tgtObj = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(srcObj.getQualifiedName()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	protected String convertObjectName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + tgtPrj.FIRST_LAYER, tgtPrj.getDir(tgtPrj.FIRST_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.FIRST_LAYER);
		return pathName;
	}

	private String convertObjectName(String name, String layer) {
		String qualifiedName = name.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath() + File.separator, "");
		qualifiedName = tgtPrj.getDir(layer) + File.separator + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertScenario(Interaction abstractScenario) {
		MBTPathInfo scenario = tgtObj.createScenario();
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioName(scenario, srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario), new HashMap<String, String>());
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(Interaction abstractScenario) {
		ArrayList<EAnnotation> examplesList = srcObj.getExamplesList(abstractScenario);
		for (EAnnotation examples : examplesList) {
			convertExamples(abstractScenario, examples);
		}
	}

	private void convertStep(MBTPathInfo abstractScenario, Message step) {
		tgtObj.createStep(abstractScenario, srcObj.getStep(step));
	}

	private void convertStepList(MBTPathInfo abstractScenario, ArrayList<Message> stepList,
			HashMap<String, String> examplesRow) {
		for (Message step : stepList) {
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
		srcPrj = new UMLProject();
		tgtPrj = new JGraphTProject();
	}

	@Override
	protected void save() throws Exception {
		tgtPrj.save();
	}

	@Override
	protected void loadFeatures() throws Exception {
		srcPrj.load();
	}
}
