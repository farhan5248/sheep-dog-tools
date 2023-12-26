package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class BlahObjectPageFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/blahObjectPage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileWillBeAsFollows(String docString) {
		ClaimProjectFactory.get("BlahObjectPageFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah/blahObjectPage.java").assertContents(docString);
	}

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/blahObjectPage.java file is as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimProjectFactory.get("BlahObjectPageFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah/blahObjectPage.java").setContents(docString);
	}
}
