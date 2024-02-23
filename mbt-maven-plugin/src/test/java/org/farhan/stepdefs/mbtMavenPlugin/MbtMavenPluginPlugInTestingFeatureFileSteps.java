package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginPlugInTestingFeatureFileSteps {

    @Given("^The mbt-maven-plugin plugin, src/test/resources/cucumber/Plug-In Testing.feature file is as follows$")
    public void theMbtMavenPluginPluginSrcTestResourcesCucumberPlugInTestingFeatureFileIsAsFollows(String docString) {
        MbtMavenPluginFactory.get("PlugInTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
