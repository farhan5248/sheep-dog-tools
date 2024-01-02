package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahDataTablePageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/BlahDataTablePage.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("BlahDataTablePageFile").assertInputOutputs("Content", docString);
    }
}
