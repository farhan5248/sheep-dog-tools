package org.farhan.stepdefs.mbttransformerplugin;

import org.farhan.common.objects.MBTTransformerPluginFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class CucumberToUMLGoalSteps extends TestSteps {

	@Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
	public void TheMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {

		MBTTransformerPluginFactory.get("CucumberToUMLGoal").setAttributes(dataTable).execute();
	}

}
