package org.farhan.stepdefs.specprj.src.test.resources.asciidoc.specs;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.src.test.resources.asciidoc.specs.ProcessAsciidocFile;

@ScenarioScoped
public class SpecPrjProcessAsciidocFileSteps extends TestSteps {

    @Inject
    public SpecPrjProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        super(object);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Feature section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenario Outline Examples Table section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps Doc String section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileScenariosStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsDocStringSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps Step Table section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileScenariosStepsStepTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsStepTableSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios section will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileIsDeleted() {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.setInputOutputs("Deleted");
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocSpecsProcessAsciidocFileWillBePresent() {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/specs/Process.asciidoc");
        object.assertInputOutputs("Present");
    }
}
