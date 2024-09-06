package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextSuggestionActionSteps {

    @Given("^The suggestion action is performed$")
    public void theSuggestionActionIsPerformed() {
        XtextFactory.get("SuggestionAction").setComponent("xtext");
        XtextFactory.get("SuggestionAction").setPath("suggestion");
        XtextFactory.get("SuggestionAction").transition();
    }
}
