package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAccountSearchRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/AccountSearchRequest.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeAccountSearchRequestJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AccountSearchRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
