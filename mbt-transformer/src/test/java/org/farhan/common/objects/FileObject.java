package org.farhan.common.objects;

import java.io.File;

import org.farhan.mbt.conv.core.Project;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {

	@Override
	public FileObject execute() {
		// TODO this doesn't make sense to be here, will refactor later
		return null;
	}

	public FileObject setBaseDir(String project) {
		Project.baseDir = "target/src-gen/" + project + "/";
		return this;
	}

	public FileObject setPath(String path) {
		keyValue.put("path", path);
		return this;
	}

	public FileObject assertIsPresent() {

		try {
			File theFile = new File(Project.baseDir + keyValue.get("path"));
			Assertions.assertTrue(theFile.exists(), "The file (" + theFile.getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
		return this;
	}

}
