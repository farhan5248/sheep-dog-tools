package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessFeatureFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileWillBePresent() {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, Process.feature file, Feature section will be as follows$")
    public void theMbtTransformerPluginProcessFeatureFileFeatureSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file, Background Steps Doc String section will be as follows$")
    public void theMbtTransformerPluginProcessFeatureFileBackgroundStepsDocStringSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "BackgroundStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file, Scenarios section will be as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenariosSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenariosStepsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file, Scenario Outline Steps Data Table section will be as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlineStepsDataTableSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenarioOutlineStepsDataTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file, Scenario Outline Examples Table section will be as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlineExamplesTableSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }
}
