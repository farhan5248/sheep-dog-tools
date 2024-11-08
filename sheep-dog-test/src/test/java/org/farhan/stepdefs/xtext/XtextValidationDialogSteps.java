package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ValidationDialog;

import com.google.inject.Inject;

import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextValidationDialogSteps {

	private TestObject object;

	@Inject
	public XtextValidationDialogSteps(ValidationDialog object) {
		this.object = (TestObject) object;
	}

	@Given("^The validation dialog will be set as follows$")
	public void theValidationDialogWillBeSetAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("validation");
		object.assertInputOutputs(dataTable);
	}
}
