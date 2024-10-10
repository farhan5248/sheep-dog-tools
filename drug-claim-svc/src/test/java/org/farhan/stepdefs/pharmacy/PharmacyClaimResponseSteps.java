package org.farhan.stepdefs.pharmacy;

import org.farhan.common.PharmacyFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class PharmacyClaimResponseSteps {

    @Given("^The Claim response will be created as follows$")
    public void theClaimResponseWillBeAsFollows(DataTable dataTable) {
        PharmacyFactory.get("ClaimResponse").setComponent("Pharmacy");
        PharmacyFactory.get("ClaimResponse").setPath("Claim");
        PharmacyFactory.get("ClaimResponse").assertInputOutputs(dataTable);
    }
}
