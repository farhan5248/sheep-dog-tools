package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessFeatureFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Content", docString);
    }
}
