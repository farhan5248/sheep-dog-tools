package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class Blah2JsonRequestFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah2/blah2JsonRequest.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimProjectFactory.get("Blah2JsonRequestFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah2/blah2JsonRequest.java").assertContents(docString);
	}
}
