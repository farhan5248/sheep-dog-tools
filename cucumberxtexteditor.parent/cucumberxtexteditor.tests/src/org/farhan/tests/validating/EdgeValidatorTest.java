package org.farhan.tests.validating;

import org.farhan.validation.MBTEdgeValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EdgeValidatorTest {

	@Test
	public void testIsEdge() {
		Assertions
				.assertTrue(MBTEdgeValidator.isEdge("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testIsComponent() {
		Assertions.assertTrue(
				MBTEdgeValidator.isComponentStep("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(
				MBTEdgeValidator.getComponentName("The Something1 application, Something2 request is executed with")
						.contentEquals("Something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(
				MBTEdgeValidator.getComponentType("The Something1 application, Something2 request is executed with")
						.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions.assertTrue(
				MBTEdgeValidator.getObjectName("The Something1 application, Something2 request is executed with")
						.contentEquals("Something2"));
	}

	@Test
	public void testGetObjTypeRequest() {
		Assertions.assertTrue(
				MBTEdgeValidator.getObjectType("The Something1 application, Something2 request is executed with")
						.contentEquals("request"));
	}

	@Test
	public void testGetObjTypeJob() {
		Assertions.assertTrue(MBTEdgeValidator
				.getObjectType("The Something1 batchjob, Something2 job is executed with").contentEquals("job"));
	}

	@Test
	public void testGetState() {
		Assertions
				.assertTrue(MBTEdgeValidator.getState("The Something1 application, Something2 request is executed with")
						.contentEquals("is executed with"));
	}

	@Test
	public void testGetStateModality() {
		Assertions.assertTrue(
				MBTEdgeValidator.getStateModality("The Something1 application, Something2 request is executed with")
						.contentEquals("is"));
	}

	@Test
	public void testGetStateType() {
		Assertions.assertTrue(
				MBTEdgeValidator.getStateType("The Something1 application, Something2 request is executed with")
						.contentEquals("executed"));
	}

	@Test
	public void testGetAttachment() {
		Assertions.assertTrue(
				MBTEdgeValidator.getAttachment("The Something1 application, Something2 request is executed with")
						.contentEquals("with"));
	}

	@Test
	public void testStateRegexWith() {
		Assertions.assertTrue(
				MBTEdgeValidator.isValid("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testStateRegexIsSent() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The Something1 application, Something2 request is sent"));
	}

	@Test
	public void testStateRegexIsTriggered() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The Something1 application, Something2 request is triggered"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions.assertTrue(
				MBTEdgeValidator.isNegativeStep("The Something1 application, Something2 request isn't executed"));
	}

	@Test
	public void testStateRegexIsntExecuted() {
		Assertions
				.assertTrue(MBTEdgeValidator.isValid("The Something1 application, Something2 request isn't executed"));
	}

	@Test
	public void testStateRegexWillBeExecuted() {
		Assertions.assertTrue(
				MBTEdgeValidator.isValid("The Something1 application, Something2 request will be executed"));
	}

	@Test
	public void testStateRegexWontBeExecuted() {
		Assertions.assertTrue(
				MBTEdgeValidator.isValid("The Something1 application, Something2 request won't be executed"));
	}

	@Test
	public void testObjectRegexGoal() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The Something1 application, Something2 goal is executed"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The Something1 service, Something2 request is sent"));
	}

	@Test
	public void testAppRegexApplication() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The Something1 application, Something2 request is sent"));
	}

	@Test
	public void testAppRegexBatchJob() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The Something1 batchjob, Something2 request is sent"));
	}

	@Test
	public void testAppRegexPlugIn() {
		Assertions.assertTrue(MBTEdgeValidator.isValid("The Something1 plugin, Something2 request is sent"));
	}

}
