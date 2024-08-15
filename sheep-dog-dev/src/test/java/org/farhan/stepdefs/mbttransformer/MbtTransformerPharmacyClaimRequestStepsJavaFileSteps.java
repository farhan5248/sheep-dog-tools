package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPharmacyClaimRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyClaimRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("PharmacyClaimRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PharmacyClaimRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java");
        MbtTransformerFactory.get("PharmacyClaimRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
