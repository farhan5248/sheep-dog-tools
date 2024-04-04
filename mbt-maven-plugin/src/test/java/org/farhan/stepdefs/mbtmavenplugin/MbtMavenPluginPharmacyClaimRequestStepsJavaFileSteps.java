package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginPharmacyClaimRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyClaimRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("PharmacyClaimRequestStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("PharmacyClaimRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java");
        MbtMavenPluginFactory.get("PharmacyClaimRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
