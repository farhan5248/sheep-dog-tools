package org.farhan.stepdefs.maven;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.UmlToCucumberGoal;

public class MavenUmlToCucumberGoalSteps extends TestSteps {

    public MavenUmlToCucumberGoalSteps(UmlToCucumberGoal object) {
        super(object);
    }

    @Given("^The maven plugin, uml-to-cucumber goal is executed$")
    public void theMavenPluginUmlToCucumberGoalIsExecuted() {
        object.setComponent("maven");
        object.setPath("uml-to-cucumber");
        object.transition();
    }

    @Given("^The maven plugin, uml-to-cucumber goal is executed with$")
    public void theMavenPluginUmlToCucumberGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("maven");
        object.setPath("uml-to-cucumber");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
