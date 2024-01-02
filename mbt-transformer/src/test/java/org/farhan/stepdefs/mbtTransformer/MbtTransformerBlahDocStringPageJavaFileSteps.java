package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahDocStringPageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/BlahDocStringPage.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("BlahDocStringPageFile").assertInputOutputs("Content", docString);
    }
}
