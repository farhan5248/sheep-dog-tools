package org.farhan.stepdefs.mbttransformer.src.test.resources.cucumber.app;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.cucumber.app.ProcessFeatureFile;

public class MbtTransformerProcessFeatureFileSteps extends TestSteps {

    public MbtTransformerProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberAppProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/app/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberAppProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/app/Process.feature");
        object.assertInputOutputs("Content", docString);
    }
}
