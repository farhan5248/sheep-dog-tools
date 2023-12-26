package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class BlahDocStringPageFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/blahDocStringPage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimProjectFactory.get("BlahDocStringPageFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah/blahDocStringPage.java").assertContents(docString);
	}
}
