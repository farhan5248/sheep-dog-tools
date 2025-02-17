package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;

@ScenarioScoped
public class MbtTransformerUmlToCucumberGuiceGoalSteps extends TestSteps {

    @Inject
    public MbtTransformerUmlToCucumberGuiceGoalSteps(UmlToCucumberGuiceGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber-guice goal is executed$")
    public void theMbtTransformerPluginUmlToCucumberGuiceGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber-guice");
        object.transition();
    }
}
