package org.farhan.stepdefs.claimproject;

import org.farhan.common.stepdefs.JavaSteps;
import org.farhan.objects.claimproject.Blah2JsonRequestFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;

import io.cucumber.java.en.And;

public class Blah2JsonRequestFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/objects/blah2/blah2JsonRequest.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		Blah2JsonRequestFile o = (Blah2JsonRequestFile) ClaimProjectFactory.get("Blah2JsonRequestFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/objects/blah2/blah2JsonRequest.java");
		o.assertContents(docString);
	}
}
