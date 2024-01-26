package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGraphToUmlGoalSteps  {

    @Given("^The mbt-transformer plugin, graph-to-uml goal is executed$")
    public void theMbtTransformerPluginGraphToUmlGoalIsExecuted() {
        MbtTransformerFactory.get("MbtTransformerGraphToUmlGoal").transition();
    }
}
