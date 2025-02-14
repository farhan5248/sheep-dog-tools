package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.Object1PageAsciidocFile;
import io.cucumber.datatable.DataTable;

@ScenarioScoped
public class MbtTransformerObject1PageAsciidocFileSteps extends TestSteps {

    @Inject
    public MbtTransformerObject1PageAsciidocFileSteps(Object1PageAsciidocFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsWebApplicationObject1PageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsWebApplicationObject1PageAsciidocFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc");
        object.assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, Object1 page.asciidoc file Object section will be created as follows$")
    public void theMbtTransformerPluginObject1PageAsciidocFileObjectSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Object1 page.asciidoc");
        object.assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The mbt-transformer plugin, Object1 page.asciidoc file Step Definition Parameters Table section will be created as follows$")
    public void theMbtTransformerPluginObject1PageAsciidocFileStepDefinitionParametersTableSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Object1 page.asciidoc");
        object.assertInputOutputs(dataTable, "StepDefinitionParametersTableSection");
    }

    @Given("^The mbt-transformer plugin, Object1 page.asciidoc file Step Definition section will be created as follows$")
    public void theMbtTransformerPluginObject1PageAsciidocFileStepDefinitionSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("Object1 page.asciidoc");
        object.assertInputOutputs(dataTable, "StepDefinitionSection");
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObject1PageAsciidocFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file will be present$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObject1PageAsciidocFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc");
        object.assertInputOutputs("Present");
    }
}
