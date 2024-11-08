package org.farhan.suites;

import org.farhan.helper.StepHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EdgeValidatorTest {

	@Test
	public void testIsEdge() {
		Assertions.assertTrue(StepHelper.isEdge("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testIsComponent() {
		Assertions.assertTrue(
				StepHelper.hasComponent("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(
				StepHelper.getComponentName("The Something1 application, Something2 request is executed with")
						.contentEquals("Something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(
				StepHelper.getComponentType("The Something1 application, Something2 request is executed with")
						.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions
				.assertTrue(StepHelper.getObjectName("The Something1 application, Something2 request is executed with")
						.contentEquals("Something2"));
	}

	@Test
	public void testGetObjTypeRequest() {
		Assertions
				.assertTrue(StepHelper.getObjectType("The Something1 application, Something2 request is executed with")
						.contentEquals("request"));
	}

	@Test
	public void testGetObjTypeJob() {
		Assertions.assertTrue(StepHelper.getObjectType("The Something1 batchjob, Something2 job is executed with")
				.contentEquals("job"));
	}

	@Test
	public void testGetState() {
		Assertions.assertTrue(StepHelper.getState("The Something1 application, Something2 request is executed with")
				.contentEquals("is executed with"));
	}

	@Test
	public void testGetStateModality() {
		Assertions.assertTrue(
				StepHelper.getStateModality("The Something1 application, Something2 request is executed with")
						.contentEquals("is"));
	}

	@Test
	public void testGetStateType() {
		Assertions.assertTrue(StepHelper.getStateType("The Something1 application, Something2 request is executed with")
				.contentEquals("executed"));
	}

	@Test
	public void testGetAttachment() {
		Assertions
				.assertTrue(StepHelper.getAttachment("The Something1 application, Something2 request is executed with")
						.contentEquals("with"));
	}

	@Test
	public void testGetTime() {
		Assertions.assertTrue(StepHelper.getTime("The Something1 application, Something2 request is executed on time")
				.contentEquals("on time"));
	}

	@Test
	public void testStateRegexWith() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 request is executed with"));
	}

	@Test
	public void testStateRegexIsSent() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 request is sent"));
	}

	@Test
	public void testStateRegexIsPerformed() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 file is performed"));
	}

	@Test
	public void testStateRegexIsTriggered() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 request is triggered"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions
				.assertTrue(StepHelper.isNegativeStep("The Something1 application, Something2 request isn't executed"));
	}

	@Test
	public void testStateRegexIsntExecuted() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 request isn't executed"));
	}

	@Test
	public void testStateRegexWillBeExecuted() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 request will be executed"));
	}

	@Test
	public void testStateRegexWontBeExecuted() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 request won't be executed"));
	}

	@Test
	public void testObjectRegexGoal() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 goal is executed"));
	}

	@Test
	public void testObjectRegexAction() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 action is performed"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 service, Something2 request is sent"));
	}

	@Test
	public void testAppRegexApplication() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 application, Something2 request is sent"));
	}

	@Test
	public void testAppRegexBatchJob() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 batchjob, Something2 request is sent"));
	}

	@Test
	public void testAppRegexPlugIn() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent"));
	}

	@Test
	public void testTimeRegexAt() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent at noon"));
	}

	@Test
	public void testTimeRegexBefore() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent before midday"));
	}

	@Test
	public void testTimeRegexAfter() {
		Assertions
				.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent after the next day"));
	}

	@Test
	public void testTimeRegexIn() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent in 5 years"));
	}

	@Test
	public void testTimeRegexEarly() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent early"));
	}

	@Test
	public void testTimeRegexLate() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent late"));
	}

	@Test
	public void testTimeRegexOnTime() {
		Assertions.assertTrue(StepHelper.isValid("The Something1 plugin, Something2 request is sent on time"));
	}

}
