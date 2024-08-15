package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerClaimResponseJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/pharmacy/ClaimResponse.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsPharmacyClaimResponseJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("ClaimResponseJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ClaimResponseJavaFile").setPath("src/test/java/org/farhan/objects/pharmacy/ClaimResponse.java");
        MbtTransformerFactory.get("ClaimResponseJavaFile").assertInputOutputs("Content", docString);
    }
}
