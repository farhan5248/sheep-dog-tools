package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ValidationAction;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextValidationActionSteps {

	private TestObject object;

	@Inject
	public XtextValidationActionSteps(ValidationAction object) {
		this.object = (TestObject) object;
	}

	@Given("^The validation action is performed$")
	public void theValidationActionIsPerformed() {
		object.setComponent("xtext");
		object.setPath("validation");
		object.transition();
	}
}
