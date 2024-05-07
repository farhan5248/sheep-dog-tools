package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerCucumberToUmlGoalSteps {

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {
        MbtTransformerFactory.get("CucumberToUmlGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("CucumberToUmlGoal").setPath("cucumber-to-uml");
        MbtTransformerFactory.get("CucumberToUmlGoal").setInputOutputs(dataTable);
        MbtTransformerFactory.get("CucumberToUmlGoal").transition();
    }

    @Given("^The mbt-transformer plugin, cucumber-to-uml goal is executed$")
    public void theMbtTransformerPluginCucumberToUmlGoalIsExecuted() {
        MbtTransformerFactory.get("CucumberToUmlGoal").setComponent("mbt-transformer");
        MbtTransformerFactory.get("CucumberToUmlGoal").setPath("cucumber-to-uml");
        MbtTransformerFactory.get("CucumberToUmlGoal").transition();
    }
}
