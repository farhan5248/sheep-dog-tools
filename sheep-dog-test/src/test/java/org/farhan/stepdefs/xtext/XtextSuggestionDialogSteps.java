package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.SuggestionDialog;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextSuggestionDialogSteps {

	private TestObject object;

	@Inject
	public XtextSuggestionDialogSteps(SuggestionDialog object) {
		this.object = (TestObject) object;
	}

	@Given("^The suggestion dialog will be set as follows$")
	public void theSuggestionDialogWillBeSetAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("suggestion");
		object.assertInputOutputs(dataTable);
	}

	@Given("^The suggestion dialog will be empty$")
	public void theSuggestionDialogWillBeEmpty() {
		object.setComponent("xtext");
		object.setPath("suggestion");
		object.assertInputOutputs("Empty");
	}
}
