package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextValidationDialogSteps {

    @Given("^The validation dialog will be set as follows$")
    public void theValidationDialogWillBeSetAsFollows(DataTable dataTable) {
        XtextFactory.get("ValidationDialog").setComponent("xtext");
        XtextFactory.get("ValidationDialog").setPath("validation");
        XtextFactory.get("ValidationDialog").assertInputOutputs(dataTable);
    }
}
