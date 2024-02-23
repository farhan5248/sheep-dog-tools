package org.farhan.stepdefs.acmeTool;

import org.farhan.common.AcmeToolFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeToolDoItGoalSteps {

    @Given("^The do-it goal is executed with$")
    public void theDoItGoalIsExecutedWith(DataTable dataTable) {
        AcmeToolFactory.get("DoItGoal").setInputOutputs(dataTable);
        AcmeToolFactory.get("DoItGoal").transition();
    }
}
