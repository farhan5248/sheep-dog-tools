package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ScenarioValidationAction;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextScenarioValidationActionSteps {

	private TestObject object;

	@Inject
	public XtextScenarioValidationActionSteps(ScenarioValidationAction object) {
		this.object = (TestObject) object;
	}

	@Given("^The scenario validation action is performed as follows$")
	public void theScenarioValidationActionIsPerformedAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("scenario validation");
		object.setInputOutputs(dataTable);
		object.transition();
	}
}
