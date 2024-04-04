package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToGraphGoalSteps {

    @Given("^The mbt-transformer plugin, uml-to-graph goal is executed$")
    public void theMbtTransformerPluginUmlToGraphGoalIsExecuted() {
        MbtTransformerFactory.get("UmlToGraphGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("UmlToGraphGoal").setPath("uml-to-graph");
        MbtTransformerFactory.get("UmlToGraphGoal").transition();
    }
}
