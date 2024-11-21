package org.farhan.common;

import java.util.ArrayList;
import org.asciidoctor.ast.Section;
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

	protected void assertAbstractScenarioStepStepTableRowExists(String name, String stepName, String rowName) {
		assertStepExists(name, stepName);
		Assertions.assertTrue(getRow(getStep(name, stepName), rowName) != null, "Row " + rowName + " doesn't exist");
	}

	protected void assertAbstractScenarioTags(String name, String tags) {
		Section abstractScenario = getAbstractScenario(name);
		Assertions.assertEquals(tags, Utilities.listAsCsv(wrapper.getAbstractScenarioTags(abstractScenario)));
	}

	protected void assertDocString(String name, String stepName, String content) {
		assertAbstractScenarioExists(name);
		assertStepExists(name, stepName);
		Assertions.assertEquals(content, wrapper.getDocString(getStep(name, stepName)));
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
		try {
			wrapper = new AsciiDoctorAdocWrapper(attributes.get("path"));
			wrapper.load(sr.get(attributes.get("path")));
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

	private Section getExamples(String name, String examplesName) {
		for (Section e : wrapper.getExamplesList(getAbstractScenario(name))) {
			if (wrapper.getExamplesName(e).contentEquals(examplesName)) {
				return e;
			}
		}
		return null;
	}

	private ArrayList<String> getExamplesRow(Section examples, String rowName) {
		wrapper.getExamplesRowList(examples);
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row = new ArrayList<String>();
		table.add(row);
		for (String colName : wrapper.getExamplesTable(examples)) {
			row.add(colName);
		}
		for (ArrayList<String> r : wrapper.getExamplesRowList(examples)) {
			row = new ArrayList<String>();
			table.add(row);
			for (String c : r) {
				row.add(c);
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

	private ArrayList<String> getRow(Section step, String csvRow) {
		csvRow = csvRow.replaceAll(" +", " ");
		for (ArrayList<String> row : wrapper.getStepTable(step)) {
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

	private Section getStep(String name, String stepName) {
		for (Section s : wrapper.getStepList(getAbstractScenario(name))) {
			if (wrapper.getStep(s).contentEquals(stepName)) {
				return s;
			}
		}
		return null;
	}
}
