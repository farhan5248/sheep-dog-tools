package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class ClaimBlahDataTablePageJavaFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/BlahDataTablePage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimFactory.get("BlahDataTablePageFile").assertAttributes(docString);
	}
}
