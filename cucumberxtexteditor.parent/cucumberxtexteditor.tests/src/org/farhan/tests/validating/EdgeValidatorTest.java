package org.farhan.tests.validating;

import org.farhan.validation.StepValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EdgeValidatorTest {

	@Test
	public void testIsEdge() {
		Assertions
				.assertTrue(StepValidator.isEdge("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testIsComponent() {
		Assertions.assertTrue(
				StepValidator.isComponentStep("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(
				StepValidator.getComponentName("The Something1 application, Something2 request is executed with")
						.contentEquals("Something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(
				StepValidator.getComponentType("The Something1 application, Something2 request is executed with")
						.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions.assertTrue(
				StepValidator.getObjectName("The Something1 application, Something2 request is executed with")
						.contentEquals("Something2"));
	}

	@Test
	public void testGetObjTypeRequest() {
		Assertions.assertTrue(
				StepValidator.getObjectType("The Something1 application, Something2 request is executed with")
						.contentEquals("request"));
	}

	@Test
	public void testGetObjTypeJob() {
		Assertions.assertTrue(StepValidator.getObjectType("The Something1 batchjob, Something2 job is executed with")
				.contentEquals("job"));
	}

	@Test
	public void testGetState() {
		Assertions
				.assertTrue(StepValidator.getState("The Something1 application, Something2 request is executed with")
						.contentEquals("is executed with"));
	}

	@Test
	public void testGetStateModality() {
		Assertions.assertTrue(
				StepValidator.getStateModality("The Something1 application, Something2 request is executed with")
						.contentEquals("is"));
	}

	@Test
	public void testGetStateType() {
		Assertions.assertTrue(
				StepValidator.getStateType("The Something1 application, Something2 request is executed with")
						.contentEquals("executed"));
	}

	@Test
	public void testGetAttachment() {
		Assertions.assertTrue(
				StepValidator.getAttachment("The Something1 application, Something2 request is executed with")
						.contentEquals("with"));
	}

	@Test
	public void testGetTime() {
		Assertions.assertTrue(
				StepValidator.getTime("The Something1 application, Something2 request is executed on time")
						.contentEquals("on time"));
	}

	@Test
	public void testStateRegexWith() {
		Assertions.assertTrue(
				StepValidator.isValid("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testStateRegexIsSent() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 application, Something2 request is sent"));
	}

	@Test
	public void testStateRegexIsTriggered() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 application, Something2 request is triggered"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions.assertTrue(
				StepValidator.isNegativeStep("The Something1 application, Something2 request isn't executed"));
	}

	@Test
	public void testStateRegexIsntExecuted() {
		Assertions
				.assertTrue(StepValidator.isValid("The Something1 application, Something2 request isn't executed"));
	}

	@Test
	public void testStateRegexWillBeExecuted() {
		Assertions.assertTrue(
				StepValidator.isValid("The Something1 application, Something2 request will be executed"));
	}

	@Test
	public void testStateRegexWontBeExecuted() {
		Assertions.assertTrue(
				StepValidator.isValid("The Something1 application, Something2 request won't be executed"));
	}

	@Test
	public void testObjectRegexGoal() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 application, Something2 goal is executed"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 service, Something2 request is sent"));
	}

	@Test
	public void testAppRegexApplication() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 application, Something2 request is sent"));
	}

	@Test
	public void testAppRegexBatchJob() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 batchjob, Something2 request is sent"));
	}

	@Test
	public void testAppRegexPlugIn() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 plugin, Something2 request is sent"));
	}

	@Test
	public void testTimeRegexAt() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 plugin, Something2 request is sent at noon"));
	}

	@Test
	public void testTimeRegexBefore() {
		Assertions.assertTrue(
				StepValidator.isValid("The Something1 plugin, Something2 request is sent before midday"));
	}

	@Test
	public void testTimeRegexAfter() {
		Assertions.assertTrue(
				StepValidator.isValid("The Something1 plugin, Something2 request is sent after the next day"));
	}

	@Test
	public void testTimeRegexIn() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 plugin, Something2 request is sent in 5 years"));
	}

	@Test
	public void testTimeRegexEarly() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 plugin, Something2 request is sent early"));
	}

	@Test
	public void testTimeRegexLate() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 plugin, Something2 request is sent late"));
	}

	@Test
	public void testTimeRegexOnTime() {
		Assertions.assertTrue(StepValidator.isValid("The Something1 plugin, Something2 request is sent on time"));
	}

}
