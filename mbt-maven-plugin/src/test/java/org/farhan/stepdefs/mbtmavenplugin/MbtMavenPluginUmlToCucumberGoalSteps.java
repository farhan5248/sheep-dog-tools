package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginUmlToCucumberGoalSteps {

    @Given("^The uml-to-cucumber goal is executed$")
    public void theUmlToCucumberGoalIsExecuted() {
        MbtMavenPluginFactory.get("UmlToCucumberGoal").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("UmlToCucumberGoal").setPath("uml-to-cucumber");
        MbtMavenPluginFactory.get("UmlToCucumberGoal").transition();
    }
}
