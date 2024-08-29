package org.farhan.helper;

import org.farhan.helper.StepHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

	@Test
	public void testGetComponentObjectState() {
		Assertions.assertTrue(
				StepHelper.getComponent("The Something1 application, Something2 request is executed with")
						.contentEquals("Something1 application"));
	}

	@Test
	public void testGetComponentObject() {
		Assertions.assertTrue(StepHelper.getComponent("The Something1 application, Something2 request")
				.contentEquals("Something1 application"));
	}

	@Test
	public void testGetComponent() {
		Assertions.assertTrue(
				StepHelper.getComponent("The Something1 application, ").contentEquals("Something1 application"));
	}

	@Test
	public void testGetObjectComponentState() {
		Assertions.assertTrue(StepHelper.getObject("The Something1 application, Something2 request is executed with")
				.contentEquals("Something2 request"));
	}

	@Test
	public void testGetObjectComponent() {
		Assertions.assertTrue(StepHelper.getObject("The Something1 application, Something2 request")
				.contentEquals("Something2 request"));
	}

	@Test
	public void testGetObject() {
		Assertions.assertTrue(StepHelper.getObject("The Something2 request").contentEquals("Something2 request"));
	}

}
