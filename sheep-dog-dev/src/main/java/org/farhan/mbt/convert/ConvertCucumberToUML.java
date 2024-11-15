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
import org.farhan.mbt.core.FileAccessor;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUML extends MojoGoal {

	public ConvertCucumberToUML(String tags, FileAccessor fa) {
		super(tags, fa);
	}

	private CucumberFeatureWrapper srcObj;
	private UMLClassWrapper tgtObj;

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
	}

	@Override
	protected ArrayList<ConvertibleObject> getFeatures(String layer) {
		return srcPrj.getObjects(layer);
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
