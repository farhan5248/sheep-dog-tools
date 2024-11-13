package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;
import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToCucumberGuiceGoalSteps extends TestSteps {

    public MbtTransformerUmlToCucumberGuiceGoalSteps(UmlToCucumberGuiceGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber-guice goal is executed with$")
    public void theMbtTransformerPluginUmlToCucumberGuiceGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber-guice");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
