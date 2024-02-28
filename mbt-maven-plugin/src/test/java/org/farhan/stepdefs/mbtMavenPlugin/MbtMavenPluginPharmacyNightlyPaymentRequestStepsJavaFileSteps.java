package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginPharmacyNightlyPaymentRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyNightlyPaymentRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
