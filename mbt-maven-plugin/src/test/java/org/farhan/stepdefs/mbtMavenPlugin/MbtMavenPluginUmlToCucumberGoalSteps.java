package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginUmlToCucumberGoalSteps {

    @Given("^The uml-to-cucumber goal is executed$")
    public void theUmlToCucumberGoalIsExecuted() {
        MbtMavenPluginFactory.get("UmlToCucumberGoal").transition();
    }
}
