package org.farhan.runners.umltocode;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.farhan.common.TestObjectFactory;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.java.Before;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cucumber/UMLToCode/UMLStepTableToCode.feature")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.farhan")
@IncludeTags("debug")
public class UMLStepTableToCodeTest {

	@Before
	public static void before() {
		TestObjectFactory.reset();
	}
}