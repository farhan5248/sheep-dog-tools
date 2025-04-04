package org.farhan.stepdefs.specprj.src.test.resources.asciidoc.specs.app;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.src.test.resources.asciidoc.specs.app.ProcessAsciidocFile;

public class SpecPrjProcessAsciidocFileSteps extends TestSteps {

    public SpecPrjProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        super(object);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/app/Process.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsAppProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/app/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/app/Process.asciidoc file will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsAppProcessAsciidocFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/app/Process.asciidoc");
        object.assertInputOutputs("Content", docString);
    }
}
