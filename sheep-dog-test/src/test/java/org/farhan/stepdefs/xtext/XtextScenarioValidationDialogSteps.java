package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextScenarioValidationDialogSteps {

	@Given("^The scenario validation dialog will be set as follows$")
	public void theScenarioValidationDialogWillBeSetAsFollows(DataTable dataTable) {
		XtextFactory.get("ScenarioValidationDialog").setComponent("xtext");
		XtextFactory.get("ScenarioValidationDialog").setPath("scenario validation");
		XtextFactory.get("ScenarioValidationDialog").assertInputOutputs(dataTable);
	}

	@Given("^The scenario validation dialog will be empty$")
	public void theScenarioValidationDialogWillBeEmpty() {
		XtextFactory.get("ScenarioValidationDialog").setComponent("xtext");
		XtextFactory.get("ScenarioValidationDialog").setPath("scenario validation");
		XtextFactory.get("ScenarioValidationDialog").assertInputOutputs("Empty");
	}
}
