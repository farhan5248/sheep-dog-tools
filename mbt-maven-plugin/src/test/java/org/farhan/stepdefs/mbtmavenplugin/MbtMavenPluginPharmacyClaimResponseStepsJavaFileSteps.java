package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginPharmacyClaimResponseStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimResponseSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyClaimResponseStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("PharmacyClaimResponseStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("PharmacyClaimResponseStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimResponseSteps.java");
        MbtMavenPluginFactory.get("PharmacyClaimResponseStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
