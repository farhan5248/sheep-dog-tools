package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.ProcessFeatureFile;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerProcessFeatureFileSteps extends TestSteps {

    @Inject
    public MbtTransformerProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, Process.feature file Background section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Background Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Feature section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Outline Examples Table section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Outlines section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlinesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlinesSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Outline Steps Data Table section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioOutlineStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineStepsDataTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenarios section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenarios Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Steps Data Table section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDataTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.feature file Scenario Steps Doc String section will be created as follows$")
    public void theMbtTransformerPluginProcessFeatureFileScenarioStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberAppProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/app/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberAppProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/app/Process.feature");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs("Present");
    }
}
