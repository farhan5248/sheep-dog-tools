package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class BlahDataTablePageStepsFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/stepdefs/blah/blahDataTablePageSteps.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimProjectFactory.get("BlahDataTablePageStepsFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/stepdefs/blah/blahDataTablePageSteps.java")
				.assertContents(docString);
	}
}
