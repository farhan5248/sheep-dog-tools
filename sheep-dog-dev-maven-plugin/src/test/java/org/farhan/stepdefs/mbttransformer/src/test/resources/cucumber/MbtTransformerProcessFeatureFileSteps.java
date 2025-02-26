package org.farhan.stepdefs.mbttransformer.src.test.resources.cucumber;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.cucumber.ProcessFeatureFile;

@ScenarioScoped
public class MbtTransformerProcessFeatureFileSteps extends TestSteps {

    @Inject
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
