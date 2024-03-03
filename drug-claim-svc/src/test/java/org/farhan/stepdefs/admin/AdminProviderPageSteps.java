package org.farhan.stepdefs.admin;

import org.farhan.common.AdminFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AdminProviderPageSteps {

    @Given("^The Admin application, Provider page is as follows$")
    public void theAdminApplicationProviderPageIsAsFollows(DataTable dataTable) {
        AdminFactory.get("ProviderPage").setComponent("Admin");
        AdminFactory.get("ProviderPage").setPath("Provider");
        AdminFactory.get("ProviderPage").setInputOutputs(dataTable);
    }
}
