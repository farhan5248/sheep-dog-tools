package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestObject;
import org.farhan.objects.mbttransformer.ProcessAsciidocFile;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerProcessAsciidocFileSteps {

    private TestObject object;

    @Inject
    public MbtTransformerProcessAsciidocFileSteps(ProcessAsciidocFile object) {
        this.object = (TestObject) object;
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/Process.asciidoc");
        object.assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Background section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileBackgroundSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Background Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileBackgroundStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "BackgroundStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios Steps section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosStepsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios Steps Doc String section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosStepsDocStringSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsDocStringSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenario Outline Examples Table section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenarioOutlineExamplesTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenarioOutlineExamplesTableSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Feature section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileFeatureSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "FeatureSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosSection");
    }

    @Given("^The mbt-transformer plugin, Process.asciidoc file Scenarios Steps Step Table section will be created as follows$")
    public void theMbtTransformerPluginProcessAsciidocFileScenariosStepsStepTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Process.asciidoc");
        object.assertInputOutputs(dataTable, "ScenariosStepsStepTableSection");
    }
}
