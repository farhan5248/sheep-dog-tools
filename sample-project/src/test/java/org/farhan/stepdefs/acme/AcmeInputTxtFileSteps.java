package org.farhan.stepdefs.acme;

import org.farhan.common.AcmeFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeInputTxtFileSteps {

    @Given("^The acme batchjob, batchjobuser/inbox/Input.txt file isn't empty$")
    public void theAcmeBatchjobBatchjobuserInboxInputTxtFileIsntEmpty() {
        AcmeFactory.get("InputTxtFile").setInputOutputs("");
    }

    @Given("^The Input.txt file is invalid$")
    public void theInputTxtFileIsInvalid() {
        AcmeFactory.get("InputTxtFile").setInputOutputs("Invalid");
    }

    @Given("^The Input.txt file is uploaded$")
    public void theInputTxtFileIsUploaded() {
        AcmeFactory.get("InputTxtFile").setInputOutputs("Uploaded");
    }
}
