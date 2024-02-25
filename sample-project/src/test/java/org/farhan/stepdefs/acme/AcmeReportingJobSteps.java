package org.farhan.stepdefs.acme;

import org.farhan.common.AcmeFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AcmeReportingJobSteps {

    @Given("^The reporting job will be triggered$")
    public void theReportingJobWillBeTriggered() {
        AcmeFactory.get("ReportingJob").transition();
    }
}
