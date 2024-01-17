package org.farhan.mbt.graph.validation;

import org.farhan.mbt.graph.validation.MBTVertexValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VertexValidatorTest {

	@Test
	public void testIsVertice() {
		Assertions.assertTrue(
				MBTVertexValidator.isVertice("The something1 application, something2 file, something3 section is empty"));
	}

	@Test
	public void testIsContainer() {
		Assertions.assertTrue(MBTVertexValidator
				.isContainerStep("The something1 application, something2 file, something3 section is empty"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(MBTVertexValidator
				.getContainerName("The something1 application, something2 file, something3 section is empty")
				.contentEquals("something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(MBTVertexValidator
				.getContainerType("The something1 application, something2 file, something3 section is empty")
				.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions.assertTrue(MBTVertexValidator
				.getObjectName("The something1 application, something2 file, something3 section is empty")
				.contentEquals("something2"));
	}

	@Test
	public void testGetObjType() {
		Assertions.assertTrue(MBTVertexValidator
				.getObjectType("The something1 application, something2 file, something3 section is empty")
				.contentEquals("file"));
	}

	@Test
	public void testGetSection() {
		Assertions.assertTrue(
				MBTVertexValidator.getSection("The something1 application, something2 file, something3 section is empty")
						.contentEquals("something3"));
	}

	@Test
	public void testGetDetails() {
		Assertions.assertTrue(
				MBTVertexValidator.getDetails("The something1 application, something2 file, something3 section is empty")
						.contentEquals("is empty"));
	}

	@Test
	public void testDetailsRegexIsEmpty() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 file is empty"));
	}

	@Test
	public void testDetailsRegexIsPresent() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 file is present"));
	}

	@Test
	public void testDetailsRegexAsFollows() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 file is as follows"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 file isn't empty"));
	}

	@Test
	public void testDetailsRegexIsnt() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 file isn't empty"));
	}

	@Test
	public void testDetailsRegexWill() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 file will be empty"));
	}

	@Test
	public void testDetailsRegexWont() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 file won't be empty"));
	}

	@Test
	public void testSectionRegex() {
		Assertions.assertTrue(
				MBTVertexValidator.isValid("The something1 application, something2 file, something3 section is empty"));
	}

	@Test
	public void testObjectRegexPage() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 page is empty"));
	}

	@Test
	public void testObjectRegexConfig() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 application, something2 config is empty"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 service, something2 file is empty"));
	}

	@Test
	public void testAppRegexProject() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 project, something2 file is empty"));
	}

	@Test
	public void testAppRegexPlugin() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 plugin, something2 file is empty"));
	}

	@Test
	public void testAppRegexBatchjob() {
		Assertions.assertTrue(MBTVertexValidator.isValid("The something1 batchjob, something2 file is empty"));
	}
}
