package org.farhan.stepdefs.xtext;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.xtext.ProposeTestStepAction;

@ScenarioScoped
public class XtextProposeTestStepActionSteps extends TestSteps {

    @Inject
    public XtextProposeTestStepActionSteps(ProposeTestStepAction object) {
        super(object);
    }

    @Given("^The xtext plugin, propose test step action is performed$")
    public void theXtextPluginProposeTestStepActionIsPerformed() {
        object.setComponent("xtext");
        object.setPath("propose test step");
        object.transition();
    }
}
