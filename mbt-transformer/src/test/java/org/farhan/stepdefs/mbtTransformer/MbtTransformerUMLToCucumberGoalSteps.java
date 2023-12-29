package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class MbtTransformerUMLToCucumberGoalSteps extends TestSteps {

	@Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
	public void TheMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
		MbtTransformerFactory.get("UmlToCucumberGoal").execute();
	}
}
