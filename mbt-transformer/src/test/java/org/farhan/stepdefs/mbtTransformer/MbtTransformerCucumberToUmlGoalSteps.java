package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerCucumberToUmlGoalSteps {

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {
        MbtTransformerFactory.get("CucumberToUmlGoal").setInputOutputs(dataTable);
        MbtTransformerFactory.get("CucumberToUmlGoal").transition();
    }
}
