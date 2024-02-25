package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginOrdersTxtFileJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/OrdersTxtFile.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeOrdersTxtFileJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("OrdersTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
