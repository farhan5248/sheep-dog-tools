package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessFeatureFileSteps {

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberProcessFeatureFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/app/Process.feature file is created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberAppProcessFeatureFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/app/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/app/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberAppProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/app/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present$")
    public void theMbtTransformerPluginTargetMbtResourcesCucumberProcessFeatureFileWillBePresent() {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("target/mbt/resources/cucumber/Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Background Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenarios Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Background section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Steps Doc String section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenarioStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Outline Examples Table section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Feature section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Outline Steps Data Table section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlineStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenarioOutlineStepsDataTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Outlines section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlinesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenarioOutlinesSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenarios section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Steps Data Table section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessFeatureFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFile").setPath("Process.feature");
        MbtTransformerFactory.get("ProcessFeatureFile").assertInputOutputs(dataTable, "ScenarioStepsDataTableSection");
    }
}
