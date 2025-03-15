package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.helper.StepDefinitionHelper;
import org.farhan.mbt.LanguageAccessImpl;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestSuite;
import org.farhan.mbt.asciidoctor.AsciiDoctorPathConverter;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestProject;
import org.farhan.mbt.asciidoctor.AsciiDoctorStepObject;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.Logger;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.StepObject;
import org.farhan.mbt.core.TestCase;
import org.farhan.mbt.core.TestData;
import org.farhan.mbt.core.TestSetup;
import org.farhan.mbt.core.TestStep;
import org.farhan.mbt.core.TestSuite;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepParameters;

public class ConvertAsciidoctorToUML extends Converter {

	private static ArrayList<String> stepObjects = new ArrayList<String>();
	protected AsciiDoctorPathConverter pathConverter;
	private AsciiDoctorTestSuite srcObjTestSuite;
	private AsciiDoctorStepObject srcObjStepObject;

	public ConvertAsciidoctorToUML(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	@Override
	public void clearProjects() throws Exception {
		fa.clear(tag);
		stepObjects.clear();
	}

	@Override
	public String convertFile(String path, String content) throws Exception {
		// TODO call this outside of this method like clearObjects. When run as a
		// service, then the client will call initObjects once and then call
		// convertObject multiple times
		initProjects();
		if (path.startsWith(project.getDir(project.TEST_STEPS))) {
			convertStepObject(path, content);
		} else {
			convertTestSuite(path, content);
		}
		// TODO this method shouldn't return empty string, there needs to be the
		// equivalent of PUT (void) and GET (String) return types
		return "";
	}

	private void convertStepDefinition(org.farhan.mbt.core.StepDefinition stepDefinition,
			StepDefinition srcStepDefinition) {
		log.debug("step definition: " + srcStepDefinition.getName());
		stepDefinition.setNameLong(srcObjStepObject.getStepDefinitionNameLong(srcStepDefinition));
		stepDefinition.setDescription(srcObjStepObject.getStepDefinitionDescription(srcStepDefinition));
		for (StepParameters sp : srcObjStepObject.getStepParametersList(srcStepDefinition)) {
			convertStepParameters(stepDefinition.addStepParameters(srcObjStepObject.getStepParametersName(sp)), sp);
		}
	}

	private void convertStepObject(String path, String content) throws Exception {
		log.debug("step object: " + path);
		srcObjStepObject = (AsciiDoctorStepObject) project.addFile(path);
		srcObjStepObject.parse(content);
		if (isStepObjectSelected()) {
			StepObject stepObject = model.addStepObject(pathConverter.convertUMLPath(srcObjStepObject.getPath()));
			stepObject.setDescription(srcObjStepObject.getStepObjectDescription());
			for (StepDefinition sd : srcObjStepObject.getStepDefinitionList()) {
				convertStepDefinition(stepObject.addStepDefinition(srcObjStepObject.getStepDefinitionName(sd)), sd);
			}
			model.save();
		} else {
			project.deleteObject(srcObjStepObject);
		}
	}

	private void convertStepParameters(org.farhan.mbt.core.StepParameters stepParameters,
			StepParameters srcStepParameters) {
		log.debug("step parameter: " + srcStepParameters.getName());
		stepParameters.addTable(srcObjStepObject.getStepParametersTable(srcStepParameters));
		for (Row row : srcObjStepObject.getStepParametersRowList(srcStepParameters)) {
			stepParameters.addRow(srcObjStepObject.getStepParametersRow(srcStepParameters, row));
		}
	}

	private void convertTestCase(AbstractScenario srcTestCase, TestCase testCase) {
		log.debug("test case: " + srcTestCase.getName());
		testCase.setTags(srcObjTestSuite.getAbstractScenarioTags(srcTestCase));
		testCase.setDescription(srcObjTestSuite.getScenarioDescription(srcTestCase));
		for (Step srcStep : srcObjTestSuite.getStepList(srcTestCase)) {
			convertTestStep(testCase.addTestStep(srcObjTestSuite.getStepName(srcStep)), srcStep);
		}
		for (Examples srcExamples : srcObjTestSuite.getExamplesList(srcTestCase)) {
			convertTestData(testCase.addTestData(srcObjTestSuite.getExamplesName(srcExamples)), srcExamples);
		}
	}

	private void convertTestData(TestData examples, Examples srcExamples) {
		log.debug("test data: " + srcExamples.getName());
		// TODO add examples description
		examples.setTable(srcObjTestSuite.getExamplesTable(srcExamples));
		for (Row row : srcObjTestSuite.getExamplesRowList(srcExamples)) {
			examples.addRow(srcObjTestSuite.getExamplesRow(srcExamples, row));
		}
	}

	private void convertTestSetup(AbstractScenario srcBackground, TestSetup background) {
		log.debug("test setup: " + srcBackground.getName());
		background.setTags(srcObjTestSuite.getAbstractScenarioTags(srcBackground));
		background.setDescription(srcObjTestSuite.getBackgroundDescription(srcBackground));
		for (Step srcStep : srcObjTestSuite.getStepList(srcBackground)) {
			convertTestStep(background.addTestStep(srcObjTestSuite.getStepName(srcStep)), srcStep);
		}
	}

	private void convertTestStep(TestStep step, Step srcStep) {
		log.debug("test step: " + srcStep.getName());
		stepObjects.add(StepDefinitionHelper.getStepObjectQualifiedName(new LanguageAccessImpl(srcStep)));
		step.setKeyword(srcObjTestSuite.getStepKeyword(srcStep));
		step.setNameLong(srcObjTestSuite.getStepNameLong(srcStep));
		if (srcObjTestSuite.hasDocString(srcStep)) {
			step.setStepText(srcObjTestSuite.getDocString(srcStep));
		} else if (srcObjTestSuite.hasStepTable(srcStep)) {
			step.setStepData(srcObjTestSuite.getStepTable(srcStep));
		}
	}

	private void convertTestSuite(String path, String content) throws Exception {
		log.debug("test suite: " + path);
		srcObjTestSuite = (AsciiDoctorTestSuite) project.addFile(path);
		srcObjTestSuite.parse(content);
		if (isTestSuiteSelected()) {
			TestSuite testSuite = model.addTestSuite(pathConverter.convertUMLPath(srcObjTestSuite.getPath()));
			testSuite.setFeatureDescription(srcObjTestSuite.getFeatureDescription());
			for (AbstractScenario srcTestCase : srcObjTestSuite.getAbstractScenarioList()) {
				if (srcObjTestSuite.isBackground(srcTestCase)) {
					convertTestSetup(srcTestCase,
							testSuite.addTestSetup(srcObjTestSuite.getBackgroundName(srcTestCase)));
				} else {
					convertTestCase(srcTestCase, testSuite.addTestCase(srcObjTestSuite.getScenarioName(srcTestCase)));
				}
			}
			model.save();
		} else {
			project.deleteObject(srcObjTestSuite);
		}
	}

	public void initProjects() throws Exception {
		project = new AsciiDoctorTestProject(this.tag, this.fa);
		model = new TestProject(this.tag, this.fa);
		project.init();
		model.init();
		pathConverter = new AsciiDoctorPathConverter(model, (AsciiDoctorTestProject) project);
	}

	private boolean isStepObjectSelected() {
		for (String s : stepObjects) {
			if (srcObjStepObject.getPath().contentEquals(project.getDir(project.TEST_STEPS) + "/" + s)) {
				return true;
			}
		}
		return false;
	}

	private boolean isTestSuiteSelected() throws Exception {
		boolean selected = tag.isEmpty();
		if (!selected) {
			for (AbstractScenario a : srcObjTestSuite.getAbstractScenarioList()) {
				for (String t : srcObjTestSuite.getAbstractScenarioTags(a)) {
					if (t.trim().contentEquals(tag)) {
						return true;
					}
				}
			}
		} else {
			return true;
		}
		return false;
	}
}
