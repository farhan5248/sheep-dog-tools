package org.farhan.stepdefs.mbttransformer.src.test.resources.cucumber;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.cucumber.ProcessFeatureFile;

public class MbtTransformerProcessFeatureFileSteps extends TestSteps {

    public MbtTransformerProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs("Content", docString);
    }
}
