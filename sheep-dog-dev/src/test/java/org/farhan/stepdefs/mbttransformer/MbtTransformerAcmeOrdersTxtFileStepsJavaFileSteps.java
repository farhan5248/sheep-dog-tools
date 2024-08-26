package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeOrdersTxtFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeOrdersTxtFileSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeOrdersTxtFileStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeOrdersTxtFileStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeOrdersTxtFileStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeOrdersTxtFileSteps.java");
        MbtTransformerFactory.get("AcmeOrdersTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
