package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPharmacyNightlyPaymentRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyNightlyPaymentRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java");
        MbtTransformerFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
