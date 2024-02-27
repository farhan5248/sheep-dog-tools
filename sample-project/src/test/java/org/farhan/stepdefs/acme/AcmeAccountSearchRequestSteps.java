package org.farhan.stepdefs.acme;

import org.farhan.common.AcmeFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeAccountSearchRequestSteps {

    @Given("^The Account Search request is sent with$")
    public void theAccountSearchRequestIsSentWith(DataTable dataTable) {
        AcmeFactory.get("AccountSearchRequest").setInputOutputs(dataTable);
        AcmeFactory.get("AccountSearchRequest").transition();
    }
}
