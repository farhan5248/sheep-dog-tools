package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.mbt.LanguageAccessImpl;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorPathConverter;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
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
	private AsciiDoctorAdocWrapper srcObj;
	private TestSuite tgtObj;
	protected AsciiDoctorPathConverter pathConverter;

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
		srcObj = (AsciiDoctorAdocWrapper) project.addObject(path);
		srcObj.parse(content);
		if (isObjectSelected(srcObj, tags)) {

			// TODO model.createObject should be addTestSuite. This is why TestProject can't
			// extend ConvertibleProject because projects are collections of files and the
			// model isn't
			tgtObj = (TestSuite) model.addObject(pathConverter.convertUMLPath(path));
			
			// TODO there should be one rest call to create an empty tgtObj
			// PUT http://service/api/testproject/bug123/testsuite/suite123
			// and another to add the content
			// POST http://service/api/testproject/bug123/testsuite/suite123/content
			if (path.startsWith(project.getDir(project.TEST_STEPS))) {
				convertStepObject(path);
			} else {
				convertTestSuite(path);
			}
			model.save();
		} else {
			project.deleteObject(srcObj);
		}
		return "";
	}

	private void convertStepData(Message step, Step stepSrc) {
		tgtObj.addStepTable(step, srcObj.getStepTable(stepSrc));
	}

	private void convertStepDefinition(StepDefinition stepDefinitionSrc) {
		log.debug("step definition: " + stepDefinitionSrc.getName());
		Interaction stepDefinition = tgtObj.addStepDefinition(srcObj.getStepDefinitionName(stepDefinitionSrc));
		tgtObj.setStepDefinitionNameLong(stepDefinition, srcObj.getStepDefinitionNameLong(stepDefinitionSrc));
		tgtObj.setStepDefinitionDescription(stepDefinition, srcObj.getStepDefinitionDescription(stepDefinitionSrc));
		for (StepParameters stepParametersSrc : srcObj.getStepParametersList(stepDefinitionSrc)) {
			convertStepParameters(stepDefinition, stepParametersSrc);
		}
	}

	private void convertStepObject(String path) {
		log.debug("step object: " + path);
		tgtObj.setStepObjectName(srcObj.getStepObjectName());
		tgtObj.setStepObjectDescription(srcObj.getStepObjectDescription());
		for (StepDefinition sd : srcObj.getStepDefinitionList()) {
			convertStepDefinition(sd);
		}
	}

	private void convertStepParameters(Interaction stepDefinition, StepParameters stepParametersSrc) {
		log.debug("step parameter: " + stepParametersSrc.getName());
		EAnnotation stepParameters = tgtObj.addStepParameters(stepDefinition,
				srcObj.getStepParametersName(stepParametersSrc));
		tgtObj.addStepParametersTable(stepParameters, srcObj.getStepParametersTable(stepParametersSrc));
		for (Row row : srcObj.getStepParametersRowList(stepParametersSrc)) {
			tgtObj.addStepParametersRow(stepParameters, srcObj.getStepParametersRow(stepParametersSrc, row));
		}
	}

	private void convertStepText(Message step, Step stepSrc) {
		tgtObj.addDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertTestCase(AbstractScenario scenarioSrc) {
		log.debug("test case: " + scenarioSrc.getName());
		Interaction scenarioTgt = tgtObj.addScenario(srcObj.getScenarioName(scenarioSrc));
		tgtObj.setScenarioTags(scenarioTgt, srcObj.getAbstractScenarioTags(scenarioSrc));
		tgtObj.setScenarioDescription(scenarioTgt, srcObj.getScenarioDescription(scenarioSrc));
		for (Step step : srcObj.getStepList(scenarioSrc)) {
			convertTestStep(scenarioTgt, step);
		}
		EList<Examples> examplesList = srcObj.getExamplesList(scenarioSrc);
		for (Examples examples : examplesList) {
			convertTestData(scenarioTgt, examples);
		}
	}

	private void convertTestData(Interaction abstractScenario, Examples examplesSrc) {
		EAnnotation examples = tgtObj.addExamples(abstractScenario, srcObj.getExamplesName(examplesSrc));
		tgtObj.addExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (Row row : srcObj.getExamplesRowList(examplesSrc)) {
			tgtObj.addExamplesRow(examples, srcObj.getExamplesRow(examplesSrc, row));
		}
	}

	private void convertTestSetup(AbstractScenario abstractScenario) {
		log.debug("test setup: " + abstractScenario.getName());
		Interaction background = tgtObj.addBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundTags(background, srcObj.getAbstractScenarioTags(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		for (Step step : srcObj.getStepList(abstractScenario)) {
			convertTestStep(background, step);
		}
	}

	private void convertTestStep(Interaction abstractScenario, Step stepSrc) {
		log.debug("test step: " + stepSrc.getName());
		Message step = tgtObj.addStep(abstractScenario, srcObj.getStep(stepSrc));
		tgtObj.setStepNameLong(step, srcObj.getStepNameLong(stepSrc));
		stepObjects.add(StepDefinitionHelper.getStepObjectQualifiedName(new LanguageAccessImpl(stepSrc)));

		if (srcObj.hasDocString(stepSrc)) {
			convertStepText(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepData(step, stepSrc);
		}
	}

	private void convertTestSuite(String path) throws Exception {
		log.debug("test suite: " + path);
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		for (AbstractScenario as : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(as)) {
				convertTestSetup(as);
			} else {
				convertTestCase(as);
			}
		}
	}

	public void initProjects() throws Exception {
		project = new AsciiDoctorProject(this.tags, this.fa);
		project.init();
		model = new TestProject(this.tags, this.fa);
		model.init();
		this.pathConverter = new AsciiDoctorPathConverter(model, (AsciiDoctorProject) project);
	}

	private boolean isObjectSelected(ConvertibleObject convertibleFile, String tags) throws Exception {
		// TODO abstract away the Feature/Adoc specific stuff, perhaps make a SourceFile
		// interfaces with Test case etc
		AsciiDoctorAdocWrapper ufw = (AsciiDoctorAdocWrapper) convertibleFile;
		if (ufw.getPath().startsWith(project.getDir(project.TEST_STEPS))) {
			for (String path : stepObjects) {
				if (ufw.getPath().contentEquals(project.getDir(project.TEST_STEPS) + "/" + path)) {
					return true;
				}
			}
		} else {
			if (tags.isEmpty()) {
				return true;
			}
			for (AbstractScenario a : ufw.getAbstractScenarioList()) {
				for (String t : ufw.getAbstractScenarioTags(a)) {
					if (t.trim().contentEquals(tags)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
