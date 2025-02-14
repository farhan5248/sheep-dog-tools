package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.LoginPageJavaFile;

@ScenarioScoped
public class MbtTransformerLoginPageJavaFileSteps extends TestSteps {

    @Inject
    public MbtTransformerLoginPageJavaFileSteps(LoginPageJavaFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/LoginPage.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahLoginPageJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/java/org/farhan/objects/blah/LoginPage.java");
        object.setInputOutputs("Content", docString);
    }
}
