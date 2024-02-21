package org.farhan.stepdefs.pharmacy;

import org.farhan.common.PharmacyFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class PharmacyClaimResourceSteps {

    @Given("^The Claim resource will be as follows$")
    public void theClaimResourceWillBeAsFollows(DataTable dataTable) {
        PharmacyFactory.get("ClaimResource").assertInputOutputs(dataTable, "");
    }
}
