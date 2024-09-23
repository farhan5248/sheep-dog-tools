package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextStepTableProposalActionSteps {

	@Given("^The step table proposal action is performed$")
	public void theStepTableProposalActionIsPerformed() {
		XtextFactory.get("StepTableProposalAction").setComponent("xtext");
		XtextFactory.get("StepTableProposalAction").setPath("step table proposal");
		XtextFactory.get("StepTableProposalAction").transition();
	}
}
