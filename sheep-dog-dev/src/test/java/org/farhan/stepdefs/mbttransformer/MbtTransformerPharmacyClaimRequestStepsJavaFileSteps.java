package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPharmacyClaimRequestStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyClaimRequestStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("PharmacyClaimRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PharmacyClaimRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java");
        MbtTransformerFactory.get("PharmacyClaimRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
