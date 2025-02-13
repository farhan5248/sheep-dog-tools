package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.helper.StepHelper;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Logger;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLClassWrapper;
import org.farhan.mbt.core.UMLModel;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepParameters;
import org.farhan.mbt.core.Converter;

public class ConvertAsciidoctorToUML extends Converter {

	private AsciiDoctorAdocWrapper srcObj;
	private UMLClassWrapper tgtObj;
	private String lastComponent = "InitialComponent";

	public ConvertAsciidoctorToUML(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	protected void convertAbstractScenarioList() throws Exception {
		for (AbstractScenario abstractScenario : srcObj.getAbstractScenarioList()) {
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

	private void convertStepDefinitionList() {
		for (StepDefinition abstractScenario : srcObj.getStepDefinitionList()) {
			log.debug("step definition: " + abstractScenario.getName());
			convertStepDefinition(abstractScenario);
		}
	}

	private void convertBackground(AbstractScenario abstractScenario) {
		Interaction background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario));
	}

	private void convertDocString(Message step, Step stepSrc) {
		tgtObj.createDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertStepParameters(Interaction stepDefinition, StepParameters stepParametersSrc) {
		EAnnotation stepParameters = tgtObj.createStepParameters(stepDefinition,
				srcObj.getStepParametersName(stepParametersSrc));
		tgtObj.createStepParametersTable(stepParameters, srcObj.getStepParametersTable(stepParametersSrc));
		for (Row row : srcObj.getStepParametersRowList(stepParametersSrc)) {
			tgtObj.createStepParametersRow(stepParameters, srcObj.getStepParametersRow(stepParametersSrc, row));
		}
	}

	private void convertExamples(Interaction abstractScenario, Examples examplesSrc) {
		EAnnotation examples = tgtObj.createExamples(abstractScenario, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (Row row : srcObj.getExamplesRowList(examplesSrc)) {
			tgtObj.createExamplesRow(examples, srcObj.getExamplesRow(examplesSrc, row));
		}
	}

	@Override
	public String convertObject(String path, String content) throws Exception {
		initProjects();
		srcObj = (AsciiDoctorAdocWrapper) project.createObject(path);
		srcObj.parse(content);
		if (isFileSelected(srcObj, tags)) {
			if (path.startsWith(project.getDir(project.TEST_STEPS))) {
				log.debug("step object: " + path);
				tgtObj = (UMLClassWrapper) model.createObject(convertSrcPath(path, project.TEST_STEPS));
				tgtObj.setStepObjectName(srcObj.getStepObjectName());
				tgtObj.setStepObjectDescription(srcObj.getStepObjectDescription());
				convertStepDefinitionList();
			} else {
				log.debug("test suite: " + path);
				tgtObj = (UMLClassWrapper) model.createObject(convertSrcPath(path, project.TEST_CASES));
				tgtObj.setFeatureName(srcObj.getFeatureName());
				tgtObj.setFeatureTags(srcObj.getFeatureTags());
				tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
				convertAbstractScenarioList();
			}
			model.save();
		} else {
			project.deleteObject(srcObj);
		}
		return "";
	}

	private void convertScenario(AbstractScenario abstractScenario) {
		Interaction scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getAbstractScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario));
	}

	private void convertStepDefinition(StepDefinition stepDefinitionSrc) {
		// TODO the Given + is a temp hack. Technically it doesn't matter, only the uml
		// to cucumber should add the Given. Delete this after generating code from adoc
		// and not feature files.
		Interaction stepDefinition = tgtObj
				.createStepDefinition("Given " + srcObj.getStepDefinitionName(stepDefinitionSrc));
		tgtObj.setStepDefinitionDescription(stepDefinition, srcObj.getStepDefinitionDescription(stepDefinitionSrc));
		convertStepParametersList(stepDefinition, srcObj.getStepParametersList(stepDefinitionSrc));
	}

	private void convertScenarioOutline(AbstractScenario abstractScenario) {

		Interaction scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getAbstractScenarioTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario));

