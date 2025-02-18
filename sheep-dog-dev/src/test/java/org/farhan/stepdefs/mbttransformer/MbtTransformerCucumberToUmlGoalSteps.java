package org.farhan.stepdefs.mbttransformer;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;

@ScenarioScoped
public class MbtTransformerCucumberToUmlGoalSteps extends TestSteps {

    @Inject
    public MbtTransformerCucumberToUmlGoalSteps(CucumberToUmlGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("cucumber-to-uml");
        object.transition();
    }

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("cucumber-to-uml");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
