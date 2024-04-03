package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.text.CaseUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Step;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToCodeConverter;
import org.farhan.mbt.core.Validator;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class UMLToCucumberConverter extends ToCodeConverter {

	private UMLClassWrapper srcObj;
	private CucumberFeatureWrapper tgtObj;
	private CucumberProject tgtPrj;
	private String lastComponent;

	public UMLToCucumberConverter(String layer, UMLProject source, CucumberProject target) {
		// TODO won't need layer variable anymore since there's multiple layers in one
		// converter
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		lastComponent = "InitialComponent";
	}

	private void convertBackground(Interaction abstractScenario) {
		Background background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), abstractScenario);
		tgtObj.addBackground(background);
	}

	private void convertDataTable(Step step, Message srcStep) {
		tgtObj.createDataTable(step, srcObj.getDataTable(srcStep));
		// TODO perhaps tgtObj and srcObj shouldn't be class attributes. This is because
		// when there are multiple layers and therefore multiple objects they should
		// either all be passed or all be class attributes
		getTgtObj2(srcStep).createDataTable(srcObj.getStep(srcStep), srcObj.getDataTable(srcStep));
		getTgtObj3(srcStep).createDataTable(srcObj.getStep(srcStep), srcObj.getDataTable(srcStep));
	}

	private void convertDocString(Step step, Message srcStep) {
		tgtObj.createDocString(step, srcObj.getDocString(srcStep));
		getTgtObj2(srcStep).createDocString(srcObj.getStep(srcStep));
		getTgtObj3(srcStep).createDocString(srcObj.getStep(srcStep));
	}

	private void convertExamples(ScenarioOutline scenarioOutline, EAnnotation examplesSrc) {
		Examples examples = tgtObj.createExamples(scenarioOutline, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (HashMap<String, String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	private void convertExamplesRow(Examples examples, HashMap<String, String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
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
		} else if (srcObj.hasDataTable(srcStep)) {
			convertDataTable(tgtStep, srcStep);
		}
	}

	private CucumberJavaWrapper getTgtObj3(Message srcStep) {
		CucumberJavaWrapper tgtStepDefObj = (CucumberJavaWrapper) tgtPrj
				.createObject(getStepObjName(srcObj.getStep(srcStep)));
		tgtStepDefObj.load();
		return tgtStepDefObj;
	}

	private CucumberJavaWrapper getTgtObj2(Message srcStep) {
		CucumberJavaWrapper tgtStepDefObj = (CucumberJavaWrapper) tgtPrj
				.createObject(getStepDefName(srcObj.getStep(srcStep)));
		tgtStepDefObj.load();
		return tgtStepDefObj;
	}

	private String getStepObjName(String stepName) {
		String objectName = Validator.getObjectName(stepName);
		objectName = objectName.replaceAll("\\.", " ");
		objectName = objectName.replaceAll("\\-", " ");
		String objectType = Validator.getObjectType(stepName);
		String componentName = Validator.getComponentName(stepName);
		if (componentName.isEmpty()) {
			componentName = lastComponent;
		} else {
			lastComponent = componentName;
		}
		return tgtPrj.getDir(tgtPrj.THIRD_LAYER) + File.separator + CaseUtils.toCamelCase(componentName, false, ' ')
				+ File.separator + CaseUtils.toCamelCase(objectName, true, ' ') + objectType + ".java";
	}

	private String getStepDefName(String stepName) {
		String objectName = Validator.getObjectName(stepName);
		objectName = objectName.replaceAll("\\.", " ");
		objectName = objectName.replaceAll("\\-", " ");
		String objectType = Validator.getObjectType(stepName);
		String componentName = Validator.getComponentName(stepName);
		if (componentName.isEmpty()) {
			componentName = lastComponent;
		} else {
			lastComponent = componentName;
		}
		return tgtPrj.getDir(tgtPrj.SECOND_LAYER) + File.separator + CaseUtils.toCamelCase(componentName, false, ' ')
				+ File.separator + componentName + CaseUtils.toCamelCase(objectName, true, ' ') + objectType
				+ "Steps.java";
	}

	private void convertStepList(AbstractScenario abstractScenario, ArrayList<Message> stepList,
			Interaction srcScenario) {
		for (Message step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	@Override
	protected void convertAbstractScenarioList(ConvertibleObject srcFeature) throws Exception {
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

	@Override
	protected void convertImports(ConvertibleObject layerClass) throws Exception {
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, Object stepList) throws Exception {
	}

	@Override
	protected void convertMessage(Message m, Object stepList) throws Exception {
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {
		srcObj = (UMLClassWrapper) theObject;
		tgtObj = (CucumberFeatureWrapper) tgtPrj.createObject(convertObjectName(srcObj.getQualifiedName()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
	}

	@Override
	protected String convertObjectName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + tgtPrj.FIRST_LAYER, tgtPrj.getDir(tgtPrj.FIRST_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.FIRST_LAYER);
		return pathName;
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void selectObjects() throws Exception {
		srcPrj.loadObjects(layer);
	}
}
