package org.farhan.stepdefs.specprj.src.test.resources.asciidoc.specs;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.src.test.resources.asciidoc.specs.ProcessAsciidocFile;

public class SpecPrjProcessAsciidocFileSteps extends TestSteps {

    public SpecPrjProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        super(object);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }
}
