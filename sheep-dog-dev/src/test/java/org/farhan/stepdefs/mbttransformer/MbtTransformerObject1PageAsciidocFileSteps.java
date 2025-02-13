package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.Object1PageAsciidocFile;

@ScenarioScoped
public class MbtTransformerObject1PageAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerObject1PageAsciidocFileSteps(Object1PageAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsWebApplicationObject1PageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc");
        object.setInputOutputs("Content", docString);
    }
}
