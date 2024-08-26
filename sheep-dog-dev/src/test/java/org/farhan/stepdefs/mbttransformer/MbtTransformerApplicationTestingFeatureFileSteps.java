package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerApplicationTestingFeatureFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Application Testing.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberApplicationTestingFeatureFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ApplicationTestingFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ApplicationTestingFeatureFile").setPath("src/test/resources/cucumber/Application Testing.feature");
        MbtTransformerFactory.get("ApplicationTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
