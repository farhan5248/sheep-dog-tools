package org.farhan.stepdefs.maven;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.UmlToCucumberSpringGoal;

public class MavenUmlToCucumberSpringGoalSteps extends TestSteps {

    public MavenUmlToCucumberSpringGoalSteps(UmlToCucumberSpringGoal object) {
        super(object);
    }

    @Given("^The maven plugin, uml-to-cucumber-spring goal is executed$")
    public void theMavenPluginUmlToCucumberSpringGoalIsExecuted() {
        object.setComponent("maven");
        object.setPath("uml-to-cucumber-spring");
        object.transition();
    }
}
