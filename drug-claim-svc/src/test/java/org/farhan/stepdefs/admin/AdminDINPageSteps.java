package org.farhan.stepdefs.admin;

import org.farhan.common.AdminFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AdminDINPageSteps {

    @Given("^The Admin application, DIN page is created as follows$")
    public void theAdminApplicationDINPageIsAsFollows(DataTable dataTable) {
        AdminFactory.get("DINPage").setComponent("Admin");
        AdminFactory.get("DINPage").setPath("DIN");
        AdminFactory.get("DINPage").setInputOutputs(dataTable);
    }
}
