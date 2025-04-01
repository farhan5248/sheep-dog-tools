package org.farhan.stepdefs.specprj.src.test.resources.asciidoc;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.src.test.resources.asciidoc.ProcessAsciidocFile;

@ScenarioScoped
public class SpecPrjProcessAsciidocFileSteps extends TestSteps {

    @Inject
    public SpecPrjProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        super(object);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Background Steps section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Background section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Feature section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Scenario Outline Examples Table section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Doc String section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileScenariosStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsDocStringSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Step Table section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileScenariosStepsStepTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsStepTableSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Scenarios section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is deleted$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileIsDeleted() {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.setInputOutputs("Deleted");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file will be present$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocProcessAsciidocFileWillBePresent() {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs("Present");
    }
}
