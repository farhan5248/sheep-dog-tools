package org.farhan.common;

import java.util.ArrayList;
import java.util.HashMap;

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

	protected void assertAbstractScenarioStepDataTableRowExists(String name, String stepName, String rowName) {
		assertStepExists(name, stepName);
		Assertions.assertTrue(getRow(getStep(name, stepName), rowName) != null, "Row " + rowName + " doesn't exist");
	}

	protected void assertAbstractScenarioTags(String name, String tags) {
		Section abstractScenario = getAbstractScenario(name);
		// TODO rename getScenarioTags to getAbstractScenarioTags
		Assertions.assertEquals(tags, wrapper.getScenarioTags(abstractScenario));
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

	private Section getExamples(String name, String examplesName) {
		for (Section e : wrapper.getExamplesList(getAbstractScenario(name))) {
			if (wrapper.getExamplesName(e).contentEquals(examplesName)) {
				return e;
			}
		}
		return null;
	}

	private Section getAbstractScenario(String name) {
		for (Section s : wrapper.getAbstractScenarioList()) {
			if (wrapper.getScenarioName(s).contentEquals(name)) {
				return s;
			}
		}
		return null;
	}

	private ArrayList<String> getRow(Section step, String rowName) {
		rowName = rowName.replaceAll(" +", " ");
		// TODO getDataTable is a mess, it's returning a list of cells as a pair of cell
		// name and value. Change it to a list of rows
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row = new ArrayList<String>();
		table.add(row);
		for (ArrayList<String> pair : wrapper.getDataTable(step, new HashMap<String, String>())) {
			if (pair.getFirst().startsWith("0")) {
				row.add(pair.getFirst().split(" ")[1]);
			} else {
				break;
			}
		}
		for (ArrayList<String> pair : wrapper.getDataTable(step, new HashMap<String, String>())) {
			int rowNum = Integer.valueOf(pair.getFirst().split(" ")[0]);
			if (rowNum + 1 == table.size()) {
				row = new ArrayList<String>();
				table.add(row);
			} else {
				row = table.get(rowNum + 1);
			}
			row.add(pair.getLast());
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

	private ArrayList<String> getExamplesRow(Section examples, String rowName) {
		wrapper.getExamplesRowList(examples);
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row = new ArrayList<String>();
		table.add(row);
		for (String key : wrapper.getExamplesRowList(examples).getFirst().keySet()) {
			row.add(key);
		}
		for (HashMap<String, String> r : wrapper.getExamplesRowList(examples)) {

			row = new ArrayList<String>();
			table.add(row);
			for (String c : r.values()) {
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

	private Section getStep(String name, String stepName) {
		for (Section s : wrapper.getStepList(getAbstractScenario(name))) {
			if (wrapper.getStep(s).contentEquals(stepName)) {
				return s;
			}
		}
		return null;
	}
}
