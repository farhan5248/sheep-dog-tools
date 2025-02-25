package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorPathConverter;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLClassWrapper;
import org.farhan.mbt.core.UMLModel;
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

	private UMLClassWrapper srcObj;
	private AsciiDoctorAdocWrapper tgtObj;
	protected AsciiDoctorPathConverter pathConverter;

	public ConvertUMLToAsciidoctor(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	private void convertAbstractScenarioList() throws Exception {
		for (Interaction abstractScenario : srcObj.getAbstractScenarioList()) {
			log.debug("test case: " + abstractScenario.getName());
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	private void convertBackground(Interaction abstractScenario) {
		Background background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundTags(background, srcObj.getBackgroundTags(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario));
	}

	private void convertDocString(Step step, Message stepSrc) {
		tgtObj.createDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertExamples(Scenario abstractScenario, EAnnotation examplesSrc) {

		Examples examples = tgtObj.createExamples(abstractScenario, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (ArrayList<String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	private void convertExamplesRow(Examples examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	private String convertFeature(String tags, String path, String content) throws Exception {
		srcObj = (UMLClassWrapper) model.createObject(pathConverter.getUMLPath(path));
		tgtObj = (AsciiDoctorAdocWrapper) project.createObject(path);
		tgtObj.parse(content);
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
		return tgtObj.toString();
	}

	@Override
	public String convertObject(String path, String content) throws Exception {
		initProjects();
		if (path.startsWith(project.getDir(project.TEST_STEPS))) {
			log.debug("step object: " + path);
			return convertStepObject(tags, path, content);
		} else {
			log.debug("test suite: " + path);
			return convertFeature(tags, path, content);
		}
	}

	private void convertScenario(Interaction abstractScenario) {
		Scenario scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario));
	}

	private void convertScenarioOutline(Interaction abstractScenario) {

		Scenario scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario));

		ArrayList<EAnnotation> examplesList = srcObj.getExamplesList(abstractScenario);
		for (EAnnotation examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(AbstractScenario abstractScenario, Message stepSrc) {
		Step step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));
		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc);
		}
	}

	private void convertStepDefinition(Interaction stepDefinitionSrc) throws Exception {
		StepDefinition stepDefinition = tgtObj.createStepDefinition(srcObj.getStepDefinitionName(stepDefinitionSrc));
		tgtObj.setStepDefinitionDescription(stepDefinition, srcObj.getStepDefinitionDescription(stepDefinitionSrc));

		ArrayList<EAnnotation> parametersList = srcObj.getStepDefinitionParameterList(stepDefinitionSrc);
		for (EAnnotation parameters : parametersList) {
			convertStepParameters(stepDefinition, parameters);
		}

	}

	private void convertStepDefinitionList() throws Exception {
		for (Interaction stepDefinition : srcObj.getStepDefinitionList()) {
			log.debug("step definition: " + stepDefinition.getName());
			convertStepDefinition(stepDefinition);
		}
	}

	private void convertStepList(AbstractScenario abstractScenario, ArrayList<Message> stepList) {
		for (Message step : stepList) {
			log.debug("test step: " + step.getName());
			convertStep(abstractScenario, step);
		}
	}

	private String convertStepObject(String tags, String path, String content) throws Exception {
		srcObj = (UMLClassWrapper) model.createObject(pathConverter.getUMLPath(path));
		tgtObj = (AsciiDoctorAdocWrapper) project.createObject(path);
		tgtObj.parse(content);
		tgtObj.setStepObjectName(srcObj.getStepObjectName());
		tgtObj.setStepObjectDescription(srcObj.getStepObjectDescription());
		convertStepDefinitionList();
		return tgtObj.toString();
	}

	private void convertStepParameters(StepDefinition stepDefinition, EAnnotation parametersSrc) throws Exception {

		StepParameters stepParameters = tgtObj.createStepParameters(stepDefinition,
				srcObj.getStepParametersName(parametersSrc));
		tgtObj.createStepParametersTable(stepParameters, srcObj.getStepParametersTable(parametersSrc));
		for (ArrayList<String> stepParametersRow : srcObj.getStepParametersRowList(parametersSrc)) {
			convertStepParametersRow(stepParameters, stepParametersRow);
		}
	}

	private void convertStepParametersRow(StepParameters stepParameters, ArrayList<String> stepParametersRow) {
		tgtObj.createStepParametersRow(stepParameters, stepParametersRow);
	}

	private void convertStepTable(Step step, Message stepSrc) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));
	}

	public ArrayList<String> getObjectNames() throws Exception {
		initProjects();
		ArrayList<String> objects = new ArrayList<String>();
		for (ConvertibleObject co : model.getObjects(model.TEST_CASES)) {
			objects.add(pathConverter.createFilePath(co.getPath(), model.TEST_CASES));
		}
		for (ConvertibleObject co : model.getObjects(model.TEST_STEPS)) {
			objects.add(pathConverter.createFilePath(co.getPath(), model.TEST_STEPS));
		}
		return objects;
	}

	public void initProjects() throws Exception {
		model = new UMLModel(this.tags, this.fa);
		model.init();
		project = new AsciiDoctorProject(this.tags, this.fa);
		project.init();
		this.pathConverter = new AsciiDoctorPathConverter(model, (AsciiDoctorProject) project);
	}
}
