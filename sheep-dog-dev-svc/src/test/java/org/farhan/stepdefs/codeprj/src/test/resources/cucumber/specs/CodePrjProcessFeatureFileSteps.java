package org.farhan.stepdefs.codeprj.src.test.resources.cucumber.specs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.src.test.resources.cucumber.specs.ProcessFeatureFile;

public class CodePrjProcessFeatureFileSteps extends TestSteps {

    public CodePrjProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Background Steps section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Background section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Feature section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Scenario Outline Examples Table section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Scenario Outline Steps Data Table section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileScenarioOutlineStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineStepsDataTableSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Scenario Outlines section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileScenarioOutlinesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlinesSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Scenario Steps Data Table section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileScenarioStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDataTableSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Scenario Steps Doc String section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileScenarioStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDocStringSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Scenarios Steps section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file Scenarios section will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file is created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/specs/Process.feature file will be present$")
    public void theCodePrjProjectSrcTestResourcesCucumberSpecsProcessFeatureFileWillBePresent() {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs("Present");
    }
}
