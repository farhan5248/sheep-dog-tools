package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginApplicationTestingFeatureFileSteps {

    @Given("^The mbt-maven-plugin plugin, src/test/resources/cucumber/Application Testing.feature file is as follows$")
    public void theMbtMavenPluginPluginSrcTestResourcesCucumberApplicationTestingFeatureFileIsAsFollows(String docString) {
        MbtMavenPluginFactory.get("ApplicationTestingFeatureFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("ApplicationTestingFeatureFile").setPath("src/test/resources/cucumber/Application Testing.feature");
        MbtMavenPluginFactory.get("ApplicationTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
