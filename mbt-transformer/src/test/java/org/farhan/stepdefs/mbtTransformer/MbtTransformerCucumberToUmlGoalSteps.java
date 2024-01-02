package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MbtTransformerCucumberToUmlGoalSteps {

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {
    	MbtTransformerFactory.get("MbtTransformerCucumberToUmlGoal").setInputOutputs(dataTable, "");
        MbtTransformerFactory.get("MbtTransformerCucumberToUmlGoal").transition();
    }
}
