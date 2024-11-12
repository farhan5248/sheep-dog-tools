package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.ProcessAsciidocFile;

import com.google.inject.Inject;

import io.cucumber.java.en.Given;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerProcessAsciidocFileSteps extends TestSteps {

	@Inject
	public MbtTransformerProcessAsciidocFileSteps(ProcessAsciidocFile object) {
		super(object);
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileWillBeCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/app/Process.asciidoc");
		object.assertInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileIsCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/app/Process.asciidoc");
		object.setInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows$")
	public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileIsCreatedAsFollows(String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/resources/asciidoc/Process.asciidoc");
		object.setInputOutputs("Content", docString);
	}
}
