package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeAccountSearchRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeAccountSearchRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeAccountSearchRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeAccountSearchRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeAccountSearchRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeAccountSearchRequestSteps.java");
        MbtTransformerFactory.get("AcmeAccountSearchRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
