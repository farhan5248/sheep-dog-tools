package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.farhan.mbt.cucumber.Background;
import org.farhan.mbt.cucumber.Examples;
import org.farhan.mbt.cucumber.Scenario;
import org.farhan.mbt.cucumber.ScenarioOutline;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.sheepDog.StepParameters;

import com.github.javaparser.ast.body.MethodDeclaration;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.StepDefinition;
import org.farhan.mbt.core.StepObject;
import org.farhan.mbt.core.TestCase;
import org.farhan.mbt.core.TestData;
import org.farhan.mbt.core.TestSuite;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.core.TestSetup;
import org.farhan.mbt.core.TestStep;
import org.farhan.mbt.core.Converter;
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

	protected String convertStepObject(String tags, String path, String content) throws Exception {
		StepObject srcStepObject = model.getStepObject(pathConverter.findUMLPath(path));
		tgtObjStepObject = (CucumberClassAndInterface) project.addFile(path);
		tgtObjStepObject.parse(content);

		for (StepDefinition srcStepDefinition : srcStepObject.getStepDefinitionList()) {
			convertStepDefinition(tgtObjStepObject.addStepDefinition(srcStepObject.getNameLong()), srcStepDefinition);
		}
		return tgtObjStepObject.toString();
	}

	protected void convertStepDefinition(MethodDeclaration stepDefinition,
			org.farhan.mbt.core.StepDefinition srcStepDefinition) throws Exception {
		log.debug("step definition: " + srcStepDefinition.getName());

		// Convert each parameter one at a time
		for (org.farhan.mbt.core.StepParameters sp : srcStepDefinition.getStepParametersList()) {
			convertStepParameters(tgtObjStepObject.addStepParameters(stepDefinition, sp.getName()), sp);
		}
		// or all at once
		convertStepParameters(srcStepDefinition, srcStepDefinition.getStepParametersList());
	}

	protected void convertStepParameters(StepParameters stepParameters,
			org.farhan.mbt.core.StepParameters srcStepParameters) throws Exception {
		log.debug("step parameter: " + srcStepParameters.getName());
		tgtObjStepObject.addStepParametersTable(stepParameters, srcStepParameters.getTable());
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
		tgtObjStepObject.setStepDefinitionParameters(srcObj.getStepDefinitionNameLong(stepDefinitionSrc),
				parametersListMerged);
	}

	protected void convertTestCase(Scenario scenario, TestCase srcTestCase) throws Exception {
		log.debug("test case: " + srcTestCase.getName());
		tgtObjTestSuite.setScenarioTags(scenario, srcTestCase.getTags());
		tgtObjTestSuite.setScenarioDescription(scenario, srcTestCase.getDescription());
		for (TestStep srcTestStep : srcTestCase.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(scenario, srcTestStep.getNameLong()), srcTestStep);
		}
	}

	protected void convertTestCaseWithData(ScenarioOutline scenarioOutline, TestCase srcTestCase) throws Exception {
		log.debug("test case: " + srcTestCase.getName());
		tgtObjTestSuite.setScenarioOutlineTags(scenarioOutline, srcTestCase.getTags());
		tgtObjTestSuite.setScenarioOutlineDescription(scenarioOutline, srcTestCase.getDescription());
		for (TestStep srcTestStep : srcTestCase.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(scenarioOutline, srcTestStep.getNameLong()), srcTestStep);
		}
		for (TestData srcTestData : srcTestCase.getTestDataList()) {
			convertTestData(tgtObjTestSuite.addExamples(scenarioOutline, srcTestData.getName()), srcTestData);
		}
	}

	protected void convertTestData(Examples examples, TestData srcTestData) {
		log.debug("test data: " + srcTestData.getName());
		// TODO add examples description
		tgtObjTestSuite.setExamplesTable(examples, srcTestData.getTable());
		for (ArrayList<String> row : srcTestData.getRowList()) {
			tgtObjTestSuite.addExamplesRow(examples, row);
		}
	}

	protected void convertTestSetup(Background background, TestSetup srcTestSetup) throws Exception {
		log.debug("test setup: " + srcTestSetup.getName());
		tgtObjTestSuite.setFeatureTags(srcTestSetup.getTags());
		tgtObjTestSuite.setBackgroundDescription(background, srcTestSetup.getDescription());
		for (TestStep srcStep : srcTestSetup.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(background, srcStep.getNameLong()), srcStep);
		}
	}

	protected void convertTestStep(Step step, TestStep srcStep) throws Exception {
		log.debug("test step: " + srcStep.getName());
		if (srcStep.hasDocString()) {
			tgtObjTestSuite.setDocString(step, srcStep.getStepText());
		} else if (srcStep.hasStepTable()) {
			tgtObjTestSuite.setStepTable(step, srcStep.getStepData());
		}
	}

	protected String convertTestSuite(String tags, String path, String content) throws Exception {
		log.debug("test suite: " + path);
		TestSuite srcTestSuite = model.getTestSuite(pathConverter.findUMLPath(path));
		tgtObjTestSuite = (CucumberFeature) project.addFile(path);
		tgtObjTestSuite.parse(content);
		tgtObjTestSuite.setFeatureName(srcTestSuite.getName());
		tgtObjTestSuite.setFeatureDescription(srcTestSuite.getDescription());

		if (srcTestSuite.hasTestSetup()) {
			convertTestSetup(tgtObjTestSuite.addBackground(srcTestSuite.getTestSetup().getName()),
					srcTestSuite.getTestSetup());
		}
		for (TestCase srcTestCase : srcTestSuite.getTestCaseList()) {
			if (srcTestCase.hasTestData()) {
				convertTestCaseWithData(tgtObjTestSuite.addScenarioOutline(srcTestCase.getName()), srcTestCase);
			} else {
				convertTestCase(tgtObjTestSuite.addScenario(srcTestCase.getName()), srcTestCase);
			}
		}
		return tgtObjTestSuite.toString();
	}

	@Override
	public ArrayList<String> getFileNames() throws Exception {
		initProjects();
		ArrayList<String> objects = new ArrayList<String>();
		for (TestSuite co : model.getTestSuiteList()) {
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), project.TEST_CASES));
		}
		for (StepObject co : model.getStepObjectList()) {
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), project.TEST_STEPS));
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), project.TEST_OBJECTS));
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
