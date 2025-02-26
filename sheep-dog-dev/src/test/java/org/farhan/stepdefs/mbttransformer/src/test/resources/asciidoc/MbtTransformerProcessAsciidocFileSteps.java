package org.farhan.stepdefs.mbttransformer.src.test.resources.asciidoc;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.ProcessAsciidocFile;

@ScenarioScoped
public class MbtTransformerProcessAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Background Steps section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Background section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Feature section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenario Outline Examples Table section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Doc String section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileScenariosStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Step Table section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileScenariosStepsStepTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsStepTableSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is deleted$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileIsDeleted() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.setInputOutputs("Deleted");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs("Present");
    }
}
