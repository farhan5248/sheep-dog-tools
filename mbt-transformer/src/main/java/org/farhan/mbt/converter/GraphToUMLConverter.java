package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class GraphToUMLConverter extends ToUMLConverter {

	private JGraphTGraphWrapper srcObj;
	private JGraphTProject srcPrj;
	private UMLClassWrapper tgtObj;

	public GraphToUMLConverter(String layer, JGraphTProject source, UMLProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
	}

	private void convertBackground(MBTPathInfo abstractScenario) {
		Interaction background = tgtObj.createBackground();
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
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

	private void addExampleData(MBTPathInfo pi, Interaction scenario, String exampleTitle,
			TreeMap<String, String> exampleData) {
		EAnnotation exampleAnnotation = scenario.getEAnnotation(exampleTitle);
		String value = "";
		for (String e : exampleData.keySet()) {
			value += exampleData.get(e) + "|";
		}
		createAnnotation(scenario, exampleTitle, String.valueOf(exampleAnnotation.getDetails().size()), value);
	}

	private void convertExamples(Interaction scenarioOutline, MBTPathInfo examplesSrc) {
		EAnnotation examples = tgtObj.createExamples(scenarioOutline);
		tgtObj.setExamplesName(examples, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));

		HashMap<String, String> examplesRow = new HashMap<String, String>();
		for (MBTEdge e : srcObj.getStepList(null, examplesSrc)) {
			JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(e), srcPrj.SECOND_LAYER);
			// TODO see comment in GraphToAdocConverter
			if (stepDefObj != null) {
				examplesRow = stepDefObj.getExamplesRow(examplesSrc, examplesRow);
			}
		}
		convertExamplesRow(examples, examplesRow);
	}

	private void convertExamplesRow(EAnnotation examples, HashMap<String, String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
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
		Interaction scenario = tgtObj.createScenario();
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioName(scenario, srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(null, abstractScenario), abstractScenario);
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(MBTPathInfo abstractScenario) {

		Interaction scenarioOutline = tgtObj.createScenarioOutline();
		tgtObj.setScenarioOutlineName(scenarioOutline, srcObj.getScenarioOutlineName(abstractScenario));
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
		for (MBTEdge step : stepList) {
			convertStep(abstractScenario, step, abstractScenarioSrc);
		}
	}

	@Override
	protected Interaction addNextLayerInteraction(String methodName, Message m) {
		// TODO Delete from super class
		return null;
	}

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {
		// TODO Delete from super class

	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {
		// TODO Delete from super class

	}

	@Override
	protected void convertAbstractScenarios(ConvertibleObject theObject) throws Exception {
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

	@Override
	protected void convertMessage(Interaction anInteraction, Object anObject) throws Exception {
		// TODO Delete from super class

	}

	@Override
	protected void convertMessages(Interaction anInteraction, List<?> steps) throws Exception {
		// TODO Delete from super class

	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {
		srcObj = (JGraphTGraphWrapper) theObject;
		tgtObj = (UMLClassWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
	}

	@Override
	protected String convertObjectName(String fullName) {
		return convertObjectName(fullName, tgtPrj.FIRST_LAYER);
	}

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {
		// TODO Delete from super class
		return null;
	}

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		// TODO Delete from super class
		return null;
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void selectObjects() throws Exception {

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
