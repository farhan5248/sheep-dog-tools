package org.farhan.common;

import io.cucumber.java.Before;

public class TestSteps {

	@Before
	public static void before() {
		TestObjectFactory.reset();
	}
}
