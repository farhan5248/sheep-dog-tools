package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextScenarioValidationActionSteps {

    @Given("^The scenario validation action is performed$")
    public void theScenarioValidationActionIsPerformed() {
        XtextFactory.get("ScenarioValidationAction").setComponent("xtext");
        XtextFactory.get("ScenarioValidationAction").setPath("scenario validation");
        XtextFactory.get("ScenarioValidationAction").transition();
    }
}
