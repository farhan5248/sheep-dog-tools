package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToAsciidoctorGoalSteps {

    @Given("^The mbt-transformer plugin, uml-to-asciidoctor goal is executed$")
    public void theMbtTransformerPluginUmlToAsciidoctorGoalIsExecuted() {
        MbtTransformerFactory.get("UmlToAsciidoctorGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("UmlToAsciidoctorGoal").setPath("uml-to-asciidoctor");
        MbtTransformerFactory.get("UmlToAsciidoctorGoal").transition();
    }
}
