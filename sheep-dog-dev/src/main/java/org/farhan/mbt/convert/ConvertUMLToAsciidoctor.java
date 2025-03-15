package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorTestSuite;
import org.farhan.mbt.asciidoctor.AsciiDoctorPathConverter;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestProject;
import org.farhan.mbt.asciidoctor.AsciiDoctorStepObject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.StepObject;
import org.farhan.mbt.core.TestCase;
import org.farhan.mbt.core.TestData;
import org.farhan.mbt.core.TestSuite;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.core.TestSetup;
import org.farhan.mbt.core.TestStep;
import org.farhan.mbt.sheepDog.Background;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Scenario;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepParameters;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.Logger;

public class ConvertUMLToAsciidoctor extends Converter {

	protected AsciiDoctorPathConverter pathConverter;
	private AsciiDoctorTestSuite tgtObjTestSuite;
	private AsciiDoctorStepObject tgtObjStepObject;

	public ConvertUMLToAsciidoctor(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	@Override
	public String convertFile(String path, String content) throws Exception {
		initProjects();
		if (path.startsWith(project.getDir(project.TEST_STEPS))) {
			return convertStepObject(path, content);
		} else {
			return convertTestSuite(path, content);
		}
	}

	private void convertStepDefinition(StepDefinition stepDefinition,
			org.farhan.mbt.core.StepDefinition srcStepDefinition) throws Exception {
		log.debug("step definition: " + srcStepDefinition.getName());
		tgtObjStepObject.setStepDefinitionDescription(stepDefinition,
				srcStepDefinition.getDescription(srcStepDefinition));
		for (org.farhan.mbt.core.StepParameters sp : srcStepDefinition.getStepParametersList()) {
			convertStepParameters(tgtObjStepObject.addStepParameters(stepDefinition, sp.getName()), sp);
		}
	}

	private String convertStepObject(String path, String content) throws Exception {
		log.debug("step object: " + path);
		StepObject srcStepObject = model.getStepObject(pathConverter.findUMLPath(path));
		tgtObjStepObject = (AsciiDoctorStepObject) project.addFile(path);
		tgtObjStepObject.parse(content);
		tgtObjStepObject.setStepObjectName(srcStepObject.getName());
		tgtObjStepObject.setStepObjectDescription(srcStepObject.getDescription());
		for (org.farhan.mbt.core.StepDefinition srcStepDefinition : srcStepObject.getStepDefinitionList()) {
			convertStepDefinition(tgtObjStepObject.addStepDefinition(srcStepDefinition.getName()), srcStepDefinition);
		}
		return tgtObjStepObject.toString();
	}

	private void convertStepParameters(StepParameters stepParameters,
			org.farhan.mbt.core.StepParameters srcStepParameters) throws Exception {
		log.debug("step parameter: " + srcStepParameters.getName());
		tgtObjStepObject.addStepParametersTable(stepParameters, srcStepParameters.getTable());
	}

	private void convertTestCase(Scenario scenario, TestCase srcTestCase) {
		log.debug("test case: " + srcTestCase.getName());
		tgtObjTestSuite.setScenarioTags(scenario, srcTestCase.getTags());
		tgtObjTestSuite.setScenarioDescription(scenario, srcTestCase.getDescription());
		for (TestStep srcTestStep : srcTestCase.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(scenario, srcTestStep.getName()), srcTestStep);
		}
		for (TestData srcTestData : srcTestCase.getTestDataList()) {
			convertTestData(tgtObjTestSuite.addExamples(scenario, srcTestData.getName()), srcTestData);
		}
	}

	private void convertTestData(Examples examples, TestData srcTestData) {
		log.debug("test data: " + srcTestData.getName());
		// TODO add examples description
		tgtObjTestSuite.setExamplesTable(examples, srcTestData.getTable());
		for (ArrayList<String> row : srcTestData.getRowList()) {
			tgtObjTestSuite.addExamplesRow(examples, row);
		}
	}

	private void convertTestSetup(Background background, TestSetup srcTestSetup) {
		log.debug("test setup: " + srcTestSetup.getName());
		tgtObjTestSuite.setBackgroundTags(background, srcTestSetup.getTags());
		tgtObjTestSuite.setBackgroundDescription(background, srcTestSetup.getDescription());
		for (TestStep srcStep : srcTestSetup.getTestStepList()) {
			convertTestStep(tgtObjTestSuite.addStep(background, srcStep.getName()), srcStep);
		}
	}

	private void convertTestStep(Step step, TestStep srcStep) {
		log.debug("test step: " + srcStep.getName());
		if (srcStep.hasDocString()) {
			tgtObjTestSuite.setDocString(step, srcStep.getStepText());
		} else if (srcStep.hasStepTable()) {
			tgtObjTestSuite.createStepTable(step, srcStep.getStepData());
		}
	}

	private String convertTestSuite(String path, String content) throws Exception {
		log.debug("test suite: " + path);
		TestSuite srcTestSuite = model.getTestSuite(pathConverter.findUMLPath(path));
		tgtObjTestSuite = (AsciiDoctorTestSuite) project.addFile(path);
		tgtObjTestSuite.parse(content);
		tgtObjTestSuite.setFeatureName(srcTestSuite.getName());
		tgtObjTestSuite.setFeatureDescription(srcTestSuite.getDescription());

		if (srcTestSuite.hasTestSetup()) {
			convertTestSetup(tgtObjTestSuite.addBackground(srcTestSuite.getTestSetup().getName()),
					srcTestSuite.getTestSetup());
		}

		for (TestCase srcTestCase : srcTestSuite.getTestCaseList()) {
			convertTestCase(tgtObjTestSuite.addScenario(srcTestCase.getName()), srcTestCase);
		}
		return tgtObjTestSuite.toString();
	}

	public ArrayList<String> getFileNames() throws Exception {
		initProjects();
		ArrayList<String> objects = new ArrayList<String>();
		for (TestSuite co : model.getTestSuiteList()) {
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), model.TEST_CASES));
		}
		for (StepObject co : model.getStepObjectList()) {
			objects.add(pathConverter.convertFilePath(co.getUmlElement().getQualifiedName(), model.TEST_STEPS));
		}
		return objects;
	}

	public void initProjects() throws Exception {
		project = new AsciiDoctorTestProject(this.tag, this.fa);
		model = new TestProject(this.tag, this.fa);
		project.init();
		model.init();
		this.pathConverter = new AsciiDoctorPathConverter(model, (AsciiDoctorTestProject) project);
	}
}
