package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.LogoutPageAsciidocFile;

@ScenarioScoped
public class MbtTransformerLogoutPageAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerLogoutPageAsciidocFileSteps(LogoutPageAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Logout page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationLogoutPageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Logout page.asciidoc");
        object.setInputOutputs("Content", docString);
    }
}
