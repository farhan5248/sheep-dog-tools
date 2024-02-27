package org.farhan.stepdefs.acme;

import org.farhan.common.AcmeFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeHomePageSteps {

    @Given("^The Home page, Account Search section is present$")
    public void theHomePageAccountSearchSectionIsPresent() {
        AcmeFactory.get("HomePage").setInputOutputs("Present", "AccountSearchSection");
    }
}
