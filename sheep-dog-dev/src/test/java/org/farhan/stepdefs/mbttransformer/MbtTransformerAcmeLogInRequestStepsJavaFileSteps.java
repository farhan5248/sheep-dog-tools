package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeLogInRequestStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsAcmeAcmeLogInRequestStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeLogInRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeLogInRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java");
        MbtTransformerFactory.get("AcmeLogInRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
