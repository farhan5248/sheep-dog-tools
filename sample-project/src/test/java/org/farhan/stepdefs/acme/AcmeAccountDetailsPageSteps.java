package org.farhan.stepdefs.acme;

import org.farhan.common.AcmeFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeAccountDetailsPageSteps {

    @Given("^The Account Details page, Claims History table won't be present$")
    public void theAccountDetailsPageClaimsHistoryTableWontBePresent() {
        AcmeFactory.get("AccountDetailsPage").assertInputOutputs("Present", "ClaimsHistoryTable");
    }
}
