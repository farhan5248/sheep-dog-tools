package org.farhan.stepdefs.acme;

import org.farhan.common.AcmeFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeLogInRequestSteps {

    @Given("^The acme application, Log-In request is sent with$")
    public void theAcmeApplicationLogInRequestIsSentWith(DataTable dataTable) {
        AcmeFactory.get("LogInRequest").setInputOutputs(dataTable);
        AcmeFactory.get("LogInRequest").transition();
    }
}
