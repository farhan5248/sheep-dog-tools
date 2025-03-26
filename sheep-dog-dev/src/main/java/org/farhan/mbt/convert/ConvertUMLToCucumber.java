package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.dsl.cucumber.cucumber.Background;
import org.farhan.dsl.cucumber.cucumber.Examples;
import org.farhan.dsl.cucumber.cucumber.Scenario;
import org.farhan.dsl.cucumber.cucumber.ScenarioOutline;
import org.farhan.dsl.cucumber.cucumber.Step;
import com.github.javaparser.ast.body.MethodDeclaration;

import org.farhan.mbt.core.UMLStepDefinition;
import org.farhan.mbt.core.UMLStepObject;
import org.farhan.mbt.core.UMLTestCase;
import org.farhan.mbt.core.UMLTestData;
import org.farhan.mbt.core.UMLTestSuite;
import org.farhan.mbt.core.UMLTestProject;
import org.farhan.mbt.core.UMLTestSetup;
import org.farhan.mbt.core.UMLTestStep;
import org.farhan.mbt.cucumber.CucumberFeature;
import org.farhan.mbt.cucumber.CucumberClassAndInterface;
import org.farhan.mbt.cucumber.CucumberPathConverter;
import org.farhan.mbt.cucumber.CucumberTestProject;

public class ConvertUMLToCucumber extends Converter {

	protected UMLTestSuite srcObj;
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
			return convertStepObject(path, content);
		} else {
			return convertTestSuite(path, content);
		}
	}

	protected void convertStepDefinition(MethodDeclaration stepDefinition, UMLStepDefinition srcStepDefinition)
			throws Exception {
		ArrayList<String> parametersListMerged = new ArrayList<String>();
		for (org.farhan.mbt.core.UMLStepParameters a : srcStepDefinition.getStepParametersList()) {
			for (String s : a.getUmlElement().getDetails().getFirst().getValue().split("\\|")) {
				if (!parametersListMerged.contains(s.trim())) {
					parametersListMerged.add(s.trim());
				}
			}
		}
		tgtObjStepObject.addStepParameters(srcStepDefinition.getNameLong(), parametersListMerged);
	}

	protected String convertStepObject(String path, String content) throws Exception {
		log.debug("step object: " + path);
		UMLStepObject srcStepObject = model.getStepObject(pathConverter.findUMLPath(path));
		tgtObjStepObject = (CucumberClassAndInterface) project.addFile(path);
		tgtObjStepObject.parse(content);
		for (UMLStepDefinition srcStepDefinition : srcStepObject.getStepDefinitionList()) {
			convertStepDefinition(tgtObjStepObject.addStepDefinition(srcStepDefinition.getNameLong()),
					srcStepDefinition);
		}
		return tgtObjStepObject.toString();
	}

	protected void convertTestCase(Scenario scenario, UMLTestCase srcTestCase) throws Exception {
		log.debug("test case: " + srcTestCase.getName());
		tgtObjTestSuite.setScenarioTags(scenario, srcTestCase.getTags());
		tgtObjTestSuite.setScenarioDescription(scenario, srcTestCase.getDescription());
		for (UMLTestStep srcTestStep : srcTestCase.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(scenario, srcTestStep.getNameLong()), srcTestStep);
		}
	}

	protected void convertTestCaseWithData(ScenarioOutline scenarioOutline, UMLTestCase srcTestCase) throws Exception {
		log.debug("test case: " + srcTestCase.getName());
		tgtObjTestSuite.setScenarioOutlineTags(scenarioOutline, srcTestCase.getTags());
		tgtObjTestSuite.setScenarioOutlineDescription(scenarioOutline, srcTestCase.getDescription());
		for (UMLTestStep srcTestStep : srcTestCase.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(scenarioOutline, srcTestStep.getNameLong()), srcTestStep);
		}
		for (UMLTestData srcTestData : srcTestCase.getTestDataList()) {
			convertTestData(tgtObjTestSuite.addExamples(scenarioOutline, srcTestData.getName()), srcTestData);
		}
	}

	protected void convertTestData(Examples examples, UMLTestData srcTestData) {
		log.debug("test data: " + srcTestData.getName());
		// TODO add examples description
		tgtObjTestSuite.setExamplesTable(examples, srcTestData.getTable());
		for (ArrayList<String> row : srcTestData.getRowList()) {
			tgtObjTestSuite.addExamplesRow(examples, row);
		}
	}

	protected void convertTestSetup(Background background, UMLTestSetup srcTestSetup) throws Exception {
		log.debug("test setup: " + srcTestSetup.getName());
		tgtObjTestSuite.setFeatureTags(srcTestSetup.getTags());
		tgtObjTestSuite.setBackgroundDescription(background, srcTestSetup.getDescription());
		for (UMLTestStep srcStep : srcTestSetup.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(background, srcStep.getNameLong()), srcStep);
		}
	}

	protected void convertTestStep(Step step, UMLTestStep srcStep) throws Exception {
		log.debug("test step: " + srcStep.getName());
		if (srcStep.hasDocString()) {
			tgtObjTestSuite.setDocString(step, srcStep.getStepText());
		} else if (srcStep.hasStepTable()) {
			tgtObjTestSuite.setStepTable(step, srcStep.getStepData());
		}
	}

	protected String convertTestSuite(String path, String content) throws Exception {
		log.debug("test suite: " + path);
		UMLTestSuite srcTestSuite = model.getTestSuite(pathConverter.findUMLPath(path));
		tgtObjTestSuite = (CucumberFeature) project.addFile(path);
		tgtObjTestSuite.parse(content);
		tgtObjTestSuite.setFeatureName(srcTestSuite.getName());
		tgtObjTestSuite.setFeatureDescription(srcTestSuite.getDescription());

		if (srcTestSuite.hasTestSetup()) {
			convertTestSetup(tgtObjTestSuite.addBackground(srcTestSuite.getTestSetup().getName()),
					srcTestSuite.getTestSetup());
		}
		for (UMLTestCase srcTestCase : srcTestSuite.getTestCaseList()) {
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
		for (UMLTestSuite co : model.getTestSuiteList()) {
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), project.TEST_CASES));
		}
		for (UMLStepObject co : model.getStepObjectList()) {
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), project.TEST_STEPS));
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), project.TEST_OBJECTS));
		}
		return objects;
	}

	public void initProjects() throws Exception {
		model = new UMLTestProject(this.tag, this.fa);
		project = new CucumberTestProject(this.tag, this.fa);
		model.init();
		project.init();
		this.pathConverter = new CucumberPathConverter(model, (CucumberTestProject) project);
	}
}
