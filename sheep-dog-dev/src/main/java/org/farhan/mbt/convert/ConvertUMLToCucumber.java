package org.farhan.mbt.convert;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.Background;
import org.farhan.mbt.cucumber.Examples;
import org.farhan.mbt.cucumber.Scenario;
import org.farhan.mbt.cucumber.ScenarioOutline;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;
import org.farhan.helper.StepHelper;

public class ConvertUMLToCucumber extends Converter {

	public ConvertUMLToCucumber(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	private String lastComponent = "InitialComponent";
	private UMLClassWrapper srcObj;
	private CucumberFeatureWrapper tgtObj;

	// TODO temporarily overriding until incremental model updates are implemented
	protected void convertFeatures() throws Exception {
		for (ConvertibleObject co : srcPrj.getObjects(ConvertibleProject.TEST_OBJECTS)) {
			convertStepObject(co);
		}
		for (ConvertibleObject co : srcPrj.getObjects(ConvertibleProject.TEST_OBJECTS)) {
			convertStepDefinition(co);
		}
		for (ConvertibleObject co : getFeatures(ConvertibleProject.TEST_CASES)) {
			convertFeature(co);
		}
	}

	protected void convertAbstractScenarioList() throws Exception {
		for (Interaction abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
	}

	protected void convertBackground(Interaction abstractScenario) throws Exception {
		Background background = tgtObj.createBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), abstractScenario);
	}

	protected void convertDocString(Step step, Message srcStep) throws Exception {
		tgtObj.createDocString(step, srcObj.getDocString(srcStep));
		String stepName = srcObj.getStep(srcStep);
		stepName = stepName.substring(stepName.split(" ")[0].length() + 1);
		getTgtObj2(stepName).createDocString(stepName);
		getTgtObj3(stepName).createDocString(stepName);
	}

