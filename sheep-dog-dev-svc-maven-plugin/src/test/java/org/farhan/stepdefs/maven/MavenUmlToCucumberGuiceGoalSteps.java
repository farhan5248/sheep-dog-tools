package org.farhan.stepdefs.maven;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.maven.UmlToCucumberGuiceGoal;

public class MavenUmlToCucumberGuiceGoalSteps extends TestSteps {

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