		EList<Examples> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Examples examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(Interaction abstractScenario, Step stepSrc) {
		Message step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));

		// TODO Instead of creating the object, add the name to a list
		UMLClassWrapper stpObj = (UMLClassWrapper) model
				.createObject(convertSrcPath(getStepObjName(stepSrc.getName()), project.TEST_OBJECTS));
		stpObj.createStepDefinition(srcObj.getStep(stepSrc));

		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc);
		}
	}

	private void convertStepList(Interaction abstractScenario, EList<Step> stepList) {
		for (Step step : stepList) {
			log.debug("test step: " + step.getName());
			convertStep(abstractScenario, step);
		}
	}

	private void convertStepParametersList(Interaction stepDefinition, EList<StepParameters> stepParametersList) {
		for (StepParameters stepParameters : stepParametersList) {
			log.debug("step parameter: " + stepParameters.getName());
			convertStepParameters(stepDefinition, stepParameters);
		}
	}

	private void convertStepTable(Message step, Step stepSrc) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));
	}

	protected String getComponentName(String step) {
		String name = StepHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			name = removeDelimiterAndCapitalize(name, "\\.");
			name = removeDelimiterAndCapitalize(name, "\\-");
			name = removeDelimiterAndCapitalize(name, " ");
			lastComponent = name;
		}
		return name;
	}

	private String getObjectName(String step) {
		String name = StepHelper.getObjectName(step);
		String nameParts[] = name.split("/");
		name = nameParts[nameParts.length - 1];
		name = removeDelimiterAndCapitalize(name, "\\.");
		name = removeDelimiterAndCapitalize(name, "\\-");
		name = removeDelimiterAndCapitalize(name, " ");
		name = StringUtils.capitalize(name);
		return name;
	}

	// TODO these are duplicates of cucumber to uml converter. This exists in the
	// sheep-dog-test library so perhaps first refactor to use that?
	private String getStepObjName(String stepName) {
		String objectName = getObjectName(stepName);
		String objectType = StringUtils.capitalize(StepHelper.getObjectType(stepName));
		String componentName = getComponentName(stepName);
		return project.getDir(project.TEST_OBJECTS) + "/" + componentName + "/" + objectName + objectType + ".asciidoc";
	}

	protected void initProjects() throws Exception {
		project = new AsciiDoctorProject(this.tags, this.fa);
		project.init();
		model = new UMLModel(this.tags, this.fa);
		model.init();
	}

	// TODO abstract away the Feature/Adoc specific stuff, perhaps make a SourceFile
	// interfaces with Test case etc
	private boolean isFileSelected(ConvertibleObject convertibleFile, String tags) throws Exception {

		AsciiDoctorAdocWrapper ufw = (AsciiDoctorAdocWrapper) convertibleFile;
		if (ufw.getPath().startsWith(project.getDir(project.TEST_CASES))) {
			if (isTagged(ufw.getFeatureTags(), tags)) {
				return true;
			}
			for (AbstractScenario a : ufw.getAbstractScenarioList()) {
				if (ufw.isScenarioOutline(a)) {
					if (isTagged(ufw.getAbstractScenarioTags(a), tags)) {
						return true;
					}
				} else if (!ufw.isBackground(a)) {
					if (isTagged(ufw.getAbstractScenarioTags(a), tags)) {
						return true;
					}
				}
			}
		} else {
			// TODO make tests for when a layer 2 file not referenced.
			// TODO this won't work, a list of layer two files need to be referenced so
			// create those when parsing each step
			return project.getObject(ufw.getPath()) != null;

		}
		return false;
	}

	private boolean isTagged(ArrayList<String> tags, String tag) {
		if (tag.isEmpty()) {
			return true;
		}
		for (String t : tags) {
			if (t.trim().contentEquals(tag)) {
				return true;
			}
		}
		return false;
	}

}
