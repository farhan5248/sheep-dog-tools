package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginPharmacyClaimRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsPharmacyPharmacyClaimRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("PharmacyClaimRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
