package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessAdocFileSteps {

    @Given("^The mbt-transformer plugin, Process.adoc file, Background section will be as follows$")
    public void theMbtTransformerPluginProcessAdocFileBackgroundSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows$")
    public void theMbtTransformerPluginProcessAdocFileBackgroundStepsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Feature section will be as follows$")
    public void theMbtTransformerPluginProcessAdocFileFeatureSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios Steps Doc String section will be as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosStepsDocStringSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosStepsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be as follows$")
    public void theMbtTransformerPluginProcessAdocFileScenariosStepsStepTableSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs(dataTable, "ScenariosStepsStepTableSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAdocFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAdocFileWillBePresent() {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs("Present");
    }
}
