package org.farhan.common;

import java.io.File;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	public void setComponent(String component) {
		attributes.put("component", component);
	}

	protected String getFile() {
		return new File(Config.getWorkingDir() + attributes.get("component") + "/" + attributes.get("path"))
				.getAbsolutePath();
	}

	protected void assertObjectExists() {
		try {
			Assertions.assertTrue(contains(getFile()), "The file (" + getFile() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void setContent(String docString) {
		try {
			put(getFile(), docString);
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void assertContent(String docString) {
		try {
			String contents = get(getFile());
			Assertions.assertEquals(docString, contents.replaceAll("\r", "").trim());
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
