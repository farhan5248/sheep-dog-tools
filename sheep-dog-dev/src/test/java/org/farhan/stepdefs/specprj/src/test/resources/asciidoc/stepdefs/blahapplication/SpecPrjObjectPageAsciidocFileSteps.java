package org.farhan.stepdefs.specprj.src.test.resources.asciidoc.stepdefs.blahapplication;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
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

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Object section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileObjectSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Step Definition Parameters Table section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileStepDefinitionParametersTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.assertInputOutputs(dataTable, "StepDefinitionParametersTableSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Step Definition section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileStepDefinitionSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.assertInputOutputs(dataTable, "StepDefinitionSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileIsDeleted() {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.setInputOutputs("Deleted");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileWillBePresent() {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.assertInputOutputs("Present");
    }
}
