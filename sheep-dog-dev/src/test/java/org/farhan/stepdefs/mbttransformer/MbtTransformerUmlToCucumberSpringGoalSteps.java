package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestObject;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerUmlToCucumberSpringGoalSteps {

    private TestObject object;

    @Inject
    public MbtTransformerUmlToCucumberSpringGoalSteps(UmlToCucumberSpringGoal object) {
        this.object = (TestObject) object;
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber-spring goal is executed$")
    public void theMbtTransformerPluginUmlToCucumberSpringGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber-spring");
        object.transition();
    }
}
