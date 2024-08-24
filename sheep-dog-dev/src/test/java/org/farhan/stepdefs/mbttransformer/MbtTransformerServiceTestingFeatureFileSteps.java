package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerServiceTestingFeatureFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Service Testing.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberServiceTestingFeatureFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ServiceTestingFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ServiceTestingFeatureFile").setPath("src/test/resources/cucumber/Service Testing.feature");
        MbtTransformerFactory.get("ServiceTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
