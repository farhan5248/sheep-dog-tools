package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestSuite;
import org.farhan.mbt.asciidoctor.AsciiDoctorPathConverter;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestProject;
import org.farhan.mbt.asciidoctor.AsciiDoctorStepObject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.StepObject;
import org.farhan.mbt.core.TestSuite;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.Background;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Scenario;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepParameters;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Logger;

public class ConvertUMLToAsciidoctor extends Converter {

	protected AsciiDoctorPathConverter pathConverter;
	private TestSuite srcObj;
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

	private void convertStepData(Step step, Message srcStep) {
		tgtObjTestSuite.createStepTable(step, srcObj.getStepTable(srcStep));
	}

	private void convertStepDefinition(Interaction srcStepDefinition) throws Exception {
		log.debug("step definition: " + srcStepDefinition.getName());
		StepDefinition stepDefinition = tgtObjStepObject
				.addStepDefinition(srcObj.getStepDefinitionName(srcStepDefinition));
		tgtObjStepObject.setStepDefinitionDescription(stepDefinition,
				srcObj.getStepDefinitionDescription(srcStepDefinition));

		for (EAnnotation sp : srcObj.getStepParametersList(srcStepDefinition)) {
			convertStepParameters(stepDefinition, sp);
		}
	}

	private String convertStepObject(String path, String content) throws Exception {
		log.debug("step object: " + path);
		srcObj = (TestSuite) model.getTestSuite(pathConverter.findUMLPath(path));
		tgtObjStepObject = (AsciiDoctorStepObject) project.addFile(path);
		tgtObjStepObject.parse(content);
		tgtObjStepObject.setStepObjectName(srcObj.getStepObjectName());
		tgtObjStepObject.setStepObjectDescription(srcObj.getStepObjectDescription());
		for (Interaction sd : srcObj.getStepDefinitionList()) {
			convertStepDefinition(sd);
		}
		return tgtObjStepObject.toString();
	}

	private void convertStepParameters(StepDefinition stepDefinition, EAnnotation srcStepParameters) throws Exception {
		log.debug("step parameter: " + srcStepParameters.getSource());
		StepParameters stepParameters = tgtObjStepObject.addStepParameters(stepDefinition,
				srcObj.getStepParametersName(srcStepParameters));
		tgtObjStepObject.addStepParametersTable(stepParameters, srcObj.getStepParametersTable(srcStepParameters));
		for (ArrayList<String> row : srcObj.getStepParametersRowList(srcStepParameters)) {
			tgtObjStepObject.createStepParametersRow(stepParameters, row);
		}
	}

	private void convertStepText(Step step, Message srcStep) {
		tgtObjTestSuite.setDocString(step, srcObj.getDocString(srcStep));
	}

	private void convertTestCase(Interaction srcAbstractScenario) {
		log.debug("test case: " + srcAbstractScenario.getName());
		Scenario scenario = tgtObjTestSuite.addScenario(srcObj.getScenarioName(srcAbstractScenario));
		tgtObjTestSuite.setScenarioTags(scenario, srcObj.getScenarioTags(srcAbstractScenario));
		tgtObjTestSuite.setScenarioDescription(scenario, srcObj.getScenarioDescription(srcAbstractScenario));
		for (Message srcStep : srcObj.getStepList(srcAbstractScenario)) {
			convertTestStep(scenario, srcStep);
		}
	}

	private void convertTestCaseWithData(Interaction srcAbstractScenario) {
		log.debug("test case: " + srcAbstractScenario.getName());
		Scenario scenarioOutline = tgtObjTestSuite
				.createScenarioOutline(srcObj.getScenarioOutlineName(srcAbstractScenario));
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

	private void convertTestData(Scenario abstractScenario, EAnnotation srcExamples) {
		log.debug("test data: " + srcExamples.getSource());
		Examples examples = tgtObjTestSuite.addExamples(abstractScenario, srcObj.getExamplesName(srcExamples));
		// TODO add examples description
		tgtObjTestSuite.setExamplesTable(examples, srcObj.getExamplesTable(srcExamples));
		for (ArrayList<String> row : srcObj.getExamplesRowList(srcExamples)) {
			tgtObjTestSuite.addExamplesRow(examples, row);
		}
	}

	private void convertTestSetup(Interaction srcAbstractScenario) {
		log.debug("test setup: " + srcAbstractScenario.getName());
		Background background = tgtObjTestSuite.addBackground(srcObj.getBackgroundName(srcAbstractScenario));
		tgtObjTestSuite.setBackgroundTags(background, srcObj.getFeatureTags(srcAbstractScenario));
		tgtObjTestSuite.setBackgroundDescription(background, srcObj.getBackgroundDescription(srcAbstractScenario));
		for (Message srcStep : srcObj.getStepList(srcAbstractScenario)) {
			convertTestStep(background, srcStep);
		}
	}

	private void convertTestStep(AbstractScenario abstractScenario, Message srcStep) {
		log.debug("test step: " + srcStep.getName());
		Step step = tgtObjTestSuite.addStep(abstractScenario, srcObj.getStepName(srcStep));
		if (srcObj.hasDocString(srcStep)) {
			convertStepText(step, srcStep);
		} else if (srcObj.hasStepTable(srcStep)) {
			convertStepData(step, srcStep);
		}
	}

	private String convertTestSuite(String path, String content) throws Exception {
		log.debug("test suite: " + path);
		srcObj = (TestSuite) model.getTestSuite(pathConverter.findUMLPath(path));
		tgtObjTestSuite = (AsciiDoctorTestSuite) project.addFile(path);
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
