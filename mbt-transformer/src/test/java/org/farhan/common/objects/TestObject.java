package org.farhan.common.objects;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.farhan.mbt.conv.core.Project;
import org.farhan.mbt.conv.core.Utilities;
import org.junit.jupiter.api.Assertions;

import io.cucumber.datatable.DataTable;

public abstract class TestObject {

	protected Map<String, String> keyValue = new HashMap<String, String>();

	public abstract TestObject execute();

	public TestObject setAttributes(String docString) {

		try {
			File aFile = new File(Project.baseDir + keyValue.get("path"));
			Utilities.writeFile(aFile, docString);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
		return this;
	}

	public TestObject assertAttributes(String docString) {
		try {
			File aFile = new File(Project.baseDir + keyValue.get("path"));
			String contents = Utilities.readFile(aFile);
			Assertions.assertEquals(docString, contents.replaceAll("\r", ""));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
		return this;
	}

	public TestObject assertAttributes(DataTable dataTable) {
		return processAttributes(dataTable, "assert", "", false);
	}

	public TestObject setAttributes(DataTable dataTable) {
		return processAttributes(dataTable, "set", "", false);
	}

	public TestObject assertAttributes(DataTable dataTable, String sectionName) {
		return processAttributes(dataTable, "assert", sectionName, false);
	}

	public TestObject setAttributes(DataTable dataTable, String sectionName) {
		return processAttributes(dataTable, "set", sectionName, false);
	}

	public TestObject assertAttributes(DataTable dataTable, String sectionName, boolean negativeTest) {
		return processAttributes(dataTable, "assert", sectionName, negativeTest);
	}

	public TestObject setAttributes(DataTable dataTable, String sectionName, boolean negativeTest) {
		return processAttributes(dataTable, "set", sectionName, negativeTest);
	}

	private TestObject processAttributes(DataTable dataTable, String operation, String sectionName,
			boolean negativeTest) {
		List<List<String>> data = dataTable.asLists();

		// TODO Remember to have Parameter/Value table vs multi-column header table
		ArrayList<String> headers = new ArrayList<String>();
		for (String cell : data.get(0)) {
			headers.add(cell);
		}
		for (int i = 1; i < data.size(); i++) {
			HashMap<String, String> row = new HashMap<String, String>();
			for (int j = 0; j < data.get(i).size(); j++) {
				row.put(headers.get(j), data.get(i).get(j));
			}
			try {
				if (negativeTest) {
					this.getClass().getMethod(operation + cleanName(sectionName) + "Exists", HashMap.class).invoke(this,
							row);

				} else {
					for (int j = 0; j < data.get(i).size(); j++) {
						this.getClass().getMethod(operation + cleanName(sectionName) + cleanName(headers.get(j)),
								HashMap.class).invoke(this, row);
					}
				}
			} catch (Exception e) {
				Assertions.fail(Utilities.getStackTraceAsString(e));
			}
		}
		return this;
	}

	private String cleanName(String name) {
		return name.replaceAll("[ \\-\\(\\)/]", "");
	}

}
