package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.mbt.LanguageAccessImpl;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestSuite;
import org.farhan.mbt.asciidoctor.AsciiDoctorPathConverter;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestProject;
import org.farhan.mbt.asciidoctor.AsciiDoctorStepObject;
import org.farhan.mbt.core.Logger;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.TestCase;
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
import org.farhan.mbt.core.Converter;

public class ConvertAsciidoctorToUML extends Converter {

	private static ArrayList<String> stepObjects = new ArrayList<String>();
	protected AsciiDoctorPathConverter pathConverter;
	// TODO Don't save tgt/src objects as attributes, pass them along to each
	// method. Do this when moving to the Test* or Step* classes
	private AsciiDoctorTestSuite srcObjTestSuite;
	private AsciiDoctorStepObject srcObjStepObject;
	private TestSuite tgtObj;

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

	private void convertStepData(Message step, Step srcStep) {
		tgtObj.setStepTable(step, srcObjTestSuite.getStepTable(srcStep));
	}

	private void convertStepDefinition(StepDefinition srcStepDefinition) {
		log.debug("step definition: " + srcStepDefinition.getName());
		Interaction stepDefinition = tgtObj
				.addStepDefinition(srcObjStepObject.getStepDefinitionName(srcStepDefinition));
		tgtObj.setStepDefinitionNameLong(stepDefinition, srcObjStepObject.getStepDefinitionNameLong(srcStepDefinition));
		tgtObj.setStepDefinitionDescription(stepDefinition,
				srcObjStepObject.getStepDefinitionDescription(srcStepDefinition));
		for (StepParameters sp : srcObjStepObject.getStepParametersList(srcStepDefinition)) {
			convertStepParameters(stepDefinition, sp);
		}
	}

	private void convertStepObject(String path, String content) throws Exception {
		log.debug("step object: " + path);
		srcObjStepObject = (AsciiDoctorStepObject) project.addFile(path);
		srcObjStepObject.parse(content);
		if (isStepObjectSelected()) {
			tgtObj = (TestSuite) model.addStepObject(pathConverter.convertUMLPath(srcObjStepObject.getPath()));
			tgtObj.setStepObjectName(srcObjStepObject.getStepObjectName());
			tgtObj.setStepObjectDescription(srcObjStepObject.getStepObjectDescription());
			for (StepDefinition sd : srcObjStepObject.getStepDefinitionList()) {
				convertStepDefinition(sd);
			}
			model.save();
		} else {
			project.deleteObject(srcObjStepObject);
		}
	}

	private void convertStepParameters(Interaction stepDefinition, StepParameters srcStepParameters) {
		log.debug("step parameter: " + srcStepParameters.getName());
		EAnnotation stepParameters = tgtObj.addStepParameters(stepDefinition,
				srcObjStepObject.getStepParametersName(srcStepParameters));
		tgtObj.addStepParametersTable(stepParameters, srcObjStepObject.getStepParametersTable(srcStepParameters));
		for (Row row : srcObjStepObject.getStepParametersRowList(srcStepParameters)) {
			tgtObj.addStepParametersRow(stepParameters, srcObjStepObject.getStepParametersRow(srcStepParameters, row));
		}
	}

	private void convertStepText(Message step, Step srcStep) {
		tgtObj.setDocString(step, srcObjTestSuite.getDocString(srcStep));
	}

	private void convertTestCase(AbstractScenario srcTestSuite, TestSuite testSuite) {
		log.debug("test case: " + srcTestSuite.getName());
		TestCase testCase = testSuite.addScenario(srcObjTestSuite.getScenarioName(srcTestSuite));
		testCase.setScenarioTags(srcObjTestSuite.getAbstractScenarioTags(srcTestSuite));
		testCase.setScenarioDescription(srcObjTestSuite.getScenarioDescription(srcTestSuite));
		for (Step srcStep : srcObjTestSuite.getStepList(srcTestSuite)) {
			convertTestStep(testCase.addStep(srcObjTestSuite.getStepName(srcStep)), srcStep);
		}
		for (Examples srcExamples : srcObjTestSuite.getExamplesList(srcTestSuite)) {
			convertTestData(testCase.umlElement, srcExamples);
		}
	}

