package org.farhan.common;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	public void setComponent(String component) {
		super.setComponent(component);
	}

	protected File getFile() {
		return new File(Config.getWorkingDir() + attributes.get("path"));
	}

	protected void assertObjectExists() {
		try {
			Assertions.assertTrue(getFile().exists(), "The file (" + getFile() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void setContent(String docString) {
		try {
			getFile().getParentFile().mkdirs();
			PrintWriter aPrintWriter = new PrintWriter(getFile(), StandardCharsets.UTF_8);
			aPrintWriter.print(docString);
			aPrintWriter.flush();
			aPrintWriter.close();
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	protected void assertContent(String docString) {
		try {
			String contents = new String(Files.readAllBytes(getFile().toPath()), StandardCharsets.UTF_8);
			Assertions.assertEquals(docString, contents.replaceAll("\r", "").trim());
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
