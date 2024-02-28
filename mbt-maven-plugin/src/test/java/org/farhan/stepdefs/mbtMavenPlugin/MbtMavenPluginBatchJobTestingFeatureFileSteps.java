package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginBatchJobTestingFeatureFileSteps {

    @Given("^The mbt-maven-plugin plugin, src/test/resources/cucumber/Batch-Job Testing.feature file is as follows$")
    public void theMbtMavenPluginPluginSrcTestResourcesCucumberBatchJobTestingFeatureFileIsAsFollows(String docString) {
        MbtMavenPluginFactory.get("BatchJobTestingFeatureFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("BatchJobTestingFeatureFile").setPath("src/test/resources/cucumber/Batch-Job Testing.feature");
        MbtMavenPluginFactory.get("BatchJobTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
