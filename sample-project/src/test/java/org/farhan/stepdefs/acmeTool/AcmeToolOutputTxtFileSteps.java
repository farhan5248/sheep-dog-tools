package org.farhan.stepdefs.acmeTool;

import org.farhan.common.AcmeToolFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeToolOutputTxtFileSteps {

    @Given("^The target/Output.txt file will be present$")
    public void theTargetOutputTxtFileWillBePresent() {
        AcmeToolFactory.get("OutputTxtFile").assertInputOutputs("Present");
    }

    @Given("^The Output.txt file, Results table will be as follows$")
    public void theOutputTxtFileResultsTableWillBeAsFollows(DataTable dataTable) {
        AcmeToolFactory.get("OutputTxtFile").assertInputOutputs(dataTable, "ResultsTable");
    }
}
