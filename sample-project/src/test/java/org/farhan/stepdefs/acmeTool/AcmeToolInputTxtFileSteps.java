package org.farhan.stepdefs.acmeTool;

import org.farhan.common.AcmeToolFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeToolInputTxtFileSteps {

    @Given("^The acme-tool plugin, src/test/resources/cucumber/Input.txt file is as follows$")
    public void theAcmeToolPluginSrcTestResourcesCucumberInputTxtFileIsAsFollows(String docString) {
        AcmeToolFactory.get("InputTxtFile").setInputOutputs("Content", docString);
    }

    @Given("^The Input.txt file is valid$")
    public void theInputTxtFileIsValid() {
        AcmeToolFactory.get("InputTxtFile").setInputOutputs("Valid");
    }
}
