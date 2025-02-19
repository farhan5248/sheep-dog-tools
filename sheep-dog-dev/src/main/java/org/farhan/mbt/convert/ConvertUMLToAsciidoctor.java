package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLClassWrapper;
import org.farhan.mbt.core.UMLModel;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.Background;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Scenario;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Logger;

public class ConvertUMLToAsciidoctor extends Converter {

	private UMLClassWrapper srcObj;
	private AsciiDoctorAdocWrapper tgtObj;

	public ConvertUMLToAsciidoctor(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	protected void convertAbstractScenarioList() throws Exception {
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

	@Override
	public String convertObject(String path, String content) throws Exception {
		log.debug("test suite: " + path);
		initProjects();
		srcObj = (UMLClassWrapper) model.createObject(getUMLPath(path));

		tgtObj = (AsciiDoctorAdocWrapper) project.createObject(path);
		tgtObj.parse(content);

		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
		return tgtObj.toString();
	}

	public ArrayList<String> getObjectNames() throws Exception {
		initProjects();
		ArrayList<String> objects = new ArrayList<String>();
		for (ConvertibleObject co : model.getObjects(model.TEST_CASES)) {
			objects.add(createFilePath(co.getPath(), model.TEST_CASES));
		}
		return objects;
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

	private void convertStepList(AbstractScenario abstractScenario, ArrayList<Message> stepList) {
		for (Message step : stepList) {
			log.debug("test step: " + step.getName());
			convertStep(abstractScenario, step);
		}
	}

	private void convertStepTable(Step step, Message stepSrc) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));
	}

	public void initProjects() throws Exception {
		model = new UMLModel(this.tags, this.fa);
		model.init();
		project = new AsciiDoctorProject(this.tags, this.fa);
		project.init();
	}

	public String getUMLPath(String path) {
		for (ConvertibleObject co : model.getObjects(model.TEST_CASES)) {
			if (createFilePath(co.getPath(), project.TEST_CASES).contentEquals(path)) {
				return co.getPath();
			}
		}
		for (ConvertibleObject co : model.getObjects(model.TEST_STEPS)) {
			if (createFilePath(co.getPath(), project.TEST_STEPS).contentEquals(path)) {
				return co.getPath();
			}
		}
		return null;
	}

	public String createFilePath(String umlPath, String layer) {
		// TODO move this to AsciiddoctorPathConverter
		String[] pathParts = umlPath.split("::");
		String componentName = pathParts[2];
		String objectName = pathParts[pathParts.length - 1];

		if (layer.contentEquals(model.TEST_CASES)) {
			umlPath = umlPath.replace("pst::" + model.TEST_CASES, "");
		}
		if (layer.contentEquals(model.TEST_STEPS)) {
			umlPath = umlPath.replace("pst::" + model.TEST_STEPS + "::" + componentName,
					"::" + componentName.toLowerCase());
			umlPath = umlPath.replace(objectName, StringUtils.capitalize(componentName) + objectName + "Steps");
		}
		umlPath = umlPath.replace("::", "/");
		umlPath = project.getDir(layer) + umlPath + project.getFileExt(layer);

		return umlPath;
	}
}
