package org.farhan.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.farhan.dsl.common.Utilities;
import org.junit.jupiter.api.Assertions;

import io.cucumber.datatable.DataTable;

// Anything that is an input, output, state or transition is a GraphModelObject. 
// Right now the way I model stuff all the objects are either output ones or input+transition ones
public abstract class TestObject {

	static EclipseImpl la = null;

	protected HashMap<String, String> keyValue = new HashMap<String, String>();

	public void assertInputOutputs(DataTable dataTable) {
		processInputOutputs(dataTable, "assert", "");
	}

	public void assertInputOutputs(DataTable dataTable, String sectionName) {
		processInputOutputs(dataTable, "assert", sectionName);
	}

	public void assertInputOutputs(DataTable dataTable, String sectionName, boolean negativeTest) {
		processInputOutputs(dataTable, "assert", sectionName);
	}

	public void assertInputOutputs(String key) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, "true");
		processInputOutputs(row, "assert", "");
	}

	public void assertInputOutputs(String key, boolean negativeTest) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, Boolean.toString(negativeTest));
		processInputOutputs(row, "assert", "");
	}

	public void assertInputOutputs(String key, String value) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, value);
		processInputOutputs(row, "assert", "");
	}

	private String cleanName(String name) {
		return name.replaceAll("[ \\-\\(\\)/]", "");
	}

	protected EclipseImpl getEclipseMock() {
		if (la == null) {
			la = new EclipseImpl();
		}
		return la;
	}

	protected String getSpecial(String value) {
		if (value.contentEquals("empty")) {
			return "";
		} else {
			return value;
		}
	}

	private void processInputOutputs(DataTable dataTable, String operation, String sectionName) {
		List<List<String>> data = dataTable.asLists();

		ArrayList<String> headers = new ArrayList<String>();
		for (String cell : data.get(0)) {
			headers.add(cell);
		}
		for (int i = 1; i < data.size(); i++) {
			HashMap<String, String> row = new HashMap<String, String>();
			for (int j = 0; j < data.get(i).size(); j++) {
				row.put(headers.get(j), data.get(i).get(j));
			}
			processInputOutputs(row, operation, sectionName);
		}
	}

	private void processInputOutputs(HashMap<String, String> row, String operation, String sectionName) {
		try {
			for (String fieldName : row.keySet()) {
				this.getClass().getMethod(operation + cleanName(sectionName) + cleanName(fieldName), HashMap.class)
						.invoke(this, row);
			}
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	public void setComponent(String component) {
		keyValue.put("component", component);
	}

	public void setInputOutputs(DataTable dataTable) {
		processInputOutputs(dataTable, "set", "");
	}

	public void setInputOutputs(DataTable dataTable, String sectionName) {
		processInputOutputs(dataTable, "set", sectionName);
	}

	public void setInputOutputs(DataTable dataTable, String sectionName, boolean negativeTest) {
		processInputOutputs(dataTable, "set", sectionName);
	}

	public void setInputOutputs(String key, String value) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, value);
		processInputOutputs(row, "set", "");
	}

	public void setInputOutputs(String key) {
		// TODO in the future, the value can be true/false for is present/valid etc when
		// is vs isn't is used
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, "true");
		processInputOutputs(row, "set", "");
	}

	public void setPath(String path) {
		keyValue.put("path", path);
	}

	public void transition() {
	}
}
