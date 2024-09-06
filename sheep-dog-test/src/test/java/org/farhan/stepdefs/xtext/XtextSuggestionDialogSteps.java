package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextSuggestionDialogSteps {

    @Given("^The suggestion dialog will be set as follows$")
    public void theSuggestionDialogWillBeSetAsFollows(DataTable dataTable) {
        XtextFactory.get("SuggestionDialog").setComponent("xtext");
        XtextFactory.get("SuggestionDialog").setPath("suggestion");
        XtextFactory.get("SuggestionDialog").assertInputOutputs(dataTable);
    }
}
