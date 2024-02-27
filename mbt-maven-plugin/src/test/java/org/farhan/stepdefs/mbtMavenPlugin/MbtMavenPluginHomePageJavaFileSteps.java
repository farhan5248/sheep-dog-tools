package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginHomePageJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/HomePage.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeHomePageJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("HomePageJavaFile").assertInputOutputs("Content", docString);
    }
}
