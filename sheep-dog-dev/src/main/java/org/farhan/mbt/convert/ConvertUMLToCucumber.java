package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.Background;
import org.farhan.mbt.cucumber.Examples;
import org.farhan.mbt.cucumber.Scenario;
import org.farhan.mbt.cucumber.ScenarioOutline;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLClassWrapper;
import org.farhan.mbt.core.UMLModel;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.Logger;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;

public class ConvertUMLToCucumber extends Converter {

	private UMLClassWrapper srcObj;
	private CucumberFeatureWrapper tgtObj;
	private CucumberJavaWrapper tgtObj2;

	public ConvertUMLToCucumber(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	protected void convertAbstractScenarioList() throws Exception {
		for (Interaction abstractScenario : srcObj.getAbstractScenarioList()) {
			log.debug("test case: " + abstractScenario.getName());
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	protected void convertBackground(Interaction abstractScenario) throws Exception {
		Background background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), abstractScenario);
	}

	protected void convertDocString(Step step, Message srcStep) throws Exception {
		tgtObj.createDocString(step, srcObj.getDocString(srcStep));
	}

	protected void convertExamples(ScenarioOutline scenarioOutline, EAnnotation examplesSrc) {
		Examples examples = tgtObj.createExamples(scenarioOutline, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (ArrayList<String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	protected void convertExamplesRow(Examples examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	private String convertFeature(String tags, String path, String content) throws Exception {

		srcObj = (UMLClassWrapper) model.createObject(findQualifiedName(path));

		tgtObj = (CucumberFeatureWrapper) project.createObject(path);
		tgtObj.parse(content);

		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
		return tgtObj.toString();
	}

	@Override
	public String convertObject(String path, String content) throws Exception {
		initProjects();
		if (path.startsWith(project.getDir(project.TEST_CASES))) {
			log.debug("test suite: " + path);
			return convertFeature(tags, path, content);
		} else if (path.startsWith(project.getDir(project.TEST_STEPS))) {
			log.debug("step object: " + path);
			return convertObjectSteps(tags, path, content);
		} else {
			log.debug("step object: " + path);
			return convertObjectFields(tags, path, content);
		}
	}

	private String convertObjectFields(String tags, String path, String content) throws Exception {
		srcObj = (UMLClassWrapper) model.createObject(findQualifiedName(path));

		tgtObj2 = (CucumberJavaWrapper) project.createObject(path);
		tgtObj2.parse(content);

		convertStepDefinitionList();
		return tgtObj2.toString();
	}

	private String convertObjectSteps(String tags, String path, String content) throws Exception {
		srcObj = (UMLClassWrapper) model.createObject(findQualifiedName(path));

		tgtObj2 = (CucumberJavaWrapper) project.createObject(path);
		tgtObj2.parse(content);

		convertStepDefinitionList();
		return tgtObj2.toString();
	}

	protected void convertScenario(Interaction srcScenario) throws Exception {
		Scenario scenario = tgtObj.createScenario(srcObj.getScenarioName(srcScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(srcScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(srcScenario));
		convertStepList(scenario, srcObj.getStepList(srcScenario), srcScenario);
	}

	protected void convertScenarioOutline(Interaction abstractScenario) throws Exception {

		ScenarioOutline scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), abstractScenario);

		ArrayList<EAnnotation> examplesList = srcObj.getExamplesList(abstractScenario);
		for (EAnnotation examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	protected void convertStep(AbstractScenario abstractScenario, Message srcStep) throws Exception {
		Step tgtStep = tgtObj.createStep(abstractScenario, srcObj.getStep(srcStep));
		if (srcObj.hasDocString(srcStep)) {
			convertDocString(tgtStep, srcStep);
		} else if (srcObj.hasStepTable(srcStep)) {
			convertStepTable(tgtStep, srcStep);
		}
	}

	private String getStep(Interaction stepDefinition) {
		String stepDefinitionName = srcObj.getStepDefinitionName(stepDefinition);
		String component = srcObj.getPath().replace("pst::stepdefs::", "").split("::")[0];
		String object = srcObj.getPath().split("::" + component + "::")[1].replace("::", "/");
		return "The " + component + ", " + object + " " + stepDefinitionName;
	}

	private void convertStepDefinition(Interaction stepDefinition) throws Exception {
		String step = getStep(stepDefinition);
		tgtObj2.createStepDefinition(step);

		ArrayList<String> parametersList = srcObj.getStepDefinitionParameterList(stepDefinition);
		convertStepParameters(stepDefinition, parametersList);
	}

	private void convertStepParameters(Interaction stepDefinition, ArrayList<String> parametersSrc) throws Exception {
		tgtObj2.setStepDefinitionParameters(getStep(stepDefinition), parametersSrc);
	}

	private void convertStepDefinitionList() throws Exception {
		for (Interaction stepDefinition : srcObj.getStepDefinitionList()) {
			log.debug("step definition: " + stepDefinition.getName());
			convertStepDefinition(stepDefinition);
		}
	}

	protected void convertStepList(AbstractScenario abstractScenario, ArrayList<Message> stepList,
			Interaction srcScenario) throws Exception {
		for (Message step : stepList) {
			log.debug("test step: " + step.getName());
			convertStep(abstractScenario, step);
		}
	}

	protected void convertStepTable(Step step, Message srcStep) throws Exception {
		tgtObj.createStepTable(step, srcObj.getStepTable(srcStep));
	}

	public void initProjects() throws Exception {
		model = new UMLModel(this.tags, this.fa);
		model.init();
		project = new CucumberProject(this.tags, this.fa);
		project.init();
	}

	protected String getPath(UMLClassWrapper srcObj, String tgtLayer) {

		// TODO this is basically a duplicate of the parent. put each method in a
		// [Cucumber|AsciiDoctor]PathConverter class
		String path = srcObj.getPath();
		String[] pathParts = path.split("::");
		String componentName = pathParts[2];
		String objectName = pathParts[pathParts.length - 1];
		String newComponentName = getComponentName(srcObj.getPath());
		String newObjectName = getObjectName(srcObj.getPath());

		if (tgtLayer.contentEquals(model.TEST_CASES)) {
			path = path.replace("pst::" + model.TEST_CASES, "");
		} else {
			if (tgtLayer.contentEquals(model.TEST_STEPS)) {
				path = path.replace("pst::" + model.TEST_STEPS + "::" + componentName,
						"::" + newComponentName.toLowerCase());
				path = path.replaceFirst(objectName + "$", newComponentName + newObjectName + "Steps");

			}
			if (tgtLayer.contentEquals(model.TEST_OBJECTS)) {
				path = path.replace("pst::" + model.TEST_STEPS + "::" + componentName,
						"::" + newComponentName.toLowerCase());
				path = path.replaceFirst(objectName + "$", newObjectName);
			}
			path = path.replace(" ", "");
			path = path.replace("-", "");
		}

		path = path.replace("::", "/");
		path = project.getDir(tgtLayer) + path + project.getFileExt(tgtLayer);

		return path;
	}

	private String getComponentName(String path) {
		String[] pathParts = path.split("::");
		String name = pathParts[2].replaceFirst("\\s[^\\s]+$", "");
		name = removeDelimiterAndCapitalize(name, "\\.");
		name = removeDelimiterAndCapitalize(name, "\\-");
		name = removeDelimiterAndCapitalize(name, " ");
		return name;
	}

	private String getObjectName(String path) {
		String[] pathParts = path.split("::");
		String name = pathParts[pathParts.length - 1];
		name = removeDelimiterAndCapitalize(name, "\\.");
		name = removeDelimiterAndCapitalize(name, "\\-");
		name = removeDelimiterAndCapitalize(name, " ");
		return name;
	}

}
