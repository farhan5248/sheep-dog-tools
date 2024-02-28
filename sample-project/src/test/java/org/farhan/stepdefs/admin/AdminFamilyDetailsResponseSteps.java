package org.farhan.stepdefs.admin;

import org.farhan.common.AdminFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AdminFamilyDetailsResponseSteps {

    @Given("^The Admin service, Family Details response is as follows$")
    public void theAdminServiceFamilyDetailsResponseIsAsFollows(DataTable dataTable) {
        AdminFactory.get("FamilyDetailsResponse").setInputOutputs(dataTable);
    }
}
