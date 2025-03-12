package org.farhan.common;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorStepObject;
import org.farhan.mbt.asciidoctor.AsciiDoctorTestSuite;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.Cell;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepParameters;
import org.junit.jupiter.api.Assertions;

public class AdocFileObject extends FileObject {

	private AsciiDoctorTestSuite testSuite;
	private AsciiDoctorStepObject stepObject;

	protected void assertAbstractScenarioDescription(String name, String description) {
		Assertions.assertEquals(description, testSuite.getScenarioDescription(getAbstractScenario(name)));
	}

	protected void assertAbstractScenarioExists(String name) {
		Assertions.assertTrue(getAbstractScenario(name) != null, "Abstract Scenario " + name + " doesn't exist");
	}

	protected void assertAbstractScenarioStepStepTableRowExists(String name, String stepName, String rowName) {
		assertStepExists(name, stepName);
		Assertions.assertTrue(getRow(getStep(name, stepName), rowName) != null, "Row " + rowName + " doesn't exist");
	}

	protected void assertAbstractScenarioTags(String name, String tags) {
		AbstractScenario abstractScenario = getAbstractScenario(name);
		Assertions.assertEquals(tags, Utilities.listAsCsv(testSuite.getAbstractScenarioTags(abstractScenario)));
	}

	protected void assertDocString(String name, String stepName, String content) {
		assertAbstractScenarioExists(name);
		assertStepExists(name, stepName);
		Assertions.assertEquals(content, testSuite.getDocString(getStep(name, stepName)));
	}

	protected void assertFeatureName(String name) {
		Assertions.assertEquals(name, testSuite.getFeatureName());
	}

	protected void assertFeatureStatements(String name, String statements) {
		Assertions.assertEquals(statements, testSuite.getFeatureDescription());
	}

	protected void deleteObject() {
		super.assertFileExists();
		try {
			sr.delete(attributes.get("path"));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}

	protected void assertTestSuiteExists() {
		super.assertFileExists();
		try {
			testSuite = new AsciiDoctorTestSuite(attributes.get("path"));
			testSuite.parse(sr.get(attributes.get("path")));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}

	protected void assertStepObjectExists() {
		super.assertFileExists();
		try {
			stepObject = new AsciiDoctorStepObject(attributes.get("path"));
			stepObject.parse(sr.get(attributes.get("path")));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}

	protected void assertScenarioOutlineExamplesExists(String name, String examplesName) {
		assertAbstractScenarioExists(name);
		Assertions.assertTrue(getExamples(name, examplesName) != null, "Examples " + examplesName + " doesn't exist");
	}

	protected void assertScenarioOutlineExamplesTableRowExists(String name, String examplesName, String rowName) {
		assertScenarioOutlineExamplesExists(name, examplesName);
		Assertions.assertTrue(getExamplesRow(getExamples(name, examplesName), rowName) != null,
				"Row " + rowName + " doesn't exist");
	}

	protected void assertStepDefinitionDescription(String name, String description) {
		Assertions.assertEquals(description, stepObject.getStepDefinitionDescription(getStepDefinition(name)));
	}

	protected void assertStepDefinitionExists(String name) {
		Assertions.assertTrue(getStepDefinition(name) != null, "Step Definition " + name + " doesn't exist");
	}

	protected void assertStepDefinitionParametersExists(String string, String string2) {
		// TODO Auto-generated method stub

	}

	protected void assertStepDefinitionParametersTableRowExists(String name, String parametersName, String rowName) {
		assertStepDefinitionParametersExists(name, parametersName);
		Assertions.assertTrue(getParametersRow(getParameters(name, parametersName), rowName) != null,
				"Row " + rowName + " doesn't exist");
	}

	protected void assertStepExists(String name, String stepName) {
		assertAbstractScenarioExists(name);
		Assertions.assertTrue(getStep(name, stepName) != null, "Step " + stepName + " doesn't exist");
	}

	protected void assertStepObjectName(String name) {
		Assertions.assertEquals(name, stepObject.getStepObjectName());
	}

	protected void assertStepObjectStatements(String name, String statements) {
		Assertions.assertEquals(statements, stepObject.getStepObjectDescription());
	}

	private AbstractScenario getAbstractScenario(String name) {
		for (AbstractScenario s : testSuite.getAbstractScenarioList()) {
			if (testSuite.getScenarioName(s).contentEquals(name)) {
				return s;
			}
		}
		return null;
	}

	private Examples getExamples(String name, String examplesName) {
		for (Examples e : testSuite.getExamplesList(getAbstractScenario(name))) {
			if (testSuite.getExamplesName(e).contentEquals(examplesName)) {
				return e;
			}
		}
		return null;
	}

	private ArrayList<String> getExamplesRow(Examples examples, String rowName) {
		return getRow(testSuite.getExamplesRowList(examples), testSuite.getExamplesTable(examples), rowName);
	}

	private StepParameters getParameters(String name, String parametersName) {
		for (StepParameters e : stepObject.getStepParametersList(getStepDefinition(name))) {
			if (stepObject.getStepParametersName(e).contentEquals(parametersName)) {
				return e;
			}
		}
		return null;
	}

	private ArrayList<String> getParametersRow(StepParameters parameters, String rowName) {
		return getRow(stepObject.getStepParametersRowList(parameters), stepObject.getStepParametersTable(parameters),
				rowName);
	}

	private ArrayList<String> getRow(ArrayList<Row> rows, ArrayList<String> header, String rowName) {
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row = new ArrayList<String>();
		table.add(row);
		for (String colName : header) {
			row.add(colName);
		}
		for (Row r : rows) {
			row = new ArrayList<String>();
			table.add(row);
			for (Cell c : r.getCells()) {
				row.add(c.getName());
			}
		}
		for (ArrayList<String> cellList : table) {
			String rowCsv = "";
			for (String cell : cellList) {
				rowCsv += ", " + cell;
			}
			rowCsv = rowCsv.replaceFirst(", ", "");
			if (rowCsv.contentEquals(rowName)) {
				return cellList;
			}
		}
		return null;
	}

	private ArrayList<String> getRow(Step step, String csvRow) {
		csvRow = csvRow.replaceAll(" +", " ");
		for (ArrayList<String> row : testSuite.getStepTable(step)) {
			// convert it to csv
			String rowCsv = "";
			for (String cell : row) {
				rowCsv += ", " + cell;
			}
			rowCsv = rowCsv.replaceFirst(", ", "");
			// if it matches, return it
			if (rowCsv.contentEquals(csvRow)) {
				return row;
			}
		}
		return null;
	}

	private Step getStep(String name, String stepName) {
		for (Step s : testSuite.getStepList(getAbstractScenario(name))) {
			if (testSuite.getStepName(s).contentEquals(stepName)) {
				return s;
			}
		}
		return null;
	}

	private StepDefinition getStepDefinition(String name) {
		for (StepDefinition s : stepObject.getStepDefinitionList()) {
			if (stepObject.getStepDefinitionName(s).contentEquals(name)) {
				return s;
			}
		}
		return null;
	}
}
