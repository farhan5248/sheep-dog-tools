package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessAsciidocFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("src/test/resources/asciidoc/Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileWillBePresent() {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("src/test/resources/asciidoc/Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Background section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Background Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios Steps Doc String section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "ScenariosStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenario Outline Examples Table section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Feature section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios Steps Step Table section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosStepsStepTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs(dataTable, "ScenariosStepsStepTableSection");
    }
}
