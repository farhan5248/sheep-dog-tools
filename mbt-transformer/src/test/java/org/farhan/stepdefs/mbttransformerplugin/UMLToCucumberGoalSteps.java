package org.farhan.stepdefs.mbttransformerplugin;

import org.farhan.common.objects.MBTTransformerPluginFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class UMLToCucumberGoalSteps extends TestSteps {

	@Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
	public void TheMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
		MBTTransformerPluginFactory.get("UmlToCucumberGoal").execute();
	}
}
