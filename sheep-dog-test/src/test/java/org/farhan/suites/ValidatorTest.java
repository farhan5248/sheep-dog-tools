package org.farhan.suites;

import org.farhan.helper.StepHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

	@Test
	public void testGetComponentObjectState() {
		Assertions.assertTrue(StepHelper.getComponent("The Something1 application, Something2 request is executed with")
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

	@Test
	public void testGetPredicate() {
		Assertions.assertTrue(StepHelper
				.getPredicate("The Something1 application, Something2 request Something3 section is executed with")
				.contentEquals("Something3 section is executed with"));
	}

	@Test
	public void testHasModalityWithDetails() {
		Assertions.assertTrue(
				StepHelper.getUpToModality("The Something1 application, Something2 request Something3 section is")
						.contentEquals("The Something1 application, Something2 request Something3 section is"));
	}

	@Test
	public void testHasModalityWithoutDetails() {
		Assertions.assertTrue(StepHelper.getUpToModality("The Something1 application, Something2 request is")
				.contentEquals("The Something1 application, Something2 request is"));
	}

	@Test
	public void testHasModalityEmpty() {
		Assertions.assertTrue(StepHelper.getUpToModality("The Something1 application, Something2 request").isEmpty());
	}

	@Test
	public void testHasDetailsEmpty() {
		Assertions.assertFalse(StepHelper.hasDetails("The Something1 application, Something2 request"));
	}

	@Test
	public void testHasDetails() {
		Assertions
				.assertTrue(StepHelper.hasDetails("The Something1 application, Something2 request something section"));
	}
}
