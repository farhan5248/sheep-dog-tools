package org.farhan.stepdefs.claimproject;

import org.farhan.common.stepdefs.JavaSteps;
import org.farhan.objects.claimproject.BlahObjectPageFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;

import io.cucumber.java.en.And;

public class BlahObjectPageFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/objects/blah/blahObjectPage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileWillBeAsFollows(String docString) {
		BlahObjectPageFile o = (BlahObjectPageFile) ClaimProjectFactory.get("BlahObjectPageFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/objects/blah/blahObjectPage.java");
		o.assertContents(docString);
	}
	
	@And("^The claim project, src/test/java/org/farhan/objects/blah/blahObjectPage.java file is as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		BlahObjectPageFile o = (BlahObjectPageFile) ClaimProjectFactory.get("BlahObjectPageFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/objects/blah/blahObjectPage.java");
		o.setContents(docString);
	}
}
