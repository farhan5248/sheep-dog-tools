package org.farhan.stepdefs.mbtTransformer;

import io.cucumber.java.en.Given;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToCucumberGoalSteps {

    @Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
	public void theMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
		MbtTransformerFactory.get("MbtTransformerUmlToCucumberGoal").transition();
    }
}
