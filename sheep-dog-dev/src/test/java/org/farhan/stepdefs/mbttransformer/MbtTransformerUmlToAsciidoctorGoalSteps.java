package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestObject;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerUmlToAsciidoctorGoalSteps {

    private TestObject object;

    @Inject
    public MbtTransformerUmlToAsciidoctorGoalSteps(UmlToAsciidoctorGoal object) {
        this.object = (TestObject) object;
    }

    @Given("^The mbt-transformer plugin, uml-to-asciidoctor goal is executed$")
    public void theMbtTransformerPluginUmlToAsciidoctorGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-asciidoctor");
        object.transition();
    }

    @Given("^The mbt-transformer plugin, uml-to-asciidoctor goal is executed with$")
    public void theMbtTransformerPluginUmlToAsciidoctorGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-asciidoctor");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
