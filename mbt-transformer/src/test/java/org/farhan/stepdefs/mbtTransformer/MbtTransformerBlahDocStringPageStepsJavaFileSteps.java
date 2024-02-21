package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahDocStringPageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java file will be as follows$")
    public void TheClaimProjectBlahDocStringPageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("MbtTransformerBlahDocStringPageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
