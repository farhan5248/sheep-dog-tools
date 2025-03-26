package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.helper.StepDefinitionHelper;
import org.farhan.dsl.sheepdog.LanguageAccessImpl;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestSuite;
import org.farhan.mbt.asciidoctor.AsciiDoctorPathConverter;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestProject;
import org.farhan.mbt.asciidoctor.AsciiDoctorStepObject;
import org.farhan.mbt.core.UMLStepObject;
import org.farhan.mbt.core.UMLTestCase;
import org.farhan.mbt.core.UMLTestData;
import org.farhan.mbt.core.UMLTestSetup;
import org.farhan.mbt.core.UMLTestStep;
import org.farhan.mbt.core.UMLTestSuite;
import org.farhan.mbt.core.UMLTestProject;
import org.farhan.dsl.sheepdog.sheepDog.TestStepContainer;
import org.farhan.dsl.sheepdog.sheepDog.TestData;
import org.farhan.dsl.sheepdog.sheepDog.Row;
import org.farhan.dsl.sheepdog.sheepDog.TestStep;
import org.farhan.dsl.sheepdog.sheepDog.StepDefinition;
import org.farhan.dsl.sheepdog.sheepDog.StepParameters;
import org.farhan.dsl.sheepdog.sheepDog.TestData;
import org.farhan.dsl.sheepdog.sheepDog.TestStep;

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

	private void convertStepDefinition(org.farhan.mbt.core.UMLStepDefinition stepDefinition,
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
			UMLStepObject stepObject = model.addStepObject(pathConverter.convertUMLPath(srcObjStepObject.getPath()));
			stepObject.setDescription(srcObjStepObject.getStepObjectDescription());
			for (StepDefinition sd : srcObjStepObject.getStepDefinitionList()) {
				convertStepDefinition(stepObject.addStepDefinition(srcObjStepObject.getStepDefinitionName(sd)), sd);
			}
			model.save();
		} else {
			project.deleteObject(srcObjStepObject);
		}
	}

	private void convertStepParameters(org.farhan.mbt.core.UMLStepParameters stepParameters,
			StepParameters srcStepParameters) {
		log.debug("step parameter: " + srcStepParameters.getName());
		stepParameters.addTable(srcObjStepObject.getStepParametersTable(srcStepParameters));
	}

	private void convertTestCase(TestStepContainer srcTestCase, UMLTestCase testCase) {
		log.debug("test case: " + srcTestCase.getName());
		testCase.setTags(srcObjTestSuite.getAbstractScenarioTags(srcTestCase));
		testCase.setDescription(srcObjTestSuite.getScenarioDescription(srcTestCase));
		for (TestStep srcStep : srcObjTestSuite.getStepList(srcTestCase)) {
			convertTestStep(testCase.addTestStep(srcObjTestSuite.getStepName(srcStep)), srcStep);
		}
		for (TestData srcExamples : srcObjTestSuite.getExamplesList(srcTestCase)) {
			convertTestData(testCase.addTestData(srcObjTestSuite.getExamplesName(srcExamples)), srcExamples);
		}
	}

	private void convertTestData(UMLTestData examples, TestData srcExamples) {
		log.debug("test data: " + srcExamples.getName());
		// TODO add examples description
		examples.setTable(srcObjTestSuite.getExamplesTable(srcExamples));
		for (Row row : srcObjTestSuite.getExamplesRowList(srcExamples)) {
			examples.addRow(srcObjTestSuite.getExamplesRow(srcExamples, row));
		}
	}

	private void convertTestSetup(TestStepContainer srcBackground, UMLTestSetup background) {
		log.debug("test setup: " + srcBackground.getName());
		background.setTags(srcObjTestSuite.getAbstractScenarioTags(srcBackground));
		background.setDescription(srcObjTestSuite.getBackgroundDescription(srcBackground));
		for (TestStep srcStep : srcObjTestSuite.getStepList(srcBackground)) {
			convertTestStep(background.addTestStep(srcObjTestSuite.getStepName(srcStep)), srcStep);
		}
	}

	private void convertTestStep(UMLTestStep step, TestStep srcStep) {
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
			UMLTestSuite testSuite = model.addTestSuite(pathConverter.convertUMLPath(srcObjTestSuite.getPath()));
			testSuite.setDescription(srcObjTestSuite.getFeatureDescription());
			for (TestStepContainer srcTestCase : srcObjTestSuite.getAbstractScenarioList()) {
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
		model = new UMLTestProject(this.tag, this.fa);
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
			for (TestStepContainer a : srcObjTestSuite.getAbstractScenarioList()) {
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
