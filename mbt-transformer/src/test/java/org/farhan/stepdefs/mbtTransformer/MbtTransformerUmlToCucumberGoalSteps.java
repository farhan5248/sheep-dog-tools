package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToCucumberGoalSteps {

    @Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
	public void theMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
		MbtTransformerFactory.get("MbtTransformerUmlToCucumberGoal").transition();
    }
}
