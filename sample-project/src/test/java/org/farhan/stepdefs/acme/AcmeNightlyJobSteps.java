package org.farhan.stepdefs.acme;

import org.farhan.common.AcmeFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeNightlyJobSteps {

    @Given("^The nightly job won't be triggered$")
    public void theNightlyJobWontBeTriggered() {
        AcmeFactory.get("NightlyJob").transition();
    }
}
