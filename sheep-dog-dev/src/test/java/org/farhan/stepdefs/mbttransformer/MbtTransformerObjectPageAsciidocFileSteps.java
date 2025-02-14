package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.ObjectPageAsciidocFile;
import io.cucumber.datatable.DataTable;

@ScenarioScoped
public class MbtTransformerObjectPageAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerObjectPageAsciidocFileSteps(ObjectPageAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
        object.assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, Object page.asciidoc file Step Definition Parameters Table section will be created as follows$")
    public void theMbtTransformerPluginObjectPageAsciidocFileStepDefinitionParametersTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Object page.asciidoc");
        object.assertInputOutputs(dataTable, "StepDefinitionParametersTableSection");
    }

    @Given("^The mbt-transformer plugin, Object page.asciidoc file Step Definition section will be created as follows$")
    public void theMbtTransformerPluginObjectPageAsciidocFileStepDefinitionSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Object page.asciidoc");
        object.assertInputOutputs(dataTable, "StepDefinitionSection");
    }

    @Given("^The mbt-transformer plugin, Object page.asciidoc file Object section will be created as follows$")
    public void theMbtTransformerPluginObjectPageAsciidocFileObjectSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Object page.asciidoc");
        object.assertInputOutputs(dataTable, "ObjectSection");
    }
}
