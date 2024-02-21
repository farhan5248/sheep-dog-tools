package org.farhan.stepdefs.mbtTransformer;

import io.cucumber.java.en.Given;

import org.farhan.common.MbtTransformerFactory;
import org.farhan.objects.mbtTransformer.MbtTransformerProcessFeatureFile;

public class MbtTransformerProcessFeatureFileSteps {

	@Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows$")
	public void theClaimProjectSrcTestResourcesCucumberDeptProcessFeatureFileIsAsFollows(String docString) {
		MbtTransformerFactory.get("MbtTransformerProcessFeatureFile").setInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be as follows$")
	public void theClaimProjectSrcTestResourcesCucumberProcessFeatureFileWillBeAsFollows(String docString) {
		MbtTransformerFactory.get("MbtTransformerProcessFeatureFile").assertInputOutputs("Content", docString);
	}
}
