package org.farhan.mbt.convert;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.Examples;
import org.farhan.mbt.cucumber.Row;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Utilities;
import org.farhan.helper.StepHelper;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUML extends Converter {

	private CucumberFeatureWrapper srcObj;
	private UMLClassWrapper tgtObj;
	private UMLClassWrapper tgtObj2;
	private String lastComponent = "InitialComponent";

	public ConvertCucumberToUML(String tags, ObjectRepository fa) {
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
		convertStepList(background, srcObj.getStepList(abstractScenario), abstractScenario);
	}

	private void convertDocString(Message step, Step stepSrc) {
		tgtObj.createDocString(step, srcObj.getDocString(stepSrc));

		Interaction stepDef = tgtObj2.createStepDefinition(srcObj.getStep(stepSrc));
		tgtObj2.createStepDefinitionParameter(stepDef, "Content");
	}

	private void convertExamples(Interaction scenarioOutline, Examples examplesSrc) {
		EAnnotation examples = tgtObj.createExamples(scenarioOutline, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (Row examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, srcObj.getExamplesRow(examplesSrc, examplesRow));
		}
	}

	private void convertExamplesRow(EAnnotation examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject theObject) throws Exception {
		srcObj = (CucumberFeatureWrapper) theObject;
		tgtObj = (UMLClassWrapper) tgtPrj.createObject(convertFileName(srcObj.getFileName()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	private void convertScenario(AbstractScenario abstractScenario) {
		Interaction scenario = tgtObj.createScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario), abstractScenario);
	}

	private void convertScenarioOutline(AbstractScenario abstractScenario) {
		Interaction scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), abstractScenario);

		EList<Examples> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Examples examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(Interaction abstractScenario, Step stepSrc, AbstractScenario abstractScenarioSrc) {
		Message step = tgtObj.createStep(abstractScenario, srcObj.getStep(stepSrc));

		// TODO in the future, these two lines should be moved out of this method.
		// Instead the 2nd layer of feature files should be parsed if feature files are
		// being used instead of asciidoctor files
		tgtObj2 = (UMLClassWrapper) tgtPrj.createObject(getStepObjName(stepSrc.getName()));
		tgtObj2.createStepDefinition(srcObj.getStep(stepSrc));

		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc, abstractScenarioSrc);
		}
	}

	private void convertStepList(Interaction abstractScenario, EList<Step> stepList,
			AbstractScenario abstractScenarioSrc) {
		for (Step step : stepList) {
			convertStep(abstractScenario, step, abstractScenarioSrc);
		}
	}

	private void convertStepTable(Message step, Step stepSrc, AbstractScenario abstractScenarioSrc) {
		tgtObj.createStepTable(step, srcObj.getStepTable(stepSrc));

		Interaction stepDef = tgtObj2.createStepDefinition(srcObj.getStep(stepSrc));
		for (String param : srcObj.getStepTable(stepSrc).getFirst()) {
			tgtObj2.createStepDefinitionParameter(stepDef, param);
		}
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

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
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

	// TODO each converter needs its own object name converter? If each step is a
	// valid according to StepHelper, then when creating elements in the UML model,
	// it should handle name conversions
	private String getStepObjName(String stepName) {
		String objectName = getObjectName(stepName);
		String objectType = Utilities.upperFirst(StepHelper.getObjectType(stepName));
		String componentName = getComponentName(stepName);
		return ConvertibleProject.TEST_OBJECTS + "/" + componentName + "/" + objectName + objectType + ".java";
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new CucumberProject(this.tags, this.fa);
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
