package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.BlahHomePageStepsJavaFile;

@ScenarioScoped
public class MbtTransformerBlahHomePageStepsJavaFileSteps extends TestSteps {

    @Inject
    public MbtTransformerBlahHomePageStepsJavaFileSteps(BlahHomePageStepsJavaFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahHomePageSteps.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahHomePageStepsJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahHomePageSteps.java");
        object.setInputOutputs("Content", docString);
    }
}
