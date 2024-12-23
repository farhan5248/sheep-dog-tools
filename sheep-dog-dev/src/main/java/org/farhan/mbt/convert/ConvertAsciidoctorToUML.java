package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.asciidoctor.ast.Section;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.helper.StepHelper;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLClassWrapper;
import org.farhan.mbt.core.UMLModel;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.core.Converter;

public class ConvertAsciidoctorToUML extends Converter {

	private AsciiDoctorAdocWrapper srcObj;
	private UMLClassWrapper tgtObj;
	private String lastComponent = "InitialComponent";

	public ConvertAsciidoctorToUML(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	protected void convertAbstractScenarioList() throws Exception {
		for (AbstractScenario abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
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

	private void convertExamples(Interaction abstractScenario, Examples examples2) {
		EAnnotation examples = tgtObj.createExamples(abstractScenario, srcObj.getExamplesName(examples2));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examples2));
		for (Row examplesRow : srcObj.getExamplesRowList(examples2)) {
			convertExamplesRow(examples, srcObj.getExamplesRow(examples2, examplesRow));
		}
	}

	private void convertExamplesRow(EAnnotation examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	public String convertObject(String path, String content) throws Exception {
		initProjects();
		srcObj = (AsciiDoctorAdocWrapper) project.createObject(path);
		srcObj.parse(content);
		if (isFileSelected(srcObj, tags)) {
			tgtObj = (UMLClassWrapper) model.createObject(convertSrcPath(path, project.TEST_CASES));
			tgtObj.setFeatureName(srcObj.getFeatureName());
			tgtObj.setFeatureTags(srcObj.getFeatureTags());
			tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
			convertAbstractScenarioList();
			model.save();
		} else {
			project.deleteObject(srcObj);
		}
		return "";
	}

	private void convertScenario(AbstractScenario abstractScenario) {
		Interaction scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario));
	}

	private void convertScenarioOutline(AbstractScenario abstractScenario) {

		Interaction scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario));

		EList<Examples> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Examples examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(Interaction abstractScenario, Step stepSrc) {
		Message step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));

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
			convertStep(abstractScenario, step);
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

	// TODO these are duplicates of cucumber to uml converter. Also in the future
	// when there's a layer 2 for adoc this won't be needed. Instead the layer 2
	// will be read directly. This should also already exist in the sheep-dog-test
	// library so perhaps first refactor to use that?
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
		if (isTagged(ufw.getFeatureTags(), tags)) {
			return true;
		}
		for (AbstractScenario a : ufw.getAbstractScenarioList()) {
			if (ufw.isScenarioOutline(a)) {
				if (isTagged(ufw.getScenarioOutlineTags(a), tags)) {
					return true;
				}
			} else if (!ufw.isBackground(a)) {
				if (isTagged(ufw.getScenarioTags(a), tags)) {
					return true;
				}
			}
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
