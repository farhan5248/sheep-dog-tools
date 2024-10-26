package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToCucumberGoalSteps {

    @Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
    public void theMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
        MbtTransformerFactory.get("UmlToCucumberGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("UmlToCucumberGoal").setPath("uml-to-cucumber");
        MbtTransformerFactory.get("UmlToCucumberGoal").transition();
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber goal is executed with$")
    public void theMbtTransformerPluginUmlToCucumberGoalIsExecutedWith(DataTable dataTable) {
        MbtTransformerFactory.get("UmlToCucumberGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("UmlToCucumberGoal").setPath("uml-to-cucumber");
        MbtTransformerFactory.get("UmlToCucumberGoal").setInputOutputs(dataTable);
        MbtTransformerFactory.get("UmlToCucumberGoal").transition();
    }
}
