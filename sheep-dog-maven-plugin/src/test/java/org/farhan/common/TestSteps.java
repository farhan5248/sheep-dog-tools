package org.farhan.common;

import java.io.File;

import org.farhan.mbt.core.Utilities;

import io.cucumber.java.Before;

public class TestSteps {
	
	@Before
	public void deleteFiles() throws Exception {
		Utilities.deleteDir(new File("target/src-gen/"), "");
	}
}
