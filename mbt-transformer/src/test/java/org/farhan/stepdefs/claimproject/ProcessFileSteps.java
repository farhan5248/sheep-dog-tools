package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class ProcessFileSteps extends TestSteps {

	@Given("^The claim project, src/test/cucumber/dept/process.feature file is as follows$")
	public void TheClaimProjectProcessFeatureFileIsAsFollows(String docString) {
		ClaimProjectFactory.get("ProcessFile").setBaseDir("claim").setPath("src/test/cucumber/dept/process.feature").setContents(docString);
	}
}
