package org.farhan.common;

import java.io.File;

import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends GraphTestObject {

	public void setComponent(String component) {
		keyValue.put("component", component);
	}
	
	public void setPath(String path) {
		keyValue.put("path", ConvertibleProject.baseDir + path);
	}

	public void assertFileExists() {
		try {
			File theFile = new File(keyValue.get("path"));
			Assertions.assertTrue(theFile.exists(), "The file (" + theFile.getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	public void setContent(String docString) {
		try {
			File aFile = new File(keyValue.get("path"));
			Utilities.writeFile(aFile, docString);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	public void assertContent(String docString) {
		try {
			File aFile = new File(keyValue.get("path"));
			String contents = Utilities.readFile(aFile);
			Assertions.assertEquals(docString, contents.replaceAll("\r", ""));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

}
