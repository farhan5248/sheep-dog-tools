package org.farhan.stepdefs.maven;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.UmlToAsciidoctorGoal;

public class MavenUmlToAsciidoctorGoalSteps extends TestSteps {

    public MavenUmlToAsciidoctorGoalSteps(UmlToAsciidoctorGoal object) {
        super(object);
    }

    @Given("^The maven plugin, uml-to-asciidoctor goal is executed$")
    public void theMavenPluginUmlToAsciidoctorGoalIsExecuted() {
        object.setComponent("maven");
        object.setPath("uml-to-asciidoctor");
        object.transition();
    }

    @Given("^The maven plugin, uml-to-asciidoctor goal is executed with$")
    public void theMavenPluginUmlToAsciidoctorGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("maven");
        object.setPath("uml-to-asciidoctor");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
