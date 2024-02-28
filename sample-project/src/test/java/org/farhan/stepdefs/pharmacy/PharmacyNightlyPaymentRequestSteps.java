package org.farhan.stepdefs.pharmacy;

import org.farhan.common.PharmacyFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class PharmacyNightlyPaymentRequestSteps {

    @Given("^The nightly payment request will be triggered at midnight$")
    public void theNightlyPaymentRequestWillBeTriggeredAtMidnight() {
        PharmacyFactory.get("NightlyPaymentRequest").transition();
    }
}
