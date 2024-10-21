package org.farhan.stepdefs.blah;

import org.farhan.common.BlahFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class BlahDataTablePageSteps {

    @Given("^The blah application, DataTable page is created as follows$")
    public void theBlahApplicationDataTablePageIsCreatedAsFollows(DataTable dataTable) {
        BlahFactory.get("DataTablePage").setComponent("blah");
        BlahFactory.get("DataTablePage").setPath("DataTable");
        BlahFactory.get("DataTablePage").setInputOutputs(dataTable);
    }
}
