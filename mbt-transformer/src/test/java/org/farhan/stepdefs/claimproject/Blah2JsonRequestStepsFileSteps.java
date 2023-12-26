package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import org.farhan.objects.claimproject.Blah2JsonRequestStepsFile;

import io.cucumber.java.en.Given;

public class Blah2JsonRequestStepsFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/stepdefs/blah2/blah2JsonRequestSteps.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimProjectFactory.get("Blah2JsonRequestStepsFile").setBaseDir("claim").setPath("src/test/java/org/farhan/stepdefs/blah2/blah2JsonRequestSteps.java").assertContents(docString);
	}
}
