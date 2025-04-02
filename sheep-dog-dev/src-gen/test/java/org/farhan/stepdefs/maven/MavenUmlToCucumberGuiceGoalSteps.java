package org.farhan.stepdefs.maven;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.UmlToCucumberGuiceGoal;

@ScenarioScoped
public class MavenUmlToCucumberGuiceGoalSteps extends TestSteps {

    @Inject
    public MavenUmlToCucumberGuiceGoalSteps(UmlToCucumberGuiceGoal object) {
        super(object);
    }

    @Given("^The maven plugin, uml-to-cucumber-guice goal is executed$")
    public void theMavenPluginUmlToCucumberGuiceGoalIsExecuted() {
        object.setComponent("maven");
        object.setPath("uml-to-cucumber-guice");
        object.transition();
    }
}
