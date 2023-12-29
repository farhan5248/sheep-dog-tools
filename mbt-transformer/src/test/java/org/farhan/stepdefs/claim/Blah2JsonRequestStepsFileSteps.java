package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class Blah2JsonRequestStepsFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimFactory.get("Blah2JsonRequestStepsFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java")
				.assertAttributes(docString);
	}
}
