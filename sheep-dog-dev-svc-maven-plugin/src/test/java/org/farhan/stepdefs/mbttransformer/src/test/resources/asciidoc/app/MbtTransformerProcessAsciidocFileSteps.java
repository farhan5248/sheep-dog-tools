package org.farhan.stepdefs.mbttransformer.src.test.resources.asciidoc.app;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.app.ProcessAsciidocFile;

public class MbtTransformerProcessAsciidocFileSteps extends TestSteps {

    public MbtTransformerProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        object.assertInputOutputs("Content", docString);
    }
}
