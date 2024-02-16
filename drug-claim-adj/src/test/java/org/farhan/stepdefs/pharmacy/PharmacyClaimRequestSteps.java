package org.farhan.stepdefs.pharmacy;

import org.farhan.common.objects.PharmacyFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class PharmacyClaimRequestSteps {

    @Given("^The Pharmacy service, Claim request is sent with$")
    public void thePharmacyServiceClaimRequestIsSentWith(DataTable dataTable) {
        PharmacyFactory.get("PharmacyClaimRequest").setInputOutputs(dataTable, "");
        PharmacyFactory.get("PharmacyClaimRequest").transition();
    }
}
