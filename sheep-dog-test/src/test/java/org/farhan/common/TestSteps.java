package org.farhan.common;

import io.cucumber.java.Before;

public class TestSteps {

	@Before
	public void deleteFiles() throws Exception {
		TestObject.la = null;
	}
}
