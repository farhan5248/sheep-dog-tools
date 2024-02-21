package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahDocStringPageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DocStringPage.java file will be as follows$")
    public void TheClaimProjectBlahDocStringPageJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("MbtTransformerBlahDocStringPageJavaFile").assertInputOutputs("Content", docString);
    }
}
