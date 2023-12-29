package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class ClaimProcessFeatureFileSteps extends TestSteps {

	@Given("^The claim project, src/test/cucumber/dept/process.feature file is as follows$")
	public void theClaimProjectSrcTestCucumberDeptProcessFeatureFileIsAsFollows(String docString) {
		ClaimFactory.get("ClaimProcessFeatureFile").setAttributes(docString);
	}
}
