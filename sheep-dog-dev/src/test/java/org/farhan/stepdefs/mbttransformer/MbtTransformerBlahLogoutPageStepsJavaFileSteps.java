package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.BlahLogoutPageStepsJavaFile;

@ScenarioScoped
public class MbtTransformerBlahLogoutPageStepsJavaFileSteps extends TestSteps {

    @Inject
    public MbtTransformerBlahLogoutPageStepsJavaFileSteps(BlahLogoutPageStepsJavaFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahLogoutPageSteps.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahLogoutPageStepsJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahLogoutPageSteps.java");
        object.setInputOutputs("Content", docString);
    }
}
