package org.farhan.common;

import java.util.ArrayList;

import org.asciidoctor.ast.Section;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.Step;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public class AdocFileObject extends FileObject {

	private AsciiDoctorProject project;
	private AsciiDoctorAdocWrapper wrapper;

	protected void assertAbstractScenarioDescription(String name, String description) {
		Assertions.assertEquals(description, wrapper.getScenarioDescription(getAbstractScenario(name)));
	}

	protected void assertAbstractScenarioExists(String name) {
		Assertions.assertTrue(getAbstractScenario(name) != null, "Abstract Scenario " + name + " doesn't exist");
	}

	protected void assertAbstractScenarioStepDataTableRowExists(String name, String stepName, String rowName) {
		assertStepExists(name, stepName);
		Assertions.assertTrue(getRow(getStep(name, stepName), rowName) != null, "Row " + rowName + " doesn't exist");
	}

	private ArrayList<String> getRow(String step, String rowName) {
		rowName = rowName.replaceAll(" +", " ");
		for (ArrayList<String> r : wrapper.getDataTable(step)) {
			String rString = "|";
			for (String c : r) {
				rString += " " + c + " |";
			}
			if (rString.contentEquals(rowName)) {
				return r;
			}
		}
		return null;
	}
	
	protected void assertAbstractScenarioTags(String name, String tags) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		if (abstractScenario instanceof Scenario) {
			Assertions.assertEquals(tags, wrapper.getScenarioTags(abstractScenario));
		} else {
			Assertions.assertEquals(tags, wrapper.getScenarioOutlineTags(abstractScenario));
		}
	}
	
	private AbstractScenario getAbstractScenario(String name) {
		for (AbstractScenario s : wrapper.getAbstractScenarioList()) {
			if (wrapper.getScenarioName(s).contentEquals(name)) {
				return s;
			}
		}
		return null;
	}

	protected void assertDocString(String name, String stepName, String content) {
		assertAbstractScenarioExists(name);
		assertStepExists(name, stepName);
		Assertions.assertEquals(content, wrapper.getDocString(getStep(name, stepName)));
	}

	protected void assertFeatureName(String name) {
		Assertions.assertEquals(name, wrapper.getFeatureName());
	}

	protected void assertFeatureTags(String name, String tags) {
		Assertions.assertEquals(tags, wrapper.getFeatureTags());
	}

	protected void assertObjectExists() {
		super.assertObjectExists();
		project = new AsciiDoctorProject();
		try {
			wrapper = (AsciiDoctorAdocWrapper) project.createObject(getFile().getAbsolutePath());
			wrapper.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertStepExists(String name, String stepName) {
		assertAbstractScenarioExists(name);
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
