package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ScenarioValidationDialog;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextScenarioValidationDialogSteps {

	private TestObject object;

	@Inject
	public XtextScenarioValidationDialogSteps(ScenarioValidationDialog object) {
		this.object = (TestObject) object;
	}

	@Given("^The scenario validation dialog will be set as follows$")
	public void theScenarioValidationDialogWillBeSetAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("scenario validation");
		object.assertInputOutputs(dataTable);
	}

	@Given("^The scenario validation dialog will be empty$")
	public void theScenarioValidationDialogWillBeEmpty() {
		object.setComponent("xtext");
		object.setPath("scenario validation");
		object.assertInputOutputs("Empty");
	}
}
