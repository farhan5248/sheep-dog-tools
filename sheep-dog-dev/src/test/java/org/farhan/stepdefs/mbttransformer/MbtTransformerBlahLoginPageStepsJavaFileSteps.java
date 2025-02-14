package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.BlahLoginPageStepsJavaFile;

@ScenarioScoped
public class MbtTransformerBlahLoginPageStepsJavaFileSteps extends TestSteps {

	@Inject
	public MbtTransformerBlahLoginPageStepsJavaFileSteps(BlahLoginPageStepsJavaFile object) {
		super(object);
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahLoginPageSteps.java file is created as follows$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahLoginPageStepsJavaFileIsCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahLoginPageSteps.java");
		object.setInputOutputs("Content", docString);
	}
}
