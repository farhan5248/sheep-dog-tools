package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class BlahObjectPageStepsFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java file will be as follows$")
	public void TheClaimProjectBlahObjectPageStepsJavaFileWillBeAsFollows(String docString) {
		ClaimProjectFactory.get("BlahObjectPageStepsFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java").assertContents(docString);
	}

	@Given("^The claim project, src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java file is as follows$")
	public void TheClaimProjectBlahObjectPageStepsJavaFileIsAsFollows(String docString) {
		ClaimProjectFactory.get("BlahObjectPageStepsFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java").setContents(docString);
	}
}
