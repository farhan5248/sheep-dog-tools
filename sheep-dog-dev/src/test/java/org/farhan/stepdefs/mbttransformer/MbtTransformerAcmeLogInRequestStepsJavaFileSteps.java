package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeLogInRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeLogInRequestStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeLogInRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeLogInRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java");
        MbtTransformerFactory.get("AcmeLogInRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
