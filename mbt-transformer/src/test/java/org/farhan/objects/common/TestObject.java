package org.farhan.objects.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.farhan.conv.core.Utilities;
import org.junit.jupiter.api.Assertions;

import io.cucumber.datatable.DataTable;

public abstract class TestObject {

	protected Map<String, String> keyValue = new HashMap<String, String>();
	protected Object object;

	public void assertAttributes(DataTable dataTable) {
		processAttributes(dataTable, "assert", "", false);
	}

	public void setAttributes(DataTable dataTable) {
		processAttributes(dataTable, "set", "", false);
	}

	public void assertAttributes(DataTable dataTable, String sectionName) {
		processAttributes(dataTable, "assert", sectionName, false);
	}

	public void setAttributes(DataTable dataTable, String sectionName) {
		processAttributes(dataTable, "set", sectionName, false);
	}

	public void assertAttributes(DataTable dataTable, String sectionName, boolean negativeTest) {
		processAttributes(dataTable, "assert", sectionName, negativeTest);
	}

	public void setAttributes(DataTable dataTable, String sectionName, boolean negativeTest) {
		processAttributes(dataTable, "set", sectionName, negativeTest);
	}

	private void processAttributes(DataTable dataTable, String operation, String sectionName, boolean negativeTest) {
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
					object.getClass().getMethod(operation + cleanName(sectionName) + "Exists", HashMap.class).invoke(object, row);

				} else {
					for (int j = 0; j < data.get(i).size(); j++) {
						object.getClass().getMethod(operation + cleanName(sectionName) + cleanName(headers.get(j)), HashMap.class)
								.invoke(object, row);
					}
				}
			} catch (Exception e) {
				Assertions.fail(Utilities.getStackTraceAsString(e));
			}
		}
	}

	private String cleanName(String name) {
		return name.replaceAll("[ \\-\\(\\)/]", "");
	}
}
