package org.farhan.tests.validating;

import org.farhan.validation.MBTEdgeValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EdgeValidatorTest {

	@Test
	public void testIsEdge() {
		Assertions.assertTrue(
				MBTEdgeValidator.isEdge("The something1 application, something2 request is executed with"));
	}
	
	@Test
	public void testIsContainer() {
		Assertions.assertTrue(
				MBTEdgeValidator.isContainerStep("The something1 application, something2 request is executed with"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(
				MBTEdgeValidator.getContainerName("The something1 application, something2 request is executed with")
						.contentEquals("something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(
				MBTEdgeValidator.getContainerType("The something1 application, something2 request is executed with")
						.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions.assertTrue(
				MBTEdgeValidator.getObjectName("The something1 application, something2 request is executed with")
						.contentEquals("something2"));
	}

	@Test
	public void testGetObjType() {
		Assertions.assertTrue(
				MBTEdgeValidator.getObjectType("The something1 application, something2 request is executed with")
						.contentEquals("request"));
	}

	@Test
	public void testGetDetails() {
		Assertions
				.assertTrue(MBTEdgeValidator.getDetails("The something1 application, something2 request is executed with")
						.contentEquals("is executed with"));
	}

	@Test
	public void testDetailsRegexWith() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request is executed with"));
	}

	@Test
	public void testDetailsRegexIsSent() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request is sent"));
	}

	@Test
	public void testDetailsRegexIsTriggered() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request is triggered"));
	}

	@Test
	public void testDetailsRegexIsInvalid() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request is invalid"));
	}

	@Test
	public void testDetailsRegexIsValid() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request is valid"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions.assertTrue(MBTEdgeValidator.isNegativeStep("The something1 application, something2 request isn't executed"));
	}
	
	@Test
	public void testDetailsRegexIsntExecuted() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request isn't executed"));
	}

	@Test
	public void testDetailsRegexWillExecuted() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request will be executed"));
	}

	@Test
	public void testDetailsRegexWontExecuted() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request won't be executed"));
	}

	@Test
	public void testObjectRegexGoal() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 goal is executed"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 service, something2 request is sent"));
	}

	@Test
	public void testAppRegexProject() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 project, something2 request is sent"));
	}

	@Test
	public void testAppRegexApplication() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 application, something2 request is sent"));
	}

	@Test
	public void testAppRegexBatchjob() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The something1 batchjob, something2 request is sent"));
	}
}
