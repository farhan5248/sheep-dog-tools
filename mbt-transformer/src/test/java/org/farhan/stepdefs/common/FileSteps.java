package org.farhan.stepdefs.common;

import java.io.File;

import org.farhan.conv.core.Utilities;
import io.cucumber.java.Before;

public class FileSteps {

	@Before
	public void deleteFiles() throws Exception {
		Utilities.deleteDir(new File("target/src-gen/"), "");
	}

}
