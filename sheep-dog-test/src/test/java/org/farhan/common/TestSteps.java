package org.farhan.common;

import java.io.File;

import io.cucumber.java.Before;

public class TestSteps {
	
	@Before
	public void deleteFiles() throws Exception {
		Utilities.deleteDir(new File("target/src-gen/"), "");
	}
}
