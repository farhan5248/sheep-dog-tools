package org.farhan.tests.validating;

import org.farhan.validation.StepValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

	@Test
	public void testGetComponentObjectState() {
		Assertions.assertTrue(
				StepValidator.getComponent("The Something1 application, Something2 request is executed with")
						.contentEquals("Something1 application"));
	}

	@Test
	public void testGetComponentObject() {
		Assertions.assertTrue(StepValidator.getComponent("The Something1 application, Something2 request")
				.contentEquals("Something1 application"));
	}

	@Test
	public void testGetComponent() {
		Assertions.assertTrue(
				StepValidator.getComponent("The Something1 application, ").contentEquals("Something1 application"));
	}

	@Test
	public void testGetObjectComponentState() {
		Assertions.assertTrue(StepValidator.getObject("The Something1 application, Something2 request is executed with")
				.contentEquals("Something2 request"));
	}

	@Test
	public void testGetObjectComponent() {
		Assertions.assertTrue(StepValidator.getObject("The Something1 application, Something2 request")
				.contentEquals("Something2 request"));
	}

	@Test
	public void testGetObject() {
		Assertions.assertTrue(StepValidator.getObject("The Something2 request").contentEquals("Something2 request"));
	}

}
