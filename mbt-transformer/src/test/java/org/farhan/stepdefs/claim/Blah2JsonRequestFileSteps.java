package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class Blah2JsonRequestFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah2/Blah2JsonRequest.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimFactory.get("Blah2JsonRequestFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah2/Blah2JsonRequest.java").assertAttributes(docString);
	}
}
