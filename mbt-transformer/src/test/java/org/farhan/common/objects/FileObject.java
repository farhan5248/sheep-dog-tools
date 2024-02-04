package org.farhan.common.objects;

import java.io.File;

import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends GraphModelObject {

	public void setBaseDir(String projectName) {
		ConvertibleProject.baseDir = "target/src-gen/" + projectName + "/";
	}

	public void setPath(String path) {
		keyValue.put("path", path);
	}

	public void assertFileExists() {
		try {
			File theFile = new File(ConvertibleProject.baseDir + keyValue.get("path"));
			Assertions.assertTrue(theFile.exists(), "The file (" + theFile.getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void setContent(String docString) {
		try {
			File aFile = new File(ConvertibleProject.baseDir + keyValue.get("path"));
			Utilities.writeFile(aFile, docString);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void assertContent(String docString) {
		try {
			File aFile = new File(ConvertibleProject.baseDir + keyValue.get("path"));
			String contents = Utilities.readFile(aFile);
			Assertions.assertEquals(docString, contents.replaceAll("\r", ""));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

}
