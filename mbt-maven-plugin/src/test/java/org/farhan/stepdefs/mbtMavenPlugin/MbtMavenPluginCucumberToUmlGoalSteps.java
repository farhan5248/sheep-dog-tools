package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginCucumberToUmlGoalSteps {

    @Given("^The cucumber-to-uml goal is executed$")
    public void theCucumberToUmlGoalIsExecuted() {
        MbtMavenPluginFactory.get("CucumberToUmlGoal").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("CucumberToUmlGoal").setPath("cucumber-to-uml");
        MbtMavenPluginFactory.get("CucumberToUmlGoal").transition();
    }
}
