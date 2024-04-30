package org.farhan.common;

import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Step;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.junit.jupiter.api.Assertions;

public class FeatureFileObject extends FileObject {

	protected CucumberProject project;
	protected CucumberFeatureWrapper wrapper;

	protected void assertBackgroundExists(String name) {
		AbstractScenario abstractScenario = wrapper.getAbstractScenarioList().getFirst();
		Assertions.assertEquals(name, wrapper.getBackgroundName(abstractScenario));
	}

	protected void assertBackgroundStepDocString(String name, String stepName, String content) {
		assertScenarioExists(name);
		Step step = getStep(name, stepName);
		Assertions.assertTrue(step != null, "Step " + stepName + " doesn't exist");
		Assertions.assertEquals(content, wrapper.getDocString(step));
	}

	protected void assertBackgroundStepExists(String name, String stepName) {
		assertBackgroundExists(name);
		Assertions.assertTrue(getStep(name, stepName) != null, "Step " + stepName + " doesn't exist");
	}

	protected void assertDocumentExists() {
		assertFileExists();
		project = new CucumberProject();
		try {
			wrapper = (CucumberFeatureWrapper) project.createObject(theFile.getAbsolutePath());
			wrapper.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertFeatureExists(String name) {
		Assertions.assertEquals(name, wrapper.getFeatureName());
	}

	protected void assertFeatureTags(String name, String tags) {
		assertFeatureExists(name);
		Assertions.assertEquals(tags, wrapper.getFeatureTags());
	}

	protected void assertScenarioDescription(String string, String string2) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioExists(String string) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioOutlineExamplesExists(String string) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioOutlineExamplesTableRowExists(String string, String string2, String string3) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioOutlineExists(String string) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioOutlineStepDataTableRowExists(String string, String string2, String string3) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioOutlineStepExists(String string, String string2) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioStepExists(String string, String string2) {
		// TODO Auto-generated method stub

	}

	protected void assertScenarioTags(String string, String string2) {
		// TODO Auto-generated method stub

	}

	private AbstractScenario getAbstractScenario(String name) {
		for (AbstractScenario s : wrapper.getAbstractScenarioList()) {
			if (wrapper.getScenarioName(s).contentEquals(name)) {
				return s;
			}
		}
		return null;
	}

	private Step getStep(String name, String stepName) {
		for (Step s : wrapper.getStepList(getAbstractScenario(name))) {
			if (wrapper.getStep(s).contentEquals(stepName)) {
				return s;
			}
		}
		return null;
	}
}
