package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPharmacyNightlyPaymentRequestStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyNightlyPaymentRequestStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java");
        MbtTransformerFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
