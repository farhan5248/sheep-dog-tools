package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPharmacyClaimResponseStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimResponseSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyClaimResponseStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("PharmacyClaimResponseStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PharmacyClaimResponseStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimResponseSteps.java");
        MbtTransformerFactory.get("PharmacyClaimResponseStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
