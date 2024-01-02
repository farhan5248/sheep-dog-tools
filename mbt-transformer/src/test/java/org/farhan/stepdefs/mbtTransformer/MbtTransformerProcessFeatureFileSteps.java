package org.farhan.stepdefs.mbtTransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.objects.MbtTransformerFactory;

public class MbtTransformerProcessFeatureFileSteps {

	@Given("^The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows$")
	public void theClaimProjectSrcTestResourcesCucumberDeptProcessFeatureFileIsAsFollows(String docString) {
		MbtTransformerFactory.get("ClaimProcessFeatureFile").setInputOutputs("Content", docString);
	}
}
