package org.farhan.stepdefs.codeprj.srcgen.test.resources.cucumber.specs;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.srcgen.test.resources.cucumber.specs.ProcessFeatureFile;

@ScenarioScoped
public class CodePrjProcessFeatureFileSteps extends TestSteps {

    @Inject
    public CodePrjProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Background Steps section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Background section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Feature section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Scenario Outline Examples Table section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Scenario Outline Steps Data Table section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileScenarioOutlineStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlineStepsDataTableSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Scenario Outlines section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileScenarioOutlinesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioOutlinesSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Scenario Steps Data Table section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileScenarioStepsDataTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDataTableSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Scenario Steps Doc String section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileScenarioStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenarioStepsDocStringSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Scenarios Steps section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file Scenarios section will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file is created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file will be present$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsProcessFeatureFileWillBePresent() {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/Process.feature");
        object.assertInputOutputs("Present");
    }
}
