package org.farhan.stepdefs.specprj.src.test.resources.asciidoc.stepdefs.blahapplication;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.src.test.resources.asciidoc.stepdefs.blahapplication.ObjectPageAsciidocFile;

@ScenarioScoped
public class SpecPrjObjectPageAsciidocFileSteps extends TestSteps {

    @Inject
    public SpecPrjObjectPageAsciidocFileSteps(ObjectPageAsciidocFile object) {
        super(object);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.assertInputOutputs("Content", docString);
    }
}
