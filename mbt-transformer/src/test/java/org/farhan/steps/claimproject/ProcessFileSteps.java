package org.farhan.steps.claimproject;

import org.farhan.objects.claimproject.ClaimProjectFactory;
import org.farhan.objects.claimproject.ProcessFile;
import org.farhan.steps.common.FeatureSteps;

import io.cucumber.java.en.And;

public class ProcessFileSteps extends FeatureSteps {

	@And("^The claim project, src/test/cucumber/dept/process.feature file is as follows$")
	public void TheClaimProjectProcessFeatureFileIsAsFollows(String docString) {
		ProcessFile o = (ProcessFile) ClaimProjectFactory.get("ProcessFile");
		o.setPath("src/test/cucumber/dept/process.feature");
		o.setContents(docString);
	}
}
