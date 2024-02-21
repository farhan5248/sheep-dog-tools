package org.farhan.stepdefs.mbtTransformer;

import io.cucumber.java.en.Given;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.datatable.DataTable;

public class MbtTransformerGraphToUmlGoalSteps  {

    @Given("^The mbt-transformer plugin, graph-to-uml goal is executed$")
    public void theMbtTransformerPluginGraphToUmlGoalIsExecuted() {
        MbtTransformerFactory.get("MbtTransformerGraphToUmlGoal").transition();
    }
}
