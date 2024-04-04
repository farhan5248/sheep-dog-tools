package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAsciidoctorToGraphGoalSteps {

    @Given("^The mbt-transformer plugin, asciidoctor-to-graph goal is executed$")
    public void theMbtTransformerPluginAsciidoctorToGraphGoalIsExecuted() {
        MbtTransformerFactory.get("AsciidoctorToGraphGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AsciidoctorToGraphGoal").setPath("asciidoctor-to-graph");
        MbtTransformerFactory.get("AsciidoctorToGraphGoal").transition();
    }
}
