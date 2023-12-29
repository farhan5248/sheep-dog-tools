package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class BlahDocStringPageFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/BlahDocStringPage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimFactory.get("BlahDocStringPageFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah/BlahDocStringPage.java").assertAttributes(docString);
	}
}
