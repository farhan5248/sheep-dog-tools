package org.farhan.stepdefs.pharmacy;

import org.farhan.common.PharmacyFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class PharmacyClaimResponseSteps {

    @Given("^The Claim response will be as follows$")
    public void theClaimResponseWillBeAsFollows(DataTable dataTable) {
        PharmacyFactory.get("ClaimResponse").assertInputOutputs(dataTable);
    }
}