	private void convertTestData(Interaction abstractScenario, Examples srcExamples) {
		log.debug("test data: " + srcExamples.getName());
		EAnnotation examples = tgtObj.addExamples(abstractScenario, srcObjTestSuite.getExamplesName(srcExamples));
		// TODO add examples description
		tgtObj.setExamplesTable(examples, srcObjTestSuite.getExamplesTable(srcExamples));
		for (Row row : srcObjTestSuite.getExamplesRowList(srcExamples)) {
			tgtObj.addExamplesRow(examples, srcObjTestSuite.getExamplesRow(srcExamples, row));
		}
	}

	private void convertTestSetup(AbstractScenario srcBackground, TestSetup background) {
		log.debug("test setup: " + srcBackground.getName());
		background.setBackgroundTags(background, srcObjTestSuite.getAbstractScenarioTags(srcBackground));
		background.setBackgroundDescription(background, srcObjTestSuite.getBackgroundDescription(srcBackground));
		for (Step srcStep : srcObjTestSuite.getStepList(srcBackground)) {
			convertTestStep(background.addStep(srcObjTestSuite.getStepName(srcStep)), srcStep);
		}
	}

	private void convertTestStep(TestStep step, Step srcStep) {
		log.debug("test step: " + srcStep.getName());
		stepObjects.add(StepDefinitionHelper.getStepObjectQualifiedName(new LanguageAccessImpl(srcStep)));
		step.setStepKeyword(srcObjTestSuite.getStepKeyword(srcStep));
		step.setStepNameLong(srcObjTestSuite.getStepNameLong(srcStep));
		if (srcObjTestSuite.hasDocString(srcStep)) {
			step.setDocString(srcObjTestSuite.getDocString(srcStep));
		} else if (srcObjTestSuite.hasStepTable(srcStep)) {
			step.setStepTable(srcObjTestSuite.getStepTable(srcStep));
		}
	}

	private void convertTestStep(Interaction abstractScenario, Step srcStep) {
		log.debug("test step: " + srcStep.getName());
		stepObjects.add(StepDefinitionHelper.getStepObjectQualifiedName(new LanguageAccessImpl(srcStep)));
		Message step = tgtObj.addStep(abstractScenario, srcObjTestSuite.getStepName(srcStep));
		tgtObj.setStepKeyword(step, srcObjTestSuite.getStepKeyword(srcStep));
		tgtObj.setStepNameLong(step, srcObjTestSuite.getStepNameLong(srcStep));
		if (srcObjTestSuite.hasDocString(srcStep)) {
			convertStepText(step, srcStep);
		} else if (srcObjTestSuite.hasStepTable(srcStep)) {
			convertStepData(step, srcStep);
		}
	}

	private void convertTestSuite(String path, String content) throws Exception {
		log.debug("test suite: " + path);
		srcObjTestSuite = (AsciiDoctorTestSuite) project.addFile(path);
		srcObjTestSuite.parse(content);
		if (isTestSuiteSelected()) {
			TestSuite testSuite = model.addTestSuite(pathConverter.convertUMLPath(srcObjTestSuite.getPath()));
			this.tgtObj = testSuite;
			testSuite.setFeatureDescription(srcObjTestSuite.getFeatureDescription());
			for (AbstractScenario srcTestSuite : srcObjTestSuite.getAbstractScenarioList()) {
				if (srcObjTestSuite.isBackground(srcTestSuite)) {
					convertTestSetup(srcTestSuite,
							testSuite.addBackground(srcObjTestSuite.getBackgroundName(srcTestSuite)));
				} else {
					convertTestCase(srcTestSuite, testSuite);
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
