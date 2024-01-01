package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MbtTransformerCucumberToUmlGoalSteps extends TestSteps {

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {
    	MbtTransformerFactory.get("MbtTransformerCucumberToUmlGoal").setAttributes(dataTable, "");
        MbtTransformerFactory.get("MbtTransformerCucumberToUmlGoal").execute();
    }
}
