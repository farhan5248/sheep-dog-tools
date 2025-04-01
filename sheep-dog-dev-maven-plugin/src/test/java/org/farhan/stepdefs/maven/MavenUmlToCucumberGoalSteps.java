package org.farhan.stepdefs.maven;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.UmlToCucumberGoal;

@ScenarioScoped
public class MavenUmlToCucumberGoalSteps extends TestSteps {

    @Inject
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
