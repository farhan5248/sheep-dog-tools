package org.farhan.mbt.convert;

import java.io.File;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Step;
import org.farhan.mbt.core.ConvertToCode;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.StepWrapper;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumber extends ConvertToCode {

	private String lastComponent = "InitialComponent";

	private UMLClassWrapper srcObj;

	private UMLProject srcPrj;

	private CucumberFeatureWrapper tgtObj;

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
		Background background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), abstractScenario);
		tgtObj.addBackground(background);
	};

	private void convertStepTable(Step step, Message srcStep) {
		tgtObj.createStepTable(step, srcObj.getStepTable(srcStep));
		getTgtObj2(srcStep).createStepTable(srcObj.getStep(srcStep), srcObj.getStepTable(srcStep));
		getTgtObj3(srcStep).createStepTable(srcObj.getStep(srcStep), srcObj.getStepTable(srcStep));
	}

	private void convertDocString(Step step, Message srcStep) {
		tgtObj.createDocString(step, srcObj.getDocString(srcStep));
		getTgtObj2(srcStep).createDocString(srcObj.getStep(srcStep));
		getTgtObj3(srcStep).createDocString(srcObj.getStep(srcStep));
	}

	private void convertExamples(ScenarioOutline scenarioOutline, EAnnotation examplesSrc) {
		Examples examples = tgtObj.createExamples(scenarioOutline, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (ArrayList<String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	private void convertExamplesRow(Examples examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject theObject) throws Exception {
		srcObj = (UMLClassWrapper) theObject;
		tgtObj = (CucumberFeatureWrapper) tgtPrj.createObject(convertFeatureName(srcObj.getQualifiedName()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	@Override
	protected String convertFeatureName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + tgtPrj.FIRST_LAYER, tgtPrj.getDir(tgtPrj.FIRST_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.FIRST_LAYER);
		return pathName;
	}

	private void convertScenario(Interaction srcScenario) {
		Scenario scenario = tgtObj.createScenario(srcObj.getScenarioName(srcScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(srcScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(srcScenario));
		convertStepList(scenario, srcObj.getStepList(srcScenario), srcScenario);
		tgtObj.addScenario(scenario);
	}

	private void convertScenarioOutline(Interaction abstractScenario) {

		ScenarioOutline scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), abstractScenario);
		ArrayList<EAnnotation> examplesList = srcObj.getExamplesList(abstractScenario);
		for (EAnnotation examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
		tgtObj.addScenarioOutline(scenarioOutline);
	}

	private void convertStep(AbstractScenario abstractScenario, Message srcStep) {
		Step tgtStep = tgtObj.createStep(abstractScenario, srcObj.getStep(srcStep));
		getTgtObj2(srcStep).createStep(srcObj.getStep(srcStep));
		getTgtObj3(srcStep).createStep(srcObj.getStep(srcStep));
		if (srcObj.hasDocString(srcStep)) {
			convertDocString(tgtStep, srcStep);
		} else if (srcObj.hasStepTable(srcStep)) {
			convertStepTable(tgtStep, srcStep);
		}
	}

	private void convertStepList(AbstractScenario abstractScenario, ArrayList<Message> stepList,
			Interaction srcScenario) {
		for (Message step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	private String getComponentName(String step) {
		String name = StepWrapper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			name = Utilities.removeDelimiterAndCapitalize(name, "\\.");
			name = Utilities.removeDelimiterAndCapitalize(name, "\\-");
			name = Utilities.removeDelimiterAndCapitalize(name, " ");
			lastComponent = name;
		}
		return name;
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	private String getObjectName(String step) {
		String name = StepWrapper.getObjectName(step);
		String nameParts[] = name.split("/");
		name = nameParts[nameParts.length - 1];
		name = Utilities.removeDelimiterAndCapitalize(name, "\\.");
		name = Utilities.removeDelimiterAndCapitalize(name, "\\-");
		name = Utilities.removeDelimiterAndCapitalize(name, " ");
		name = Utilities.upperFirst(name);
		return name;
	}

	private String getStepDefName(String stepName) {
		String objectName = getObjectName(stepName);
		String objectType = Utilities.upperFirst(StepWrapper.getObjectType(stepName));
		String componentName = getComponentName(stepName);
		return tgtPrj.getDir(tgtPrj.SECOND_LAYER) + File.separator + componentName.toLowerCase() + File.separator
				+ Utilities.upperFirst(componentName) + objectName + objectType + "Steps.java";
	}

	private String getStepObjName(String stepName) {
		String objectName = getObjectName(stepName);
		String objectType = Utilities.upperFirst(StepWrapper.getObjectType(stepName));
		String componentName = getComponentName(stepName);
		return tgtPrj.getDir(tgtPrj.THIRD_LAYER) + File.separator + componentName.toLowerCase() + File.separator
				+ objectName + objectType + ".java";
	}

	private CucumberJavaWrapper getTgtObj2(Message srcStep) {
		CucumberJavaWrapper tgtStepDefObj = (CucumberJavaWrapper) tgtPrj
				.createObject(getStepDefName(srcObj.getStep(srcStep)));
		tgtStepDefObj.load();
		return tgtStepDefObj;
	}

	private CucumberJavaWrapper getTgtObj3(Message srcStep) {
		CucumberJavaWrapper tgtStepDefObj = (CucumberJavaWrapper) tgtPrj
				.createObject(getStepObjName(srcObj.getStep(srcStep)));
		tgtStepDefObj.load();
		return tgtStepDefObj;
	}

	@Override
	protected void initProjects() throws Exception {

		srcPrj = new UMLProject();
		tgtPrj = new CucumberProject();
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
