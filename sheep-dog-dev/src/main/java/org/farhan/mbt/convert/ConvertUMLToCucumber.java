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
import org.farhan.mbt.core.TestSuite;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Logger;
import org.farhan.mbt.cucumber.CucumberFeature;
import org.farhan.mbt.cucumber.CucumberClassAndInterface;
import org.farhan.mbt.cucumber.CucumberPathConverter;
import org.farhan.mbt.cucumber.CucumberTestProject;

public class ConvertUMLToCucumber extends Converter {

	private TestSuite srcObj;
	private CucumberFeature tgtObj;
	private CucumberClassAndInterface tgtObj2;
	protected CucumberPathConverter pathConverter;

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
		tgtObj.setFeatureTags(srcObj.getBackgroundTags(abstractScenario));
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

		srcObj = (TestSuite) testProject.getObject(pathConverter.findUMLPath(path));

		tgtObj = (CucumberFeature) srcProject.addObject(path);
		tgtObj.parse(content);

		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
		return tgtObj.toString();
	}

	@Override
	public String convertFile(String path, String content) throws Exception {
		initProjects();
		if (path.startsWith(srcProject.getDir(srcProject.TEST_CASES))) {
			log.debug("test suite: " + path);
			return convertFeature(tag, path, content);
		} else if (path.startsWith(srcProject.getDir(srcProject.TEST_STEPS))) {
			log.debug("step object: " + path);
			return convertObjectSteps(tag, path, content);
		} else {
			log.debug("step object: " + path);
			return convertObjectFields(tag, path, content);
		}
	}

	private String convertObjectFields(String tags, String path, String content) throws Exception {
		srcObj = (TestSuite) testProject.getObject(pathConverter.findUMLPath(path));

		tgtObj2 = (CucumberClassAndInterface) srcProject.addObject(path);
		tgtObj2.parse(content);

		convertStepDefinitionList();
		return tgtObj2.toString();
	}

	private String convertObjectSteps(String tags, String path, String content) throws Exception {
		srcObj = (TestSuite) testProject.getObject(pathConverter.findUMLPath(path));

		tgtObj2 = (CucumberClassAndInterface) srcProject.addObject(path);
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
		Step tgtStep = tgtObj.createStep(abstractScenario, srcObj.getStepNameLong(srcStep));
		if (srcObj.hasDocString(srcStep)) {
			convertDocString(tgtStep, srcStep);
		} else if (srcObj.hasStepTable(srcStep)) {
			convertStepTable(tgtStep, srcStep);
		}
	}

	private void convertStepDefinition(Interaction stepDefinitionSrc) throws Exception {
		tgtObj2.createStepDefinition(srcObj.getStepDefinitionNameLong(stepDefinitionSrc));
		ArrayList<EAnnotation> parametersList = srcObj.getStepDefinitionParameterList(stepDefinitionSrc);
		convertStepParameters(stepDefinitionSrc, parametersList);
	}

	private void convertStepParameters(Interaction stepDefinitionSrc, ArrayList<EAnnotation> parametersList)
			throws Exception {

		ArrayList<String> parametersListMerged = new ArrayList<String>();
		for (EAnnotation a : parametersList) {
			for (String s : a.getDetails().getFirst().getValue().split("\\|")) {
				if (!parametersListMerged.contains(s.trim())) {
					parametersListMerged.add(s.trim());
				}
			}
		}
		tgtObj2.setStepDefinitionParameters(srcObj.getStepDefinitionNameLong(stepDefinitionSrc), parametersListMerged);
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
		testProject = new TestProject(this.tag, this.fa);
		srcProject = new CucumberTestProject(this.tag, this.fa);
		testProject.init();
		srcProject.init();
		this.pathConverter = new CucumberPathConverter(testProject, (CucumberTestProject) srcProject);
	}

	@Override
	public ArrayList<String> getFileNames() throws Exception {
		initProjects();
		ArrayList<String> objects = new ArrayList<String>();
		for (ConvertibleObject co : testProject.getObjects(testProject.TEST_CASES)) {
			objects.add(pathConverter.convertFilePath(co.getPath(), srcProject.TEST_CASES));
		}
		for (ConvertibleObject co : testProject.getObjects(testProject.TEST_STEPS)) {
			objects.add(pathConverter.convertFilePath(co.getPath(), srcProject.TEST_STEPS));
			objects.add(pathConverter.convertFilePath(co.getPath(), srcProject.TEST_OBJECTS));
		}
		return objects;
	}
}
