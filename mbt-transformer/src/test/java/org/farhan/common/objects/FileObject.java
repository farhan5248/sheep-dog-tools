package org.farhan.common.objects;

import java.io.File;

import org.farhan.mbt.conv.core.Project;
import org.farhan.mbt.conv.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	@Override
	public void execute() {
		// TODO this doesn't make sense to be here, will refactor later
	}

	public void setBaseDir(String project) {
		Project.baseDir = "target/src-gen/" + project + "/";
	}

	public void setPath(String path) {
		keyValue.put("path", path);
	}

	public void assertWillBePresent() {

		try {
			File theFile = new File(Project.baseDir + keyValue.get("path"));
			Assertions.assertTrue(theFile.exists(), "The file (" + theFile.getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void setAttributes(String docString) {
		// TODO delete this after adding bodies to the versions in TestObject
		setContent(docString);
	}

	public void assertAttributes(String docString) {
		// TODO delete this after adding bodies to the versions in TestObject
		assertContent(docString);
	}

	public void setContent(String docString) {

		try {
			File aFile = new File(Project.baseDir + keyValue.get("path"));
			Utilities.writeFile(aFile, docString);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void assertContent(String docString) {
		try {
			File aFile = new File(Project.baseDir + keyValue.get("path"));
			String contents = Utilities.readFile(aFile);
			Assertions.assertEquals(docString, contents.replaceAll("\r", ""));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

}
