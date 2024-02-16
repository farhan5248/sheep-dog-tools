package org.farhan.stepdefs.admin;

import org.farhan.common.objects.AdminFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AdminFamilyPageSteps {

    @Given("^The Admin application, Family page is as follows$")
    public void theAdminApplicationFamilyPageIsAsFollows(DataTable dataTable) {
        AdminFactory.get("AdminFamilyPage").setInputOutputs(dataTable, "");
    }
}
