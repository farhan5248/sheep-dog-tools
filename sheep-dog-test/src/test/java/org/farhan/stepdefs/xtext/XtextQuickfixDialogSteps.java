package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.QuickfixDialog;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextQuickfixDialogSteps {

	private TestObject object;

	@Inject
	public XtextQuickfixDialogSteps(QuickfixDialog object) {
		this.object = (TestObject) object;
	}

	@Given("^The quickfix dialog will be set as follows$")
	public void theQuickfixDialogWillBeSetAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("quickfix");
		object.assertInputOutputs(dataTable);
	}
}
