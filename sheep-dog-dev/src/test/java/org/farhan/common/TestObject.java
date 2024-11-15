package org.farhan.common;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.farhan.mbt.core.FileAccessor;
import org.junit.jupiter.api.Assertions;

import io.cucumber.datatable.DataTable;

public abstract class TestObject implements FileAccessor {

	protected HashMap<String, String> attributes = new HashMap<String, String>();

	public ArrayList<File> recursivelyListFiles(File aDir, String extension) {
		ArrayList<File> theFiles = new ArrayList<File>();
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File tempFile = new File(aDir.getAbsolutePath() + File.separator + s);
				if (tempFile.isDirectory()) {
					theFiles.addAll(recursivelyListFiles(tempFile, extension));
				} else if (tempFile.getAbsolutePath().toLowerCase().endsWith(extension.toLowerCase())) {
					theFiles.add(tempFile);
				}
			}
		}
		return theFiles;
	}

	public String readFile(File aFile) throws Exception {
		return new String(Files.readAllBytes(Paths.get(aFile.toURI())), StandardCharsets.UTF_8);
	}

	public void writeFile(File aFile, String content) throws Exception {
		aFile.getParentFile().mkdirs();
		PrintWriter aPrintWriter = new PrintWriter(aFile, StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}

	public String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		String exceptionAsString = sw.toString();
		return exceptionAsString;
	}

	public void assertInputOutputs(DataTable dataTable) {
		processInputOutputs(dataTable, "assert", "", false);
	}

	public void assertInputOutputs(DataTable dataTable, String sectionName) {
		processInputOutputs(dataTable, "assert", sectionName, false);
	}

	public void assertInputOutputs(DataTable dataTable, String sectionName, boolean negativeTest) {
		processInputOutputs(dataTable, "assert", sectionName, negativeTest);
	}

	public void assertInputOutputs(String key) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, "true");
		processInputOutputs(row, "assert", "", false);
	}

	public void assertInputOutputs(String key, boolean negativeTest) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, Boolean.toString(negativeTest));
		processInputOutputs(row, "assert", "", negativeTest);
	}

	public void assertInputOutputs(String key, String value) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, value);
		processInputOutputs(row, "assert", "", false);
	}

	private String cleanName(String name) {
		return name.replaceAll("[ \\-\\(\\)/]", "");
	}

	private void processInputOutputs(DataTable dataTable, String operation, String sectionName, boolean negativeTest) {
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
			processInputOutputs(row, operation, sectionName, negativeTest);
		}
	}

	private void processInputOutputs(HashMap<String, String> row, String operation, String sectionName,
			boolean negativeTest) {
		try {
			// TODO I should have methods that operate against an entire row and those
			// against an individual field. That would imply that there are methods per
			// combination of fields. If that's the case, then how to prevent an explosion
			// of methods? Perhaps when specifying something doesn't exist, the mere
			// presence of the negative won't or isn't should indicate that one method
			// should be generated. Then this method would look for that method alone.
			for (String s : row.keySet()) {

				// TODO this if statement is a temp hack until negative code is generated
				if (negativeTest) {
					this.getClass()
							.getMethod(operation + cleanName(sectionName) + cleanName(s) + "Negative", HashMap.class)
							.invoke(this, row);
				} else {
					this.getClass().getMethod(operation + cleanName(sectionName) + cleanName(s), HashMap.class)
							.invoke(this, row);
				}
			}
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	public void setComponent(String component) {
		attributes.put("component", component);
	}

	public void setInputOutputs(DataTable dataTable) {
		processInputOutputs(dataTable, "set", "", false);
	}

	public void setInputOutputs(DataTable dataTable, String sectionName) {
		processInputOutputs(dataTable, "set", sectionName, false);
	}

	public void setInputOutputs(DataTable dataTable, String sectionName, boolean negativeTest) {
		processInputOutputs(dataTable, "set", sectionName, negativeTest);
	}

	public void setInputOutputs(String key, String value) {
		HashMap<String, String> row = new HashMap<String, String>();
		row.put(key, value);
		processInputOutputs(row, "set", "", false);
	}

	public void setPath(String path) {
		attributes.put("path", path);
	}

	public void transition() {
	}
}
