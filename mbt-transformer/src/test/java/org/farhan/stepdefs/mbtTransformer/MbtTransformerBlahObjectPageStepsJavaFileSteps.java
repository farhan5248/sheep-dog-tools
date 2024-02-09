package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahObjectPageStepsJavaFileSteps {

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be as follows$")
	public void TheClaimProjectBlahObjectPageStepsJavaFileWillBeAsFollows(String docString) {
		MbtTransformerFactory.get("MbtTransformerBlahObjectPageStepsJavaFile").assertInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is as follows$")
	public void TheClaimProjectBlahObjectPageStepsJavaFileIsAsFollows(String docString) {
		MbtTransformerFactory.get("MbtTransformerBlahObjectPageStepsJavaFile").setInputOutputs("Content", docString);
	}
}
