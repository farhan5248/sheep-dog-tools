package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerClaimRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/pharmacy/ClaimRequest.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsPharmacyClaimRequestJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("ClaimRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ClaimRequestJavaFile").setPath("src/test/java/org/farhan/objects/pharmacy/ClaimRequest.java");
        MbtTransformerFactory.get("ClaimRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
