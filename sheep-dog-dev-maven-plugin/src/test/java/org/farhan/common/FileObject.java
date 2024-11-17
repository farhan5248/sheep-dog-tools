package org.farhan.common;

import java.io.File;

import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	public void setComponent(String component) {
		super.setComponent(component);
	}

	protected String getFile() {
		return new File(Config.getWorkingDir() + attributes.get("component") + "/" + attributes.get("path"))
				.getAbsolutePath();
	}

	protected void assertObjectExists() {
		try {
			Assertions.assertTrue(fa.contains(getFile()),
					"The file (" + getFile() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void setContent(String docString) {
		try {
			fa.put(getFile(), docString);
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void assertContent(String docString) {
		try {
			String contents = fa.get(getFile());
			Assertions.assertEquals(docString, contents.replaceAll("\r", "").trim());
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
