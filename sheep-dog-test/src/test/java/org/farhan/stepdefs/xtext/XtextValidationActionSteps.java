package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextValidationActionSteps {

    @Given("^The validation action is performed$")
    public void theValidationActionIsPerformed() {
        XtextFactory.get("ValidationAction").setComponent("xtext");
        XtextFactory.get("ValidationAction").setPath("validation");
        XtextFactory.get("ValidationAction").transition();
    }
}
