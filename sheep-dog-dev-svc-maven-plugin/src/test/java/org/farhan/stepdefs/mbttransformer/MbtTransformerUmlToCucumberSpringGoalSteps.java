package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToCucumberSpringGoalSteps extends TestSteps {

    public MbtTransformerUmlToCucumberSpringGoalSteps(UmlToCucumberSpringGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber-spring goal is executed with$")
    public void theMbtTransformerPluginUmlToCucumberSpringGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber-spring");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
