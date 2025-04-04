package org.farhan.stepdefs.maven;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.CucumberToUmlGoal;

public class MavenCucumberToUmlGoalSteps extends TestSteps {

    public MavenCucumberToUmlGoalSteps(CucumberToUmlGoal object) {
        super(object);
    }

    @Given("^The maven plugin, cucumber-to-uml goal is executed$")
    public void theMavenPluginCucumberToUmlGoalIsExecuted() {
        object.setComponent("maven");
        object.setPath("cucumber-to-uml");
        object.transition();
    }

    @Given("^The maven plugin, cucumber-to-uml goal is executed with$")
    public void theMavenPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("maven");
        object.setPath("cucumber-to-uml");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
