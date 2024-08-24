package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeHomePageStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeHomePageSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeHomePageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeHomePageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeHomePageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeHomePageSteps.java");
        MbtTransformerFactory.get("AcmeHomePageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
