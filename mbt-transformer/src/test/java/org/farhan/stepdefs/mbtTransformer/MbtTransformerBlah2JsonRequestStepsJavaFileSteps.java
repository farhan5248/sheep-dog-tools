package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlah2JsonRequestStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("Blah2JsonRequestStepsFile").assertInputOutputs("Content", docString);
    }
}
