package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.HomePageJavaFile;

@ScenarioScoped
public class MbtTransformerHomePageJavaFileSteps extends TestSteps {

    @Inject
    public MbtTransformerHomePageJavaFileSteps(HomePageJavaFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/HomePage.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahHomePageJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/java/org/farhan/objects/blah/HomePage.java");
        object.setInputOutputs("Content", docString);
    }
}
