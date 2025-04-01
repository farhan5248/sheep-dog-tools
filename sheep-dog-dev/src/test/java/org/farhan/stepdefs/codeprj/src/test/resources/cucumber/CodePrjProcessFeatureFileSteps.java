package org.farhan.stepdefs.codeprj.src.test.resources.cucumber;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.src.test.resources.cucumber.ProcessFeatureFile;

@ScenarioScoped
public class CodePrjProcessFeatureFileSteps extends TestSteps {

    @Inject
    public CodePrjProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Background Steps section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Background section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Feature section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Scenario Outline Examples Table section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Scenario Outline Steps Data Table section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileScenarioOutlineStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineStepsDataTableSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Scenario Outlines section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileScenarioOutlinesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlinesSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Scenario Steps Data Table section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileScenarioStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDataTableSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Scenario Steps Doc String section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileScenarioStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDocStringSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Scenarios Steps section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file Scenarios section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file is created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file will be present$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileWillBePresent() {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs("Present");
    }
}
