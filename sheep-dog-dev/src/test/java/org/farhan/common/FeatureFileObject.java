package org.farhan.common;

import java.util.ArrayList;

import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.Cell;
import org.farhan.mbt.cucumber.Examples;
import org.farhan.mbt.cucumber.Row;
import org.farhan.mbt.cucumber.Scenario;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.junit.jupiter.api.Assertions;

public class FeatureFileObject extends FileObject {

	private CucumberProject project;
	private CucumberFeatureWrapper wrapper;

	protected void assertAbstractScenarioDescription(String name, String description) {
		Assertions.assertEquals(description, wrapper.getScenarioDescription(getAbstractScenario(name)));
	}

	protected void assertAbstractScenarioExists(String name) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		Assertions.assertTrue(abstractScenario != null, "Scenario " + name + " doesn't exist");
	}

	protected void assertAbstractScenarioStepStepTableRowExists(String name, String stepName, String rowName) {
		assertStepExists(name, stepName);
		Assertions.assertTrue(getRow(getStep(name, stepName), rowName) != null, "Row " + rowName + " doesn't exist");
	}

	protected void assertAbstractScenarioTags(String name, String tags) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		if (abstractScenario instanceof Scenario) {
			Assertions.assertEquals(tags, Utilities.listAsCsv(wrapper.getScenarioTags(abstractScenario)));
		} else {
			Assertions.assertEquals(tags, Utilities.listAsCsv(wrapper.getScenarioOutlineTags(abstractScenario)));
		}
	}

	protected void assertDocString(String name, String stepName, String content) {
		assertStepExists(name, stepName);
		Step step = getStep(name, stepName);
		Assertions.assertEquals(content, wrapper.getDocString(step));
	}

	protected void assertFeatureName(String name) {
		Assertions.assertEquals(name, wrapper.getFeatureName());
	}

	protected void assertFeatureStatements(String name, String statements) {
		Assertions.assertEquals(statements, wrapper.getFeatureDescription());
	}

	protected void assertFeatureTags(String name, String tags) {
		Assertions.assertEquals(tags, Utilities.listAsCsv(wrapper.getFeatureTags()));
	}

	protected void assertObjectExists() {
		super.assertObjectExists();
		project = new CucumberProject();
		try {
			wrapper = (CucumberFeatureWrapper) project.createObject(getFile().getAbsolutePath());
			wrapper.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertScenarioOutlineExamplesExists(String name, String examplesName) {
		assertAbstractScenarioExists(name);
		Assertions.assertTrue(getExamples(name, examplesName) != null, "Examples " + examplesName + " doesn't exist");
	}

	protected void assertScenarioOutlineExamplesTableRowExists(String name, String examplesName, String rowName) {
		assertScenarioOutlineExamplesExists(name, examplesName);
		Assertions.assertTrue(getRow(getExamples(name, examplesName), rowName) != null,
				"Row " + rowName + " doesn't exist");
	}

	protected void assertStepExists(String name, String stepName) {
		assertAbstractScenarioExists(name);
		Assertions.assertTrue(getStep(name, stepName) != null, "Step " + stepName + " doesn't exist");
	}

	private AbstractScenario getAbstractScenario(String name) {
		for (AbstractScenario s : wrapper.getAbstractScenarioList()) {
			if (wrapper.getScenarioName(s).contentEquals(name)) {
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
		String rString = "|";
		for (String header : wrapper.getExamplesTable(examples)) {
			rString += " " + header + " |";
		}
		if (rString.contentEquals(rowName)) {
			return rowName;
		}
		for (Row row : wrapper.getExamplesRowList(examples)) {
			rString = "|";
			for (Cell c : row.getCells()) {
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
		for (ArrayList<String> r : wrapper.getStepTable(step)) {
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

	private Step getStep(String name, String stepName) {
		for (Step s : wrapper.getStepList(getAbstractScenario(name))) {
			if (wrapper.getStep(s).contentEquals(stepName)) {
				return s;
			}
		}
		return null;
	}
}
