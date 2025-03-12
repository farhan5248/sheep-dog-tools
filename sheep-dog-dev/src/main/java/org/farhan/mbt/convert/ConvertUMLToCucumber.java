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

	protected TestSuite srcObj;
	protected CucumberFeature tgtObjTestSuite;
	protected CucumberClassAndInterface tgtObjStepObject;
	protected CucumberPathConverter pathConverter;

	public ConvertUMLToCucumber(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	@Override
	public String convertFile(String path, String content) throws Exception {
		initProjects();
		if (path.startsWith(project.getDir(project.TEST_STEPS))
				|| path.startsWith(project.getDir(project.TEST_OBJECTS))) {
			return convertStepObject(tag, path, content);
		} else {
			return convertTestSuite(tag, path, content);
		}
	}

	protected void convertStepData(Step step, Message srcStep) throws Exception {
		tgtObjTestSuite.setStepTable(step, srcObj.getStepTable(srcStep));
	}

	protected void convertStepDefinition(Interaction stepDefinitionSrc) throws Exception {
		tgtObjStepObject.createStepDefinition(srcObj.getStepDefinitionNameLong(stepDefinitionSrc));
		ArrayList<EAnnotation> parametersList = srcObj.getStepParametersList(stepDefinitionSrc);
		convertStepParameters(stepDefinitionSrc, parametersList);
	}

	protected void convertStepDefinitionList() throws Exception {
		for (Interaction stepDefinition : srcObj.getStepDefinitionList()) {
			log.debug("step definition: " + stepDefinition.getName());
			convertStepDefinition(stepDefinition);
		}
	}

	protected String convertStepObject(String tags, String path, String content) throws Exception {
		srcObj = (TestSuite) model.getObject(pathConverter.findUMLPath(path));

		tgtObjStepObject = (CucumberClassAndInterface) project.addObject(path);
		tgtObjStepObject.parse(content);

		convertStepDefinitionList();
		return tgtObjStepObject.toString();
	}

	protected void convertStepParameters(Interaction stepDefinitionSrc, ArrayList<EAnnotation> parametersList)
			throws Exception {

		ArrayList<String> parametersListMerged = new ArrayList<String>();
		for (EAnnotation a : parametersList) {
			for (String s : a.getDetails().getFirst().getValue().split("\\|")) {
				if (!parametersListMerged.contains(s.trim())) {
					parametersListMerged.add(s.trim());
				}
			}
		}
		tgtObjStepObject.setStepDefinitionParameters(srcObj.getStepDefinitionNameLong(stepDefinitionSrc), parametersListMerged);
	}

	protected void convertStepText(Step step, Message srcStep) throws Exception {
		tgtObjTestSuite.setDocString(step, srcObj.getDocString(srcStep));
	}

	protected void convertTestCase(Interaction srcAbstractScenario) throws Exception {
		log.debug("test case: " + srcAbstractScenario.getName());
		Scenario scenario = tgtObjTestSuite.addScenario(srcObj.getScenarioName(srcAbstractScenario));
		tgtObjTestSuite.setScenarioTags(scenario, srcObj.getScenarioTags(srcAbstractScenario));
		tgtObjTestSuite.setScenarioDescription(scenario, srcObj.getScenarioDescription(srcAbstractScenario));
		for (Message srcStep : srcObj.getStepList(srcAbstractScenario)) {
			convertTestStep(scenario, srcStep);
		}
	}

	protected void convertTestCaseWithData(Interaction srcAbstractScenario) throws Exception {
		log.debug("test case: " + srcAbstractScenario.getName());
		ScenarioOutline scenarioOutline = tgtObjTestSuite.addScenarioOutline(srcObj.getScenarioOutlineName(srcAbstractScenario));
		tgtObjTestSuite.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(srcAbstractScenario));
		tgtObjTestSuite.setScenarioOutlineDescription(scenarioOutline,
				srcObj.getScenarioOutlineDescription(srcAbstractScenario));
		for (Message srcStep : srcObj.getStepList(srcAbstractScenario)) {
			convertTestStep(scenarioOutline, srcStep);
		}
		for (EAnnotation srcExamples : srcObj.getExamplesList(srcAbstractScenario)) {
			convertTestData(scenarioOutline, srcExamples);
		}
	}

	protected void convertTestData(ScenarioOutline scenarioOutline, EAnnotation srcExamples) {
		log.debug("test data: " + srcExamples.getSource());
		Examples examples = tgtObjTestSuite.addExamples(scenarioOutline, srcObj.getExamplesName(srcExamples));
		// TODO add examples description
		tgtObjTestSuite.setExamplesTable(examples, srcObj.getExamplesTable(srcExamples));
		for (ArrayList<String> row : srcObj.getExamplesRowList(srcExamples)) {
			tgtObjTestSuite.addExamplesRow(examples, row);
		}
	}

	protected void convertTestSetup(Interaction srcAbstractScenario) throws Exception {
		log.debug("test setup: " + srcAbstractScenario.getName());
		Background background = tgtObjTestSuite.addBackground(srcObj.getBackgroundName(srcAbstractScenario));
		tgtObjTestSuite.setFeatureTags(srcObj.getFeatureTags(srcAbstractScenario));
		tgtObjTestSuite.setBackgroundDescription(background, srcObj.getBackgroundDescription(srcAbstractScenario));
		for (Message srcStep : srcObj.getStepList(srcAbstractScenario)) {
			convertTestStep(background, srcStep);
		}
	}

	protected void convertTestStep(AbstractScenario abstractScenario, Message srcStep) throws Exception {
		log.debug("test step: " + srcStep.getName());
		Step step = tgtObjTestSuite.addStep(abstractScenario, srcObj.getStepNameLong(srcStep));
		if (srcObj.hasDocString(srcStep)) {
			convertStepText(step, srcStep);
		} else if (srcObj.hasStepTable(srcStep)) {
			convertStepData(step, srcStep);
		}
	}

	protected String convertTestSuite(String tags, String path, String content) throws Exception {
		log.debug("test suite: " + path);
		srcObj = (TestSuite) model.getObject(pathConverter.findUMLPath(path));
		tgtObjTestSuite = (CucumberFeature) project.addObject(path);
		tgtObjTestSuite.parse(content);
		tgtObjTestSuite.setFeatureName(srcObj.getFeatureName());
		tgtObjTestSuite.setFeatureDescription(srcObj.getFeatureDescription());
		for (Interaction as : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(as)) {
				convertTestSetup(as);
			} else if (srcObj.isScenarioOutline(as)) {
				convertTestCaseWithData(as);
			} else {
				convertTestCase(as);
			}
		}
		return tgtObjTestSuite.toString();
	}

	@Override
	public ArrayList<String> getFileNames() throws Exception {
		initProjects();
		ArrayList<String> objects = new ArrayList<String>();
		for (ConvertibleObject co : model.getObjects(model.TEST_CASES)) {
			objects.add(pathConverter.convertFilePath(co.getPath(), project.TEST_CASES));
		}
		for (ConvertibleObject co : model.getObjects(model.TEST_STEPS)) {
			objects.add(pathConverter.convertFilePath(co.getPath(), project.TEST_STEPS));
			objects.add(pathConverter.convertFilePath(co.getPath(), project.TEST_OBJECTS));
		}
		return objects;
	}

	public void initProjects() throws Exception {
		model = new TestProject(this.tag, this.fa);
		project = new CucumberTestProject(this.tag, this.fa);
		model.init();
		project.init();
		this.pathConverter = new CucumberPathConverter(model, (CucumberTestProject) project);
	}
}
