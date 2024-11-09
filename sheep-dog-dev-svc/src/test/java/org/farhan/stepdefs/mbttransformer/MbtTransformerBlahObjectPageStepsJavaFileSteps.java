package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestObject;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;
import io.cucumber.java.en.Given;

public class MbtTransformerBlahObjectPageStepsJavaFileSteps {

	private TestObject object;

	public MbtTransformerBlahObjectPageStepsJavaFileSteps(BlahObjectPageStepsJavaFile object) {
		this.object = (TestObject) object;
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is created as follows$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileIsCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
		object.setInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBeCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
		object.assertInputOutputs("Content", docString);
	}
}
