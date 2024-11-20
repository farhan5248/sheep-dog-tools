package org.farhan.common;

import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	protected void assertObjectExists() {
		try {
			Assertions.assertTrue(contains("client", attributes.get("path")),
					"The file (" + attributes.get("path") + ") isn't present");
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void setContent(String docString) {
		try {
			put("client", attributes.get("path"), docString);
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void assertContent(String docString) {
		try {
			String contents = get("client", attributes.get("path"));
			Assertions.assertEquals(docString, contents.replaceAll("\r", "").trim());
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
