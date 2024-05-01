package org.farhan.common;

import java.util.ArrayList;

import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Step;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.junit.jupiter.api.Assertions;

public class FeatureFileObject extends FileObject {

	private CucumberProject project;
	private CucumberFeatureWrapper wrapper;

	protected void assertBackgroundExists(String name) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		Assertions.assertEquals(name, wrapper.getBackgroundName(abstractScenario));
	}

	protected void assertBackgroundStepDocString(String name, String stepName, String content) {
		assertBackgroundStepExists(name, stepName);
		Step step = getStep(name, stepName);
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

	protected void assertScenarioDescription(String name, String description) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		Assertions.assertEquals(description, wrapper.getScenarioDescription(abstractScenario));
	}

	protected void assertScenarioExists(String name) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		Assertions.assertTrue(abstractScenario != null, "Scenario " + name + " doesn't exist");
	}

	protected void assertScenarioOutlineExamplesExists(String name, String examplesName) {
		assertScenarioOutlineExists(name);
		Assertions.assertTrue(getExamples(name, examplesName) != null, "Examples " + examplesName + " doesn't exist");
	}

	protected void assertScenarioOutlineExamplesTableRowExists(String name, String examplesName, String rowName) {
		assertScenarioOutlineExamplesExists(name, examplesName);
		Object row = getRow(getExamples(name, examplesName), rowName);
		Assertions.assertTrue(row != null, "Row " + rowName + " doesn't exist");
	}

	protected void assertScenarioOutlineExists(String name) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		Assertions.assertEquals(name, wrapper.getScenarioOutlineName(abstractScenario));
	}

	protected void assertScenarioOutlineStepDataTableRowExists(String name, String stepName, String rowName) {
		assertScenarioOutlineStepExists(name, stepName);
		ArrayList<String> row = getRow(getStep(name, stepName), rowName);
		Assertions.assertTrue(row != null, "Row " + rowName + " doesn't exist");
	}

	protected void assertScenarioOutlineStepExists(String name, String stepName) {
		assertScenarioOutlineExists(name);
		Assertions.assertTrue(getStep(name, stepName) != null, "Step " + stepName + " doesn't exist");
	}

	protected void assertScenarioStepExists(String name, String stepName) {
		assertScenarioExists(name);
		Assertions.assertTrue(getStep(name, stepName) != null, "Step " + stepName + " doesn't exist");
	}

	protected void assertScenarioTags(String name, String tags) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		Assertions.assertEquals(tags, wrapper.getScenarioTags(abstractScenario));
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

	private Examples getExamples(String name, String examplesName) {
		for (Examples e : wrapper.getExamplesList(getAbstractScenario(name))) {
			if (wrapper.getExamplesName(e).contentEquals(examplesName)) {
				return e;
			}
		}
		return null;
	}

	private String getRow(Examples examples, String rowName) {
		rowName = rowName.replaceAll(" +", " ");
		// TODO make table handling consistent, so use list of list and have one method
		// return both header and body
		String hString = "|";
		for (String h : wrapper.getExamplesTable(examples).split(",")) {
			hString += " " + h + " |";
		}
		if (hString.contentEquals(rowName)) {
			// TODO this is a temp hack because the table header and body row types are not
			// the same, fix that first then return Row.
			// TODO make methods to test for existence in the main classes
			return rowName;
		}
		for (Row r : wrapper.getExamplesRowList(examples)) {
			String rString = "|";
			for (Cell c : r.getCells()) {
				rString += " " + c.getName() + " |";
			}
			if (rString.contentEquals(rowName)) {
				return rowName;
			}
		}
		return null;
	}

	private ArrayList<String> getRow(Step step, String rowName) {
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
}
