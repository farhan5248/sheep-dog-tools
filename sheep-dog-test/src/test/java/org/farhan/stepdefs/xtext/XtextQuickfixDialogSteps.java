package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextQuickfixDialogSteps {

	@Given("^The quickfix dialog will be set as follows$")
	public void theQuickfixDialogWillBeSetAsFollows(DataTable dataTable) {
		XtextFactory.get("QuickfixDialog").setComponent("xtext");
		XtextFactory.get("QuickfixDialog").setPath("quickfix");
		XtextFactory.get("QuickfixDialog").assertInputOutputs(dataTable);
	}
}
