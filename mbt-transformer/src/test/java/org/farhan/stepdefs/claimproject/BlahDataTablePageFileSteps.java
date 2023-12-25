package org.farhan.stepdefs.claimproject;

import org.farhan.common.stepdefs.JavaSteps;
import org.farhan.objects.claimproject.BlahDataTablePageFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;

import io.cucumber.java.en.And;

public class BlahDataTablePageFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/objects/blah/blahDataTablePage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		BlahDataTablePageFile o = (BlahDataTablePageFile) ClaimProjectFactory.get("BlahDataTablePageFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/objects/blah/blahDataTablePage.java");
		o.assertContents(docString);
	}
}
