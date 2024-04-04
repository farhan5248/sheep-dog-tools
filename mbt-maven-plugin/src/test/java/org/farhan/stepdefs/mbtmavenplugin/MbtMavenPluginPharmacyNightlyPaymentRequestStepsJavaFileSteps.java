package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginPharmacyNightlyPaymentRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyNightlyPaymentRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java");
        MbtMavenPluginFactory.get("PharmacyNightlyPaymentRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
