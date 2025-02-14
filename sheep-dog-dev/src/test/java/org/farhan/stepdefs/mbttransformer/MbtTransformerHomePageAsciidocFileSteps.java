package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.HomePageAsciidocFile;

@ScenarioScoped
public class MbtTransformerHomePageAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerHomePageAsciidocFileSteps(HomePageAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Home page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationHomePageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Home page.asciidoc");
        object.setInputOutputs("Content", docString);
    }
}
