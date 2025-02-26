package org.farhan.stepdefs.mbttransformer.src.test.resources.asciidoc.stepdefs.blahapplication;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.stepdefs.blahapplication.ObjectPageAsciidocFile;

@ScenarioScoped
public class MbtTransformerObjectPageAsciidocFileSteps extends TestSteps {

	@Inject
	public MbtTransformerObjectPageAsciidocFileSteps(ObjectPageAsciidocFile object) {
		super(object);
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileIsCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
		object.setInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileIsDeleted() {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
		object.setInputOutputs("Deleted");
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Object section will be created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileObjectSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
		object.assertInputOutputs(dataTable, "ObjectSection");
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Step Definition Parameters Table section will be created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileStepDefinitionParametersTableSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
		object.assertInputOutputs(dataTable, "StepDefinitionParametersTableSection");
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Step Definition section will be created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileStepDefinitionSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
		object.assertInputOutputs(dataTable, "StepDefinitionSection");
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileWillBeCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
		object.assertInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocStepdefsBlahApplicationObjectPageAsciidocFileWillBePresent() {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc");
		object.assertInputOutputs("Present");
	}
}
