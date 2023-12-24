package org.farhan.objects.common;

import java.io.File;

import org.farhan.conv.core.Project;
import org.farhan.conv.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	public void setBaseDir(String project) {
		Project.baseDir = "target/src-gen/" + project + "/";
	}

	public void setPath(String path) {
		keyValue.put("path", path);
	}

	public void assertExists() {

		try {
			File theFile = new File(Project.baseDir + keyValue.get("path"));
			Assertions.assertTrue(theFile.exists(), "The file (" + theFile.getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void setContents(String docString) {

		try {
			File aFile = new File(Project.baseDir + keyValue.get("path"));
			Utilities.writeFile(aFile, docString);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void assertContents(String docString) {
		try {
			File aFile = new File(Project.baseDir + keyValue.get("path"));
			String contents = Utilities.readFile(aFile);
			Assertions.assertEquals(docString, contents.replaceAll("\r", ""));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}
}
