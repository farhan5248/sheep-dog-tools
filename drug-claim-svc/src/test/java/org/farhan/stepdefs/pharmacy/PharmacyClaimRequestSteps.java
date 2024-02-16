package org.farhan.stepdefs.pharmacy;

import org.farhan.common.objects.PharmacyFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class PharmacyClaimRequestSteps {

    @Given("^The pharmacy service, Claim request is sent$")
    public void thePharmacyServiceClaimRequestIsSent() {
        PharmacyFactory.get("PharmacyClaimRequest").transition();
    }
}
