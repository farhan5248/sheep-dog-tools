package org.farhan.stepdefs.admin;

import org.farhan.common.AdminFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class AdminMemberPageSteps {

    @Given("^The Admin application, Member page is created as follows$")
    public void theAdminApplicationMemberPageIsAsFollows(DataTable dataTable) {
        AdminFactory.get("MemberPage").setComponent("Admin");
        AdminFactory.get("MemberPage").setPath("Member");
        AdminFactory.get("MemberPage").setInputOutputs(dataTable);
    }
}
