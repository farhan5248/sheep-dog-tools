package org.farhan.common;

import java.io.File;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	public void setComponent(String component) {
		attributes.put("component", component);
	}

	protected File getFile() {
		return new File("target/src-gen/" + attributes.get("component") + "/" + attributes.get("path"));
	}

	protected void assertObjectExists() {
		try {
			Assertions.assertTrue(getFile().exists(), "The file (" + getFile().getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void setContent(String docString) {
		try {
			writeFile(getFile(), docString);
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void assertContent(String docString) {
		try {
			String contents = readFile(getFile());
			Assertions.assertEquals(docString, contents.replaceAll("\r", "").trim());
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