	protected void convertExamples(ScenarioOutline scenarioOutline, EAnnotation examplesSrc) {
		Examples examples = tgtObj.createExamples(scenarioOutline, srcObj.getExamplesName(examplesSrc));
		tgtObj.createExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (ArrayList<String> examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, examplesRow);
		}
	}

	protected void convertExamplesRow(Examples examples, ArrayList<String> examplesRow) {
		tgtObj.createExamplesRow(examples, examplesRow);
	}

	@Override
	protected void convertFeature(ConvertibleObject theObject) throws Exception {
		srcObj = (UMLClassWrapper) theObject;
		tgtObj = (CucumberFeatureWrapper) tgtPrj.createObject(convertQualifiedName(srcObj.getQualifiedName()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
		convertAbstractScenarioList();
	}

	private void convertStepObject(ConvertibleObject theObject) throws Exception {
		srcObj = (UMLClassWrapper) theObject;

		// TODO put this into step def name
		String path = srcObj.getQualifiedName();
		String componentName = path.split("::")[2];
		path = path.replace("pst::" + ConvertibleProject.TEST_OBJECTS + "::" + componentName,
				"::" + componentName.toLowerCase());
		path = path.replace("::", "/");
		path = tgtPrj.getDir(ConvertibleProject.TEST_OBJECTS) + path
				+ tgtPrj.getFileExt(ConvertibleProject.TEST_OBJECTS);

		CucumberJavaWrapper tgtObj = (CucumberJavaWrapper) tgtPrj.createObject(path);
		if (fa.contains(tags, path)) {
			tgtObj.parse(fa.get(tags, path));
		}

		// TODO convert to convertStepDefinition
		for (Interaction i : srcObj.getObjectStepList()) {
			tgtObj.createStep(srcObj.getStepDefinition(i));
		}

		// TODO if the step has docstring or data table, convert StepDefinitionParameter
	}

	private void convertStepDefinition(ConvertibleObject theObject) throws Exception {
		srcObj = (UMLClassWrapper) theObject;

		// TODO put this into step def name
		String path = srcObj.getQualifiedName();
		String[] pathParts = path.split("::");
		String componentName = pathParts[2];
		String objectName = pathParts[pathParts.length - 1];
		path = path.replace("pst::" + ConvertibleProject.TEST_OBJECTS + "::" + componentName,
				"::" + componentName.toLowerCase());
		path = path.replace(objectName, Utilities.upperFirst(componentName) + objectName + "Steps");
		path = path.replace("::", "/");
		path = tgtPrj.getDir(ConvertibleProject.TEST_STEPS) + path + tgtPrj.getFileExt(ConvertibleProject.TEST_STEPS);

		CucumberJavaWrapper tgtObj = (CucumberJavaWrapper) tgtPrj.createObject(path);
		if (fa.contains(tags, path)) {
			tgtObj.parse(fa.get(tags, path));
		}

		for (Interaction i : srcObj.getObjectStepList()) {
			tgtObj.createStep(srcObj.getStepDefinition(i));
		}
	}

	protected void convertScenario(Interaction srcScenario) throws Exception {
		Scenario scenario = tgtObj.createScenario(srcObj.getScenarioName(srcScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(srcScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(srcScenario));
		convertStepList(scenario, srcObj.getStepList(srcScenario), srcScenario);
	}

	protected void convertScenarioOutline(Interaction abstractScenario) throws Exception {

		ScenarioOutline scenarioOutline = tgtObj.createScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), abstractScenario);

		ArrayList<EAnnotation> examplesList = srcObj.getExamplesList(abstractScenario);
		for (EAnnotation examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	protected void convertStep(AbstractScenario abstractScenario, Message srcStep) throws Exception {
		Step tgtStep = tgtObj.createStep(abstractScenario, srcObj.getStep(srcStep));
		if (srcObj.hasDocString(srcStep)) {
			convertDocString(tgtStep, srcStep);
		} else if (srcObj.hasStepTable(srcStep)) {
			convertStepTable(tgtStep, srcStep);
		}
	}

	protected void convertStepList(AbstractScenario abstractScenario, ArrayList<Message> stepList,
			Interaction srcScenario) throws Exception {
		for (Message step : stepList) {
			convertStep(abstractScenario, step);
		}
	}

	protected void convertStepTable(Step step, Message srcStep) throws Exception {
		tgtObj.createStepTable(step, srcObj.getStepTable(srcStep));

		String stepName = srcObj.getStep(srcStep);
		stepName = stepName.substring(stepName.split(" ")[0].length() + 1);

		getTgtObj2(stepName).createStepTable(stepName, srcObj.getStepTable(srcStep));
		getTgtObj3(stepName).createStepTable(stepName, srcObj.getStepTable(srcStep));
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

	private String getStepDefName(String stepName) {
		String objectName = getObjectName(stepName);
		String objectType = Utilities.upperFirst(StepHelper.getObjectType(stepName));
		String componentName = getComponentName(stepName);
		return tgtPrj.getDir(ConvertibleProject.TEST_STEPS) + "/" + componentName.toLowerCase() + "/"
				+ Utilities.upperFirst(componentName) + objectName + objectType + "Steps.java";
	}

	private String getStepObjName(String stepName) {
		String objectName = getObjectName(stepName);
		String objectType = Utilities.upperFirst(StepHelper.getObjectType(stepName));
		String componentName = getComponentName(stepName);
		return tgtPrj.getDir(ConvertibleProject.TEST_OBJECTS) + "/" + componentName.toLowerCase() + "/" + objectName
				+ objectType + ".java";
	}

	protected CucumberJavaWrapper getTgtObj2(String stepName) throws Exception {
		String path = getStepDefName(stepName);
		return (CucumberJavaWrapper) ((CucumberProject) tgtPrj).getObject(path);
	}

	protected CucumberJavaWrapper getTgtObj3(String stepName) throws Exception {
		String path = getStepObjName(stepName);
		return (CucumberJavaWrapper) ((CucumberProject) tgtPrj).getObject(path);
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new UMLProject(this.tags, this.fa);
		tgtPrj = new CucumberProject(this.tags, this.fa);
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
