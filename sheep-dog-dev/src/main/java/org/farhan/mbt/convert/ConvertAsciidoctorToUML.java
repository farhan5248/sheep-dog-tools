package org.farhan.mbt.convert;

import java.util.ArrayList;
import org.asciidoctor.ast.Section;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;
import org.farhan.helper.StepHelper;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.core.Converter;

public class ConvertAsciidoctorToUML extends Converter {

	private AsciiDoctorAdocWrapper srcObj;
	private UMLClassWrapper tgtObj;
	private String lastComponent = "InitialComponent";

	public ConvertAsciidoctorToUML(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	protected void convertAbstractScenarioList() throws Exception {
		for (Section abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	private void convertBackground(Section abstractScenario) {
		Interaction background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario));
	}

	private void convertDocString(Message step, Section stepSrc) {
		tgtObj.createDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertExamples(Interaction abstractScenario, Section examplesSrc) {
		EAnnotation examples = tgtObj.createExamples(abstractScenario, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (ArrayList<String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	private void convertExamplesRow(EAnnotation examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject theObject) throws Exception {
		srcObj = (AsciiDoctorAdocWrapper) theObject;
		tgtObj = (UMLClassWrapper) tgtPrj.createObject(convertFileName(srcObj.getFileName()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	private void convertScenario(Section abstractScenario) {
		Interaction scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario));
	}

	private void convertScenarioOutline(Section abstractScenario) {

		Interaction scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario));

		ArrayList<Section> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Section examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(Interaction abstractScenario, Section stepSrc) {
		Message step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));

		UMLClassWrapper stpObj = (UMLClassWrapper) tgtPrj.createObject(getStepObjName(stepSrc.getTitle()));
		stpObj.createStepDefinition(srcObj.getStep(stepSrc));

		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc);
		}
	}

	// TODO these are duplicates of cuke to uml converter. Also in the future when
	// there's a layer 2 for adoc this won't be needed. Instead the layer 2 will be
	// read directly
	private String getStepObjName(String stepName) {
		String objectName = getObjectName(stepName);
		String objectType = Utilities.upperFirst(StepHelper.getObjectType(stepName));
		String componentName = getComponentName(stepName);
		return ConvertibleProject.TEST_OBJECTS + "/" + componentName + "/" + objectName + objectType + ".adoc";
	}

	protected String getComponentName(String step) {
		String name = StepHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			name = Utilities.removeDelimiterAndCapitalize(name, "\\.");
			name = Utilities.removeDelimiterAndCapitalize(name, "\\-");
			name = Utilities.removeDelimiterAndCapitalize(name, " ");
			lastComponent = name;
		}
		return name;
	}

	private String getObjectName(String step) {
		String name = StepHelper.getObjectName(step);
		String nameParts[] = name.split("/");
		name = nameParts[nameParts.length - 1];
		name = Utilities.removeDelimiterAndCapitalize(name, "\\.");
		name = Utilities.removeDelimiterAndCapitalize(name, "\\-");
		name = Utilities.removeDelimiterAndCapitalize(name, " ");
		name = Utilities.upperFirst(name);
		return name;
	}

	private void convertStepList(Interaction abstractScenario, ArrayList<Section> stepList) {
		for (Section step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	private void convertStepTable(Message step, Section stepSrc) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new AsciiDoctorProject(this.tags, this.fa);
		tgtPrj = new UMLProject(this.tags, this.fa);
	}

	@Override
	protected void load() throws Exception {
		srcPrj.load();
	}

	@Override
	public void save() throws Exception {
		tgtPrj.save();
	}

}
