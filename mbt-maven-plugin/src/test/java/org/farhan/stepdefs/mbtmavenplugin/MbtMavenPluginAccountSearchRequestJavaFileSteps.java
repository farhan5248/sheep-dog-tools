package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAccountSearchRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/AccountSearchRequest.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeAccountSearchRequestJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AccountSearchRequestJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AccountSearchRequestJavaFile").setPath("src/test/java/org/farhan/objects/acme/AccountSearchRequest.java");
        MbtMavenPluginFactory.get("AccountSearchRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
