package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessFeatureFileSteps {

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberProcessFeatureFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/app/Process.feature file is created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberAppProcessFeatureFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/app/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/app/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberAppProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/app/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Content", docString);
    }
}
