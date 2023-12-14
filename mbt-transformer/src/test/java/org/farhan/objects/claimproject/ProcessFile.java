package org.farhan.objects.claimproject;

import java.io.File;

import org.farhan.conv.core.Project;
import org.farhan.conv.core.Utilities;
import org.farhan.objects.common.FeatureFile;
import org.junit.jupiter.api.Assertions;

public class ProcessFile extends FeatureFile {

	public void setPath(String path) {
		keyValue.put("path", path);
	}

	// TODO move this to FileObject
	public void setContents(String docString) {

		try {
			Project.baseDir = "target/src-gen/claim/";
			File aFile = new File(Project.baseDir + keyValue.get("path"));
			Utilities.writeFile(aFile, docString);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

}
