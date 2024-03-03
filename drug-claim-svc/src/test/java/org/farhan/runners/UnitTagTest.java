package org.farhan.runners;

import org.farhan.adjudication.DrugFactory;
import org.farhan.common.GraphTestObjectFactory;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.farhan")
@IncludeTags("unit")
public class UnitTagTest {

	@BeforeAll
	public static void beforeAll() {
		GraphTestObjectFactory.setPre(true);
	}

	@Before
	public static void before() {
		GraphTestObjectFactory.reset();
		DrugFactory.reset();
	}
}