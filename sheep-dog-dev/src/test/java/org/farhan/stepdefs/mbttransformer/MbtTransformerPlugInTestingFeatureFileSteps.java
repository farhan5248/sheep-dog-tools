package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPlugInTestingFeatureFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Plug-In Testing.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberPlugInTestingFeatureFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("PlugInTestingFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PlugInTestingFeatureFile").setPath("src/test/resources/cucumber/Plug-In Testing.feature");
        MbtTransformerFactory.get("PlugInTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
