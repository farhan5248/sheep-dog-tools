package org.farhan.stepdefs.mbttransformer;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;

public class MbtTransformerCucumberToUmlGoalSteps extends TestSteps {

    public MbtTransformerCucumberToUmlGoalSteps(CucumberToUmlGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("cucumber-to-uml");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
