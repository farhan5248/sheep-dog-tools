package org.farhan.objects.common;

import java.io.File;

import org.farhan.conv.core.Project;
import org.junit.jupiter.api.Assertions;

public abstract class FileObject extends TestObject {
	
	
	public void assertExists() {

		try {
			File theFile = new File(Project.baseDir + keyValue.get("path"));
			Assertions.assertTrue(theFile.exists(), "The file (" + theFile.getCanonicalPath() + ") isn't present");
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}
}
