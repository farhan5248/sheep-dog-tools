package org.farhan.stepdefs.mbttransformer;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;

@ScenarioScoped
public class MbtTransformerUmlToCucumberSpringGoalSteps extends TestSteps {

    @Inject
    public MbtTransformerUmlToCucumberSpringGoalSteps(UmlToCucumberSpringGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber-spring goal is executed$")
    public void theMbtTransformerPluginUmlToCucumberSpringGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber-spring");
        object.transition();
    }
}
