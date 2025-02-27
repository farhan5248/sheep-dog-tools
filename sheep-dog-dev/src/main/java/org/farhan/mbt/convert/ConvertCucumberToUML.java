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
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.TestSuite;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Logger;
import org.farhan.mbt.cucumber.CucumberFeature;
import org.farhan.mbt.cucumber.CucumberPathConverter;
import org.farhan.mbt.cucumber.CucumberTestProject;

public class ConvertCucumberToUML extends Converter {

	private CucumberFeature srcObj;
	private TestSuite tgtObj;
	protected CucumberPathConverter pathConverter;

	public ConvertCucumberToUML(String tags, ObjectRepository fa, Logger log) {
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

	private void convertBackground(AbstractScenario abstractScenario) {
		Interaction background = tgtObj.addBackground(srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundTags(background, srcObj.getFeatureTags());
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(abstractScenario), abstractScenario);
	}

	private void convertDocString(Message step, Step stepSrc) {
		tgtObj.addDocString(step, srcObj.getDocString(stepSrc));
	}

	private void convertExamples(Interaction scenarioOutline, Examples examplesSrc) {
		EAnnotation examples = tgtObj.addExamples(scenarioOutline, srcObj.getExamplesName(examplesSrc));
		tgtObj.addExamplesTable(examples, srcObj.getExamplesTable(examplesSrc));
		for (Row examplesRow : srcObj.getExamplesRowList(examplesSrc)) {
			convertExamplesRow(examples, srcObj.getExamplesRow(examplesSrc, examplesRow));
		}
	}

	private void convertExamplesRow(EAnnotation examples, ArrayList<String> examplesRow) {
		tgtObj.addExamplesRow(examples, examplesRow);
	}

	@Override
	public String convertFile(String path, String content) throws Exception {
		log.debug("test suite: " + path);
		initProjects();
		srcObj = (CucumberFeature) project.addObject(path);
		srcObj.parse(content);
		if (isFileSelected(srcObj, tags)) {
			tgtObj = (TestSuite) testProject.addTestSuite(pathConverter.convertUMLPath(path));
			tgtObj.setFeatureName(srcObj.getFeatureName());
			tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
			convertAbstractScenarioList();
			testProject.save();
		} else {
			project.deleteObject(srcObj);
		}
		return "";
	}

	private void convertScenario(AbstractScenario abstractScenario) {
		Interaction scenario = tgtObj.addScenario(srcObj.getScenarioName(abstractScenario));
		tgtObj.setScenarioTags(scenario, srcObj.getScenarioTags(abstractScenario));
		tgtObj.setScenarioDescription(scenario, srcObj.getScenarioDescription(abstractScenario));
		convertStepList(scenario, srcObj.getStepList(abstractScenario), abstractScenario);
	}

	private void convertScenarioOutline(AbstractScenario abstractScenario) {
		Interaction scenarioOutline = tgtObj.addScenarioOutline(srcObj.getScenarioOutlineName(abstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObj.getScenarioOutlineTags(abstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline, srcObj.getScenarioOutlineDescription(abstractScenario));
		convertStepList(scenarioOutline, srcObj.getStepList(abstractScenario), abstractScenario);

		EList<Examples> examplesList = srcObj.getExamplesList(abstractScenario);
		for (Examples examples : examplesList) {
			convertExamples(scenarioOutline, examples);
		}
	}

	private void convertStep(Interaction abstractScenario, Step stepSrc, AbstractScenario abstractScenarioSrc) {
		Message step = tgtObj.addStep(abstractScenario, convertStepKeyword(srcObj.getStep(stepSrc)));
		tgtObj.setStepNameLong(step, convertStepKeyword(srcObj.getStepNameLong(stepSrc)));

		if (srcObj.hasDocString(stepSrc)) {
			convertDocString(step, stepSrc);
		} else if (srcObj.hasStepTable(stepSrc)) {
			convertStepTable(step, stepSrc, abstractScenarioSrc);
		}
	}

	private String convertStepKeyword(String step) {
		String keyword = step.split(" ")[0];
		step.replace(keyword, keyword + ":");
		return step.replaceFirst("^" + keyword, keyword + ":");
	}

	private void convertStepList(Interaction abstractScenario, EList<Step> stepList,
			AbstractScenario abstractScenarioSrc) {
		for (Step step : stepList) {
			log.debug("test step: " + step.getName());
			convertStep(abstractScenario, step, abstractScenarioSrc);
		}
	}

	private void convertStepTable(Message step, Step stepSrc, AbstractScenario abstractScenarioSrc) {
		tgtObj.addStepTable(step, srcObj.getStepTable(stepSrc));
	}

	public void initProjects() throws Exception {
		project = new CucumberTestProject(this.tags, this.fa);
		testProject = new TestProject(this.tags, this.fa);
		project.init();
		testProject.init();
		this.pathConverter = new CucumberPathConverter(testProject, (CucumberTestProject) project);
	}

	// TODO abstract away the Feature/Adoc specific stuff, perhaps make a SourceFile
	// interfaces with Test case etc
	private boolean isFileSelected(ConvertibleObject convertibleFile, String tag) throws Exception {

		CucumberFeature ufw = (CucumberFeature) convertibleFile;
		if (isTagged(ufw.getFeatureTags(), tag)) {
			return true;
		}
		for (AbstractScenario a : ufw.getAbstractScenarioList()) {
			if (ufw.isScenarioOutline(a)) {
				if (isTagged(ufw.getScenarioOutlineTags(a), tag)) {
					return true;
				}
			} else if (!ufw.isBackground(a)) {
				if (isTagged(ufw.getScenarioTags(a), tag)) {
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
