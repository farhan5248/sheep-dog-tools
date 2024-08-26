package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessAdocFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAdocFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.adoc file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAdocFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/app/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.adoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAdocFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/app/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAdocFileWillBePresent() {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Background section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Background Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios Steps Doc String section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenario Outline Examples Table section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Feature section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be created as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosStepsStepTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosStepsStepTableSection");
    }
}
