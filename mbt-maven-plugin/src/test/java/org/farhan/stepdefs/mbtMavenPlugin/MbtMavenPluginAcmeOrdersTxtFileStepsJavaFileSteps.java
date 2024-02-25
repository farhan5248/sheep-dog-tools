package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeOrdersTxtFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeOrdersTxtFileSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeOrdersTxtFileStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeOrdersTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
