package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginLogInRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/LogInRequest.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeLogInRequestJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("LogInRequestJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("LogInRequestJavaFile").setPath("src/test/java/org/farhan/objects/acme/LogInRequest.java");
        MbtMavenPluginFactory.get("LogInRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
