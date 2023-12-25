package org.farhan.stepdefs.claimproject;

import org.farhan.common.stepdefs.JavaSteps;
import org.farhan.objects.claimproject.BlahDocStringPageFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;

import io.cucumber.java.en.And;

public class BlahDocStringPageFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/objects/blah/blahDocStringPage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		BlahDocStringPageFile o = (BlahDocStringPageFile) ClaimProjectFactory.get("BlahDocStringPageFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/objects/blah/blahDocStringPage.java");
		o.assertContents(docString);
	}
}
