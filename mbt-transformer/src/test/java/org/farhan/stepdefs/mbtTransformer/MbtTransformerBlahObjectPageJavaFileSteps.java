package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;

import io.cucumber.java.en.Given;

public class MbtTransformerBlahObjectPageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/BlahObjectPage.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/BlahObjectPage.java file is as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageFile").setInputOutputs("Content", docString);
    }
}
