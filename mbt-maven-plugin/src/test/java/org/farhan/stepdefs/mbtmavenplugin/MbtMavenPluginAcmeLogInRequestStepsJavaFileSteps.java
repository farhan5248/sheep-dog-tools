package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeLogInRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeLogInRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeLogInRequestStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeLogInRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java");
        MbtMavenPluginFactory.get("AcmeLogInRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
