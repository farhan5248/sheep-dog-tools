package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.GenerationAction;
import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;

@ScenarioScoped
public class XtextGenerationActionSteps {

	private TestObject object;

	@Inject
	public XtextGenerationActionSteps(GenerationAction object) {
		this.object = (TestObject) object;
	}

	@Given("^The generation action is performed$")
	public void theGenerationActionIsPerformed() {
		object.setComponent("xtext");
		object.setPath("generation");
		object.transition();
	}
}
