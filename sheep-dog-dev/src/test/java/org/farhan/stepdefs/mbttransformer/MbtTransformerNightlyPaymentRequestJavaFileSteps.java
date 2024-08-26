package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerNightlyPaymentRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/pharmacy/NightlyPaymentRequest.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanObjectsPharmacyNightlyPaymentRequestJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("NightlyPaymentRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("NightlyPaymentRequestJavaFile").setPath("src/test/java/org/farhan/objects/pharmacy/NightlyPaymentRequest.java");
        MbtTransformerFactory.get("NightlyPaymentRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
