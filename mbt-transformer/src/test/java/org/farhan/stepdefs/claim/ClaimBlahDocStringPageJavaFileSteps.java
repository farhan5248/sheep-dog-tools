package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class ClaimBlahDocStringPageJavaFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/BlahDocStringPage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimFactory.get("BlahDocStringPageFile").assertAttributes(docString);
	}
}
