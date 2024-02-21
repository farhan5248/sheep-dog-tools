package org.farhan.tests.validating;

import org.farhan.validation.MBTVertexValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VertexValidatorTest {

	@Test
	public void testIsVertice() {
		Assertions.assertTrue(MBTVertexValidator
				.isVertex("The Something1 application, Something2 file, Something3 section is empty"));
	}

	@Test
	public void testIsComponent() {
		Assertions.assertTrue(MBTVertexValidator
				.isComponentStep("The Something1 application, Something2 file, Something3 section is empty"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(MBTVertexValidator
				.getComponentName("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("Something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(MBTVertexValidator
				.getComponentType("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions.assertTrue(MBTVertexValidator
				.getObjectName("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("Something2"));
	}

	@Test
	public void testGetObjType() {
		Assertions.assertTrue(MBTVertexValidator
				.getObjectType("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("file"));
	}

	@Test
	public void testGetDetailsName() {
		Assertions.assertTrue(MBTVertexValidator
				.getDetailsName("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("Something3"));
	}

	@Test
	public void testGetDetails() {
		Assertions.assertTrue(MBTVertexValidator
				.getDetails("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals(", Something3 section"));
	}

	@Test
	public void testGetDetailsType() {
		Assertions.assertTrue(MBTVertexValidator
				.getDetailsType("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("section"));
	}

	@Test
	public void testGetState() {
		Assertions.assertTrue(MBTVertexValidator
				.getState("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("is empty"));
	}

	
	@Test
	public void testGetStateModality() {
		Assertions.assertTrue(MBTVertexValidator
				.getStateModality("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("is"));
	}

	@Test
	public void testGetStateType() {
		Assertions.assertTrue(MBTVertexValidator
				.getStateType("The Something1 application, Something2 file, Something3 section is empty")
				.contentEquals("empty"));
	}

	@Test
	public void testStateRegexIsEmpty() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 file is empty"));
	}

	@Test
	public void testStateRegexIsPresent() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 file is present"));
	}

	@Test
	public void testStateRegexAsFollows() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 file is as follows"));
	}

	@Test
	public void testGetAttachment() {
		Assertions.assertTrue(
				MBTVertexValidator.getAttachment("The Something1 application, Something2 file is as follows")
						.contentEquals("as follows"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 file isn't empty"));
	}

	@Test
	public void testStateRegexIsnt() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 file isn't empty"));
	}

	@Test
	public void testStateRegexWillBe() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 file will be empty"));
	}

	@Test
	public void testStateRegexWontBe() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 file won't be empty"));
	}

	@Test
	public void testDetailsRegexSection() {
		Assertions.assertTrue(
				MBTVertexValidator.isValid("The Something1 application, Something2 file, Something3 section is empty"));
	}

	@Test
	public void testDetailsRegexFragment() {
		Assertions.assertTrue(MBTVertexValidator
				.isValid("The Something1 application, Something2 file, Something3 fragment is empty"));
	}

	@Test
	public void testDetailsRegexTable() {
		Assertions.assertTrue(
				MBTVertexValidator.isValid("The Something1 application, Something2 file, Something3 table is empty"));
	}

	@Test
	public void testDetailsRegexSnippet() {
		Assertions.assertTrue(
				MBTVertexValidator.isValid("The Something1 application, Something2 file, Something3 snippet is empty"));
	}

	@Test
	public void testObjectRegexPage() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 page is empty"));
	}

	@Test
	public void testObjectRegexConfig() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 config is empty"));
	}

	@Test
	public void testObjectRegexResponse() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 application, Something2 response is empty"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 service, Something2 file is empty"));
	}

	@Test
	public void testAppRegexProject() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 project, Something2 file is empty"));
	}

	@Test
	public void testAppRegexPlugin() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 plugin, Something2 file is empty"));
	}

	@Test
	public void testAppRegexBatchjob() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The Something1 batchjob, Something2 file is empty"));
	}
}
