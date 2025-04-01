package org.farhan.stepdefs.maven;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.UmlToAsciidoctorGoal;

@ScenarioScoped
public class MavenUmlToAsciidoctorGoalSteps extends TestSteps {

    @Inject
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
