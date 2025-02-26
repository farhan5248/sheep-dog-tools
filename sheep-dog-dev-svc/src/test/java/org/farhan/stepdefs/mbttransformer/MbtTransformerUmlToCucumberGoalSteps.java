package org.farhan.stepdefs.mbttransformer;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;

public class MbtTransformerUmlToCucumberGoalSteps extends TestSteps {

    public MbtTransformerUmlToCucumberGoalSteps(UmlToCucumberGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
    public void theMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber");
        object.transition();
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed with$")
    public void theMbtTransformerPluginUmlToCucumberGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
