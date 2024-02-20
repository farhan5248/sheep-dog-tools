package org.farhan.stepdefs.admin;

import io.cucumber.java.en.Given;

import org.farhan.common.AdminFactory;

import io.cucumber.datatable.DataTable;

public class AdminFamilyPageSteps {

    @Given("^The Admin application, Family page is as follows$")
    public void theAdminApplicationFamilyPageIsAsFollows(DataTable dataTable) {
        AdminFactory.get("AdminFamilyPage").setInputOutputs(dataTable, "");
    }
}
