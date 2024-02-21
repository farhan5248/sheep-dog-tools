package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahDataTablePageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("MbtTransformerBlahDataTablePageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
