package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import org.farhan.common.stepdefs.TestSteps;

public class MbtTransformerUmlToCucumberGoalSteps extends TestSteps {

    @Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
	public void theMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
		MbtTransformerFactory.get("UmlToCucumberGoal").execute();
    }
}
