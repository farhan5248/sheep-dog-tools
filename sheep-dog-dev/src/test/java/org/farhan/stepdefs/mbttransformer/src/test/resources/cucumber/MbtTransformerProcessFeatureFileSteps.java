package org.farhan.stepdefs.mbttransformer.src.test.resources.cucumber;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.cucumber.ProcessFeatureFile;

@ScenarioScoped
public class MbtTransformerProcessFeatureFileSteps extends TestSteps {

    @Inject
    public MbtTransformerProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Background Steps section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Background section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Feature section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Examples Table section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Steps Data Table section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileScenarioOutlineStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineStepsDataTableSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outlines section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileScenarioOutlinesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlinesSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Steps Data Table section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileScenarioStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDataTableSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Steps Doc String section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileScenarioStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenarios Steps section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenarios section will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesCucumberProcessFeatureFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosSection");
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
