package org.farhan.stepdefs.claimproject;

import org.farhan.objects.claimproject.BlahDocStringsPageStepsFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;
import org.farhan.stepdefs.common.JavaSteps;

import io.cucumber.java.en.And;

public class BlahDocStringsPageStepsFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/stepdefs/blah/blahDocStringPageSteps.java file is as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		BlahDocStringsPageStepsFile o = (BlahDocStringsPageStepsFile) ClaimProjectFactory.get("BlahDocStringsPageStepsFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/stepdefs/blah/blahDocStringPageSteps.java");
		o.assertContents(docString);
	}
}
