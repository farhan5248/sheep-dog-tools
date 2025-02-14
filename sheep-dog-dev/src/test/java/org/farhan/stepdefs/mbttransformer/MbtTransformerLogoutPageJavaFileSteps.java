package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.LogoutPageJavaFile;

@ScenarioScoped
public class MbtTransformerLogoutPageJavaFileSteps extends TestSteps {

    @Inject
    public MbtTransformerLogoutPageJavaFileSteps(LogoutPageJavaFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/LogoutPage.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahLogoutPageJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/java/org/farhan/objects/blah/LogoutPage.java");
        object.setInputOutputs("Content", docString);
    }
}
