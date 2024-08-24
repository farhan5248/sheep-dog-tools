package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBatchJobTestingFeatureFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Batch-Job Testing.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberBatchJobTestingFeatureFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("BatchJobTestingFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BatchJobTestingFeatureFile").setPath("src/test/resources/cucumber/Batch-Job Testing.feature");
        MbtTransformerFactory.get("BatchJobTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
