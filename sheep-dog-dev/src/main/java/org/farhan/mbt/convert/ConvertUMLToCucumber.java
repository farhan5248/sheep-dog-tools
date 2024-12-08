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
import org.farhan.mbt.CucumberStandaloneSetup;
import org.farhan.mbt.core.ConverterNew;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;
import org.farhan.helper.StepHelper;

public class ConvertUMLToCucumber extends ConverterNew {

	private String lastComponent = "InitialComponent";

	private UMLClassWrapper srcObj;
	private CucumberFeatureWrapper tgtObj;
	private CucumberJavaWrapper tgtObj2;

	public ConvertUMLToCucumber(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

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

	private void convertStepDefinitionList() throws Exception {
		for (Interaction stepDefinition : srcObj.getStepDefinitionList()) {
			convertStepDefinition(stepDefinition);
		}
	}

	private void convertStepDefinition(Interaction stepDefinition) throws Exception {
		String stepDefinitionName = srcObj.getStepDefinitionName(stepDefinition);
		tgtObj2.createStepDefinition(stepDefinitionName);
		tgtObj2.setStepDefinitionParameters(stepDefinitionName,
				srcObj.getStepDefinitionParameterList(stepDefinitionName));
	}

	protected void convertStepList(AbstractScenario abstractScenario, ArrayList<Message> stepList,
			Interaction srcScenario) throws Exception {
		for (Message step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	protected void convertStepTable(Step step, Message srcStep) throws Exception {
		tgtObj.createStepTable(step, srcObj.getStepTable(srcStep));
	}

	protected String getComponentName(String step) {
		String name = StepHelper.getComponentName(step);
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
	public void initProjects() throws Exception {
		srcPrj = new UMLProject(this.tags, this.fa);
		srcPrj.load();
		tgtPrj = new CucumberProject(this.tags, this.fa);
		tgtPrj.load();
	}

	@Override
	public String convertObject(String tags, String path, String content) throws Exception {

		if (path.startsWith(tgtPrj.getDir(tgtPrj.TEST_CASES))) {
			return convertFeature(tags, path, content);
		} else if (path.startsWith(tgtPrj.getDir(tgtPrj.TEST_STEPS))) {
			return convertObjectSteps(tags, path, content);
		} else {
			return convertObjectFields(tags, path, content);
		}
	}

	private String convertFeature(String tags, String path, String content) throws Exception {

		srcObj = (UMLClassWrapper) srcPrj.createObject(convertTgtPath(path));

		tgtObj = (CucumberFeatureWrapper) tgtPrj.createObject(path);
		tgtObj.parse(content);

		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
		return tgtObj.toString();
	}

	private String convertObjectSteps(String tags, String path, String content) throws Exception {
		srcObj = (UMLClassWrapper) srcPrj.createObject(convertTgtPath(path));

		tgtObj2 = (CucumberJavaWrapper) tgtPrj.createObject(path);
		tgtObj2.parse(content);

		convertStepDefinitionList();
		return tgtObj2.toString();
	}

	private String convertObjectFields(String tags, String path, String content) throws Exception {
		srcObj = (UMLClassWrapper) srcPrj.createObject(convertTgtPath(path));

		tgtObj2 = (CucumberJavaWrapper) tgtPrj.createObject(path);
		tgtObj2.parse(content);

		convertStepDefinitionList();
		return tgtObj2.toString();
	}
}
