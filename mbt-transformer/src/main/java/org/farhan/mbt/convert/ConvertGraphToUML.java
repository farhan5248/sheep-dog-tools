package org.farhan.mbt.convert;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.core.ConvertToUML;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class ConvertGraphToUML extends ConvertToUML {

	private JGraphTGraphWrapper srcObj;

	private JGraphTProject srcPrj;

	private UMLClassWrapper tgtObj;

	protected void convertAbstractScenarioList() throws Exception {
		for (MBTPathInfo abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	private void convertBackground(MBTPathInfo abstractScenario) {
		Interaction background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(null, abstractScenario), abstractScenario);
		tgtObj.addBackground(background);
	}

	private void convertDataTable(Message step, MBTEdge stepSrc, MBTPathInfo abstractScenarioSrc) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(stepSrc), srcPrj.SECOND_LAYER);
		ArrayList<ArrayList<String>> dataTableCellList = stepDefObj.getDataTable(abstractScenarioSrc, "<>");
		tgtObj.createDataTable(step, dataTableCellList);
	}

	private void convertDocString(Message step, MBTEdge stepSrc) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(stepSrc), srcPrj.SECOND_LAYER);
		String content = srcPrj.getResource(stepDefObj.getDocString());
		tgtObj.createDocString(step, content);
	}

	private void convertExamples(Interaction scenarioOutline, MBTPathInfo examplesSrc) {
		EAnnotation examples = tgtObj.createExamples(scenarioOutline, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));

		HashMap<String, String> examplesRow = new HashMap<String, String>();
		for (MBTEdge e : srcObj.getStepList(null, examplesSrc)) {
			JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(e), srcPrj.SECOND_LAYER);
			if (stepDefObj != null) {
				examplesRow = stepDefObj.getExamplesRow(examplesSrc, examplesRow);
			}
		}
		convertExamplesRow(examples, examplesRow);
	}

	private void convertExamplesRow(EAnnotation examples, HashMap<String, String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject theObject) throws Exception {
		srcObj = (JGraphTGraphWrapper) theObject;
		tgtObj = (UMLClassWrapper) tgtPrj.createObject(convertFeatureName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	protected String convertFeatureName(String fullName) {
		return convertObjectName(fullName, tgtPrj.FIRST_LAYER);
	}

	private String convertObjectName(String fullName, String layer) {
		String qualifiedName = fullName.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + layer + qualifiedName;
		return qualifiedName;
	}

	private void convertScenario(MBTPathInfo abstractScenario) {
		Interaction scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(null, abstractScenario), abstractScenario);
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(MBTPathInfo abstractScenario) {

		Interaction scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(null, abstractScenario), abstractScenario);

		ArrayList<MBTPathInfo> examplesList = srcObj.getExamplesList(abstractScenario);
		for (MBTPathInfo examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	private void convertStep(Interaction abstractScenario, MBTEdge stepSrc, MBTPathInfo abstractScenarioSrc) {
		Message step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(stepSrc), srcPrj.SECOND_LAYER);
		if (stepDefObj != null) {
			if (stepDefObj.hasDocString(stepSrc)) {
				convertDocString(step, stepSrc);
			} else if (stepDefObj.hasDataTable(stepSrc)) {
				convertDataTable(step, stepSrc, abstractScenarioSrc);
			}
		}
	}

	private void convertStepList(Interaction abstractScenario, ArrayList<MBTEdge> stepList,
			MBTPathInfo abstractScenarioSrc) {
		// TODO this is a temp hack until the PathInfo is changed
		if (!abstractScenario.getMessages().isEmpty()) {
			return;
		}
		for (MBTEdge step : stepList) {
			convertStep(abstractScenario, step, abstractScenarioSrc);
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void initProjects() {
		srcPrj = new JGraphTProject();
		tgtPrj = new UMLProject();
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
		files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.SECOND_LAYER),
				srcPrj.getFileExt(srcPrj.SECOND_LAYER));
		srcPrj.getObjects(srcPrj.SECOND_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

}
