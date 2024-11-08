package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.StepTableProposalAction;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextStepTableProposalActionSteps {

	private TestObject object;

	@Inject
	public XtextStepTableProposalActionSteps(StepTableProposalAction object) {
		this.object = (TestObject) object;
	}

	@Given("^The step table proposal action is performed$")
	public void theStepTableProposalActionIsPerformed() {
		object.setComponent("xtext");
		object.setPath("step table proposal");
		object.transition();
	}
}
