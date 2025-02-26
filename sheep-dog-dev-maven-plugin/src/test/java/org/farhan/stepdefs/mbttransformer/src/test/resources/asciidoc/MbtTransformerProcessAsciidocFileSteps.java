package org.farhan.stepdefs.mbttransformer.src.test.resources.asciidoc;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.ProcessAsciidocFile;

@ScenarioScoped
public class MbtTransformerProcessAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }
}
