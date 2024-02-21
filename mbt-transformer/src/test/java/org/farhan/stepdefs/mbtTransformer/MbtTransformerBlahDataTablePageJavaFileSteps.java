package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahDataTablePageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DataTablePage.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("MbtTransformerBlahDataTablePageJavaFile").assertInputOutputs("Content", docString);
    }
}
