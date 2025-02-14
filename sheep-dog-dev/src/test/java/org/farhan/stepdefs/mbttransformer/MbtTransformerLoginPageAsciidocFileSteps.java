package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.LoginPageAsciidocFile;

@ScenarioScoped
public class MbtTransformerLoginPageAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerLoginPageAsciidocFileSteps(LoginPageAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Login page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationLoginPageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Login page.asciidoc");
        object.setInputOutputs("Content", docString);
    }
}
