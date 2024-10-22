package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAsciidoctorToUmlGoalSteps {

    @Given("^The mbt-transformer plugin, asciidoctor-to-uml goal is executed$")
    public void theMbtTransformerPluginAsciidoctorToUmlGoalIsExecuted() {
        MbtTransformerFactory.get("AsciidoctorToUmlGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AsciidoctorToUmlGoal").setPath("asciidoctor-to-uml");
        MbtTransformerFactory.get("AsciidoctorToUmlGoal").transition();
    }
}
