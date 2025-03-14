package org.farhan.mbt.convert;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.Examples;
import org.farhan.mbt.cucumber.Row;
import org.farhan.mbt.cucumber.Scenario;
import org.farhan.mbt.cucumber.ScenarioOutline;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.TestCase;
import org.farhan.mbt.core.TestSuite;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.core.TestSetup;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.Logger;
import org.farhan.mbt.cucumber.CucumberFeature;
import org.farhan.mbt.cucumber.CucumberPathConverter;
import org.farhan.mbt.cucumber.CucumberTestProject;

public class ConvertCucumberToUML extends Converter {

	protected CucumberPathConverter pathConverter;
	private CucumberFeature srcObjTestSuite;
	private TestSuite tgtObj;

	public ConvertCucumberToUML(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	@Override
	public String convertFile(String path, String content) throws Exception {
		initProjects();
		convertTestSuite(path, content);
		return "";
	}

	private void convertStepData(Message step, Step srcStep, AbstractScenario srcAbstractScenario) {
		tgtObj.setStepTable(step, srcObjTestSuite.getStepTable(srcStep));
	}

	private void convertStepText(Message step, Step srcStep) {
		tgtObj.setDocString(step, srcObjTestSuite.getDocString(srcStep));
	}

	private void convertTestCase(AbstractScenario srcTestSuite, TestSuite testSuite) {
		log.debug("test case: " + srcTestSuite.getName());
		TestCase testCase = testSuite.addTestCase(srcObjTestSuite.getScenarioName(srcTestSuite));
		testCase.setTags(srcObjTestSuite.getScenarioTags(srcTestSuite));
		testCase.setDescription(srcObjTestSuite.getScenarioDescription(srcTestSuite));
		for (Step srcStep : srcObjTestSuite.getStepList(srcTestSuite)) {
			convertTestStep(testCase.getUmlElement(), srcStep, srcTestSuite);
		}
	}

	private void convertTestCaseWithTestData(AbstractScenario srcAbstractScenario, TestSuite testSuite) {
		log.debug("test case: " + srcAbstractScenario.getName());
		Interaction scenarioOutline = tgtObj
				.addTestCaseWithData(srcObjTestSuite.getScenarioOutlineName(srcAbstractScenario));
		tgtObj.setScenarioOutlineTags(scenarioOutline, srcObjTestSuite.getScenarioOutlineTags(srcAbstractScenario));
		tgtObj.setScenarioOutlineDescription(scenarioOutline,
				srcObjTestSuite.getScenarioOutlineDescription(srcAbstractScenario));
		for (Step srcStep : srcObjTestSuite.getStepList(srcAbstractScenario)) {
			convertTestStep(scenarioOutline, srcStep, srcAbstractScenario);
		}
		for (Examples srcExamples : srcObjTestSuite.getExamplesList(srcAbstractScenario)) {
			convertTestData(scenarioOutline, srcExamples);
		}
	}

	private void convertTestData(Interaction scenarioOutline, Examples srcExamples) {
		log.debug("test data: " + srcExamples.getName());
		EAnnotation examples = tgtObj.addTestData(scenarioOutline, srcObjTestSuite.getExamplesName(srcExamples));
		// TODO add examples description
		tgtObj.setExamplesTable(examples, srcObjTestSuite.getExamplesTable(srcExamples));
		for (Row row : srcObjTestSuite.getExamplesRowList(srcExamples)) {
			// TODO there shouldn't be a getExamplesRow method. This method should just
			// convert Row to ArrayList<String>. Maybe this is resolved when converting to
			// Step* and Test* classes.
			tgtObj.addExamplesRow(examples, srcObjTestSuite.getExamplesRow(srcExamples, row));
		}
	}

	private void convertTestSetup(AbstractScenario srcAbstractScenario, TestSuite testSuite) {
		log.debug("test setup: " + srcAbstractScenario.getName());
		TestSetup background = testSuite.addTestSetup(srcObjTestSuite.getBackgroundName(srcAbstractScenario));
		background.setTags(srcObjTestSuite.getFeatureTags());
		background.setDescription(srcObjTestSuite.getBackgroundDescription(srcAbstractScenario));
		for (Step srcStep : srcObjTestSuite.getStepList(srcAbstractScenario)) {
			convertTestStep(background.getUmlElement(), srcStep, srcAbstractScenario);
		}
	}

	private void convertTestStep(Interaction abstractScenario, Step srcStep, AbstractScenario srcAbstractScenario) {
		log.debug("test step: " + srcStep.getName());
		Message step = tgtObj.addStep(abstractScenario, srcObjTestSuite.getStepName(srcStep));
		tgtObj.setStepKeyword(step, srcObjTestSuite.getStepKeyword(srcStep));
		tgtObj.setStepNameLong(step, srcObjTestSuite.getStepNameLong(srcStep));

		if (srcObjTestSuite.hasDocString(srcStep)) {
			convertStepText(step, srcStep);
		} else if (srcObjTestSuite.hasStepTable(srcStep)) {
			convertStepData(step, srcStep, srcAbstractScenario);
		}
	}

	private void convertTestSuite(String path, String content) throws Exception {
		log.debug("test suite: " + path);

		srcObjTestSuite = (CucumberFeature) project.addFile(path);
		srcObjTestSuite.parse(content);
		if (isTestSuiteSelected()) {
			TestSuite testSuite = model.addTestSuite(pathConverter.convertUMLPath(srcObjTestSuite.getPath()));
			this.tgtObj = testSuite;
			testSuite.setFeatureDescription(srcObjTestSuite.getFeatureDescription());
			for (AbstractScenario as : srcObjTestSuite.getAbstractScenarioList()) {
				if (srcObjTestSuite.isBackground(as)) {
					convertTestSetup(as, testSuite);
				} else if (srcObjTestSuite.isScenarioOutline(as)) {
					convertTestCaseWithTestData(as, testSuite);
				} else {
					convertTestCase(as, testSuite);
				}
			}
			model.save();
		} else {
			project.deleteObject(srcObjTestSuite);
		}

	}

	public void initProjects() throws Exception {
		project = new CucumberTestProject(this.tag, this.fa);
		model = new TestProject(this.tag, this.fa);
		project.init();
		model.init();
		this.pathConverter = new CucumberPathConverter(model, (CucumberTestProject) project);
	}

	private boolean isTestSuiteSelected() throws Exception {
		boolean selected = tag.isEmpty();
		if (!selected) {
			for (String t : srcObjTestSuite.getFeatureTags()) {
				if (t.trim().contentEquals(tag)) {
					return true;
				}
			}
			for (AbstractScenario a : srcObjTestSuite.getAbstractScenarioList()) {
				if (a instanceof Scenario) {
					for (String t : srcObjTestSuite.getScenarioTags(a)) {
						if (t.trim().contentEquals(tag)) {
							return true;
						}
					}
				}
				if (a instanceof ScenarioOutline) {
					for (String t : srcObjTestSuite.getScenarioOutlineTags(a)) {
						if (t.trim().contentEquals(tag)) {
							return true;
						}
					}
				}
			}
		} else {
			return true;
		}
		return false;
	}
}
