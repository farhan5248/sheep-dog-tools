package org.farhan.stepdefs.mbttransformer;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;

@ScenarioScoped
public class MbtTransformerAsciidoctorToUmlGoalSteps extends TestSteps {

    @Inject
    public MbtTransformerAsciidoctorToUmlGoalSteps(AsciidoctorToUmlGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, asciidoctor-to-uml goal is executed$")
    public void theMbtTransformerPluginAsciidoctorToUmlGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("asciidoctor-to-uml");
        object.transition();
    }

    @Given("^The mbt-transformer plugin, asciidoctor-to-uml goal is executed with$")
    public void theMbtTransformerPluginAsciidoctorToUmlGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("asciidoctor-to-uml");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
