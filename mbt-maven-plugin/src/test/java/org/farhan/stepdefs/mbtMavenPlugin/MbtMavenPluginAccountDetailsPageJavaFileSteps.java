package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAccountDetailsPageJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/AccountDetailsPage.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeAccountDetailsPageJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AccountDetailsPageJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AccountDetailsPageJavaFile").setPath("src/test/java/org/farhan/objects/acme/AccountDetailsPage.java");
        MbtMavenPluginFactory.get("AccountDetailsPageJavaFile").assertInputOutputs("Content", docString);
    }
}
