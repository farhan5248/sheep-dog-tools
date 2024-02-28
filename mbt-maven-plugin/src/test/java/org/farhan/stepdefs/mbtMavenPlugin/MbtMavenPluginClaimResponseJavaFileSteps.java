package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginClaimResponseJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/pharmacy/ClaimResponse.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsPharmacyClaimResponseJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("ClaimResponseJavaFile").assertInputOutputs("Content", docString);
    }
}
