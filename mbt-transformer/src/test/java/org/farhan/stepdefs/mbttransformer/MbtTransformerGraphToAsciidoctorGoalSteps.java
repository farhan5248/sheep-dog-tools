package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGraphToAsciidoctorGoalSteps {

    @Given("^The mbt-transformer plugin, graph-to-asciidoctor goal is executed$")
    public void theMbtTransformerPluginGraphToAsciidoctorGoalIsExecuted() {
        MbtTransformerFactory.get("GraphToAsciidoctorGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GraphToAsciidoctorGoal").setPath("graph-to-asciidoctor");
        MbtTransformerFactory.get("GraphToAsciidoctorGoal").transition();
    }
}
