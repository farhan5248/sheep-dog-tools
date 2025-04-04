package org.farhan.stepdefs.xtext;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.xtext.GenerateStepDefinitionAction;

@ScenarioScoped
public class XtextGenerateStepDefinitionActionSteps extends TestSteps {

    @Inject
    public XtextGenerateStepDefinitionActionSteps(GenerateStepDefinitionAction object) {
        super(object);
    }

    @Given("^The xtext plugin, generate step definition action is performed$")
    public void theXtextPluginGenerateStepDefinitionActionIsPerformed() {
        object.setComponent("xtext");
        object.setPath("generate step definition");
        object.transition();
    }
}
