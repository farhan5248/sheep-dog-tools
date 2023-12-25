package org.farhan.mbt.graph.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EdgeValidatorTest {

	@Test
	public void testIsEdge() {
		Assertions.assertTrue(
				EdgeValidator.isEdge("The something1 application, something2 request is executed with"));
	}
	
	@Test
	public void testIsContainer() {
		Assertions.assertTrue(
				EdgeValidator.isContainerStep("The something1 application, something2 request is executed with"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(
				EdgeValidator.getContainerName("The something1 application, something2 request is executed with")
						.contentEquals("something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(
				EdgeValidator.getContainerType("The something1 application, something2 request is executed with")
						.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions.assertTrue(
				EdgeValidator.getObjectName("The something1 application, something2 request is executed with")
						.contentEquals("something2"));
	}

	@Test
	public void testGetObjType() {
		Assertions.assertTrue(
				EdgeValidator.getObjectType("The something1 application, something2 request is executed with")
						.contentEquals("request"));
	}

	@Test
	public void testGetDetails() {
		Assertions
				.assertTrue(EdgeValidator.getDetails("The something1 application, something2 request is executed with")
						.contentEquals("is executed with"));
	}

	@Test
	public void testDetailsRegexWith() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 request is executed with"));
	}

	@Test
	public void testDetailsRegexIsSent() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 request is sent"));
	}

	@Test
	public void testDetailsRegexIsTriggered() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 request is triggered"));
	}

	@Test
	public void testDetailsRegexIsInvalid() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 request is invalid"));
	}

	@Test
	public void testDetailsRegexIsValid() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 request is valid"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions.assertTrue(EdgeValidator.isNegativeStep("The something1 application, something2 request isn't executed"));
	}
	
	@Test
	public void testDetailsRegexIsntExecuted() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 request isn't executed"));
	}

	@Test
	public void testObjectRegexGoal() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 goal is executed"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 service, something2 request is sent"));
	}

	@Test
	public void testAppRegexProject() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 project, something2 request is sent"));
	}

	@Test
	public void testAppRegexApplication() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 application, something2 request is sent"));
	}

	@Test
	public void testAppRegexBatchjob() {
		Assertions.assertTrue(EdgeValidator.isValid("The something1 batchjob, something2 request is sent"));
	}
}
