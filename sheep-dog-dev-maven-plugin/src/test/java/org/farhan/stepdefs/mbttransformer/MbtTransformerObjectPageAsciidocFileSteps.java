package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.ObjectPageAsciidocFile;

@ScenarioScoped
public class MbtTransformerObjectPageAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerObjectPageAsciidocFileSteps(ObjectPageAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.setInputOutputs("Content", docString);
    }
}
