package org.farhan.common;

import org.asciidoctor.ast.Section;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public class AdocFileObject extends FileObject {

	private AsciiDoctorProject project;
	private AsciiDoctorAdocWrapper wrapper;

	protected void assertBackgroundExists(String name) {
		Section abstractScenario = wrapper.getAbstractScenarioList().getFirst();
		Assertions.assertEquals(name, wrapper.getBackgroundName(abstractScenario));
	}

	protected void assertBackgroundStepExists(String name, String stepName) {
		assertBackgroundExists(name);
		Assertions.assertTrue(getStep(name, stepName) != null, "Step " + stepName + " doesn't exist");
	}

	protected void assertDocumentExists() {
		assertFileExists();
		project = new AsciiDoctorProject();
		try {
			wrapper = (AsciiDoctorAdocWrapper) project.createObject(theFile.getAbsolutePath());
			wrapper.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertFeatureExists(String name) {
		Assertions.assertEquals(name, wrapper.getFeatureName());
	}

	protected void assertFeatureTags(String name, String tags) {
		Assertions.assertEquals(name, wrapper.getFeatureName());
		Assertions.assertEquals(tags, wrapper.getFeatureTags());
	}

	protected void assertScenarioExists(String name) {
		Section abstractScenario = getAbstractScenario(name);
		Assertions.assertTrue(abstractScenario != null, "Scenario " + name + " doesn't exist");
	}

	protected void assertScenarioStepDocString(String name, String stepName, String content) {
		assertScenarioExists(name);
		Section step = getStep(name, stepName);
		Assertions.assertTrue(step != null, "Step " + stepName + " doesn't exist");
		Assertions.assertEquals(content, wrapper.getDocString(step));
	}

	protected void assertScenarioStepExists(String name, String stepName) {
		assertScenarioExists(name);
		Assertions.assertTrue(getStep(name, stepName) != null, "Step " + stepName + " doesn't exist");
	}

	private Section getAbstractScenario(String name) {
		for (Section s : wrapper.getAbstractScenarioList()) {
			if (wrapper.getScenarioName(s).contentEquals(name)) {
				return s;
			}
		}
		return null;
	}

	private Section getStep(String name, String stepName) {
		for (Section s : wrapper.getStepList(getAbstractScenario(name))) {
			if (wrapper.getStep(s).contentEquals(stepName)) {
				return s;
			}
		}
		return null;
	}
}
