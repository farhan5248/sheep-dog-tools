package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAccountDetailsPageJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/AccountDetailsPage.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeAccountDetailsPageJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AccountDetailsPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AccountDetailsPageJavaFile").setPath("src/test/java/org/farhan/objects/acme/AccountDetailsPage.java");
        MbtTransformerFactory.get("AccountDetailsPageJavaFile").assertInputOutputs("Content", docString);
    }
}