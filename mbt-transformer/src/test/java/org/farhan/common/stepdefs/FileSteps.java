package org.farhan.common.stepdefs;

import java.io.File;

import org.farhan.mbt.conv.core.Utilities;

import io.cucumber.java.Before;

public class FileSteps {

	@Before
	public void deleteFiles() throws Exception {
		Utilities.deleteDir(new File("target/src-gen/"), "");
	}

}
