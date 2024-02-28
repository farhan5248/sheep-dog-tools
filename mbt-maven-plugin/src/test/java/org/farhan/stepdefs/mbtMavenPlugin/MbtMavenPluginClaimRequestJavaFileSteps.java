package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginClaimRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/pharmacy/ClaimRequest.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsPharmacyClaimRequestJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("ClaimRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
