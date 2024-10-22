package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessFeatureFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberAppProcessFeatureFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/app/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberAppProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/app/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Content", docString);
    }
}
