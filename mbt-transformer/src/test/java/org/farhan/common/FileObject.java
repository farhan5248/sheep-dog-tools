package org.farhan.common;

import java.io.File;

import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends GraphTestObject {

	protected File theFile = null;

	public void setComponent(String component) {
		super.setComponent(component);
		ConvertibleProject.baseDir = "target/src-gen/" + component + "/";
	}

	private File getFile() {
		if (theFile == null) {
			theFile = new File(ConvertibleProject.baseDir + keyValue.get("path"));
		}
		return theFile;
	}

	public void assertFileExists() {
		try {
			Assertions.assertTrue(getFile().exists(), "The file (" + getFile().getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	public void setContent(String docString) {
		try {
			Utilities.writeFile(getFile(), docString);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	public void assertContent(String docString) {
		try {
			String contents = Utilities.readFile(getFile());
			Assertions.assertEquals(docString, contents.replaceAll("\r", ""));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}
}
