package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlah2JsonRequestJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah2/Blah2JsonRequest.java file will be as follows$")
    public void TheClaimProjectBlah2JsonRequestJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("MbtTransformerBlah2JsonRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
