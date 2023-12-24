package org.farhan.stepdefs.claimproject;

import org.farhan.objects.claimproject.BlahObjectPageStepsFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;
import org.farhan.stepdefs.common.JavaSteps;

import io.cucumber.java.en.And;

public class BlahObjectPageStepsFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java file is as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		BlahObjectPageStepsFile o = (BlahObjectPageStepsFile) ClaimProjectFactory.get("BlahObjectPageStepsFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java");
		o.assertContents(docString);
	}
}
