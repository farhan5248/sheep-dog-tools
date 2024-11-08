package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.SuggestionAction;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextSuggestionActionSteps {

	private TestObject object;

	@Inject
	public XtextSuggestionActionSteps(SuggestionAction object) {
		this.object = (TestObject) object;
	}

	@Given("^The suggestion action is performed$")
	public void theSuggestionActionIsPerformed() {
		object.setComponent("xtext");
		object.setPath("suggestion");
		object.transition();
	}
}
