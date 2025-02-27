package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
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

	// TODO Don't save tgt/src objects as attributes, pass them along to each method
	private AsciiDoctorTestSuite srcObjTestSuite;
	private AsciiDoctorStepObject srcObjStepObject;
	private TestSuite tgtObj;

	public ConvertAsciidoctorToUML(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	public void clearProjects() throws Exception {
		fa.clear(tags);
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
		return "";
	}

	private void convertStepData(Message step, Step stepSrc) {
		tgtObj.addStepTable(step, srcObjTestSuite.getStepTable(stepSrc));
	}

	private void convertStepDefinition(StepDefinition stepDefinitionSrc) {
		log.debug("step definition: " + stepDefinitionSrc.getName());
		Interaction stepDefinition = tgtObj
				.addStepDefinition(srcObjStepObject.getStepDefinitionName(stepDefinitionSrc));
		tgtObj.setStepDefinitionNameLong(stepDefinition, srcObjStepObject.getStepDefinitionNameLong(stepDefinitionSrc));
		tgtObj.setStepDefinitionDescription(stepDefinition,
				srcObjStepObject.getStepDefinitionDescription(stepDefinitionSrc));
		for (StepParameters stepParametersSrc : srcObjStepObject.getStepParametersList(stepDefinitionSrc)) {
			convertStepParameters(stepDefinition, stepParametersSrc);
		}
	}

	private void convertStepObject(String path, String content) throws Exception {
		log.debug("step object: " + path);

		boolean selected = false;
		for (String s : stepObjects) {
			if (path.contentEquals(project.getDir(project.TEST_STEPS) + "/" + s)) {
				selected = true;
				break;
			}
		}
		if (selected) {
			srcObjStepObject = (AsciiDoctorStepObject) project.addObject(path);
			srcObjStepObject.parse(content);
			tgtObj = (TestSuite) testProject.addStepObject(pathConverter.convertUMLPath(path));
			tgtObj.setStepObjectName(srcObjStepObject.getStepObjectName());
			tgtObj.setStepObjectDescription(srcObjStepObject.getStepObjectDescription());
			for (StepDefinition sd : srcObjStepObject.getStepDefinitionList()) {
				convertStepDefinition(sd);
			}
			testProject.save();
		}
	}

	private void convertStepParameters(Interaction stepDefinition, StepParameters stepParametersSrc) {
		log.debug("step parameter: " + stepParametersSrc.getName());
		EAnnotation stepParameters = tgtObj.addStepParameters(stepDefinition,
				srcObjStepObject.getStepParametersName(stepParametersSrc));
		tgtObj.addStepParametersTable(stepParameters, srcObjStepObject.getStepParametersTable(stepParametersSrc));
		for (Row row : srcObjStepObject.getStepParametersRowList(stepParametersSrc)) {
			tgtObj.addStepParametersRow(stepParameters, srcObjStepObject.getStepParametersRow(stepParametersSrc, row));
		}
	}

	private void convertStepText(Message step, Step stepSrc) {
		tgtObj.addDocString(step, srcObjTestSuite.getDocString(stepSrc));
	}

	private void convertTestCase(AbstractScenario scenarioSrc) {
		log.debug("test case: " + scenarioSrc.getName());
		Interaction scenarioTgt = tgtObj.addScenario(srcObjTestSuite.getScenarioName(scenarioSrc));
		tgtObj.setScenarioTags(scenarioTgt, srcObjTestSuite.getAbstractScenarioTags(scenarioSrc));
		tgtObj.setScenarioDescription(scenarioTgt, srcObjTestSuite.getScenarioDescription(scenarioSrc));
		for (Step step : srcObjTestSuite.getStepList(scenarioSrc)) {
			convertTestStep(scenarioTgt, step);
		}
		EList<Examples> examplesList = srcObjTestSuite.getExamplesList(scenarioSrc);
		for (Examples examples : examplesList) {
			convertTestData(scenarioTgt, examples);
		}
	}

	private void convertTestData(Interaction abstractScenario, Examples examplesSrc) {
		EAnnotation examples = tgtObj.addExamples(abstractScenario, srcObjTestSuite.getExamplesName(examplesSrc));
		tgtObj.addExamplesTable(examples, srcObjTestSuite.getExamplesTable(examplesSrc));
		for (Row row : srcObjTestSuite.getExamplesRowList(examplesSrc)) {
			tgtObj.addExamplesRow(examples, srcObjTestSuite.getExamplesRow(examplesSrc, row));
		}
	}

	private void convertTestSetup(AbstractScenario abstractScenario) {
		log.debug("test setup: " + abstractScenario.getName());
		Interaction background = tgtObj.addBackground(srcObjTestSuite.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundTags(background, srcObjTestSuite.getAbstractScenarioTags(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObjTestSuite.getBackgroundDescription(abstractScenario));
		for (Step step : srcObjTestSuite.getStepList(abstractScenario)) {
			convertTestStep(background, step);
		}
	}

	private void convertTestStep(Interaction abstractScenario, Step stepSrc) {
		log.debug("test step: " + stepSrc.getName());
		Message step = tgtObj.addStep(abstractScenario, srcObjTestSuite.getStep(stepSrc));
		tgtObj.setStepNameLong(step, srcObjTestSuite.getStepNameLong(stepSrc));
		stepObjects.add(StepDefinitionHelper.getStepObjectQualifiedName(new LanguageAccessImpl(stepSrc)));

		if (srcObjTestSuite.hasDocString(stepSrc)) {
			convertStepText(step, stepSrc);
		} else if (srcObjTestSuite.hasStepTable(stepSrc)) {
			convertStepData(step, stepSrc);
		}
	}

	private void convertTestSuite(String path, String content) throws Exception {
		log.debug("test suite: " + path);

		boolean selected = tags.isEmpty();
		srcObjTestSuite = (AsciiDoctorTestSuite) project.addObject(path);
		srcObjTestSuite.parse(content);
		if (!selected) {
			for (AbstractScenario a : srcObjTestSuite.getAbstractScenarioList()) {
				for (String t : srcObjTestSuite.getAbstractScenarioTags(a)) {
					if (t.trim().contentEquals(tags)) {
						selected = true;
						break;
					}
				}
			}
		}
		if (selected) {
			tgtObj = (TestSuite) testProject.addTestSuite(pathConverter.convertUMLPath(path));
			tgtObj.setFeatureName(srcObjTestSuite.getFeatureName());
			tgtObj.setFeatureDescription(srcObjTestSuite.getFeatureDescription());
			for (AbstractScenario as : srcObjTestSuite.getAbstractScenarioList()) {
				if (srcObjTestSuite.isBackground(as)) {
					convertTestSetup(as);
				} else {
					convertTestCase(as);
				}
			}
			testProject.save();
		} else {
			project.deleteObject(srcObjTestSuite);
		}

	}

	public void initProjects() throws Exception {
		project = new AsciiDoctorTestProject(this.tags, this.fa);
		project.init();
		testProject = new TestProject(this.tags, this.fa);
		testProject.init();
		pathConverter = new AsciiDoctorPathConverter(testProject, (AsciiDoctorTestProject) project);
	}
}
