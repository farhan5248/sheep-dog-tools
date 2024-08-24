package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeAccountDetailsPageStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeAccountDetailsPageSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeAccountDetailsPageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeAccountDetailsPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeAccountDetailsPageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeAccountDetailsPageSteps.java");
        MbtTransformerFactory.get("AcmeAccountDetailsPageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
