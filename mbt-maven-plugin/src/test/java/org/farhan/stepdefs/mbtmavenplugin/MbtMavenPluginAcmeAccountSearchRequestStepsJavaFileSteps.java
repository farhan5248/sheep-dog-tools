package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeAccountSearchRequestStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeAccountSearchRequestSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeAccountSearchRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeAccountSearchRequestStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeAccountSearchRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeAccountSearchRequestSteps.java");
        MbtMavenPluginFactory.get("AcmeAccountSearchRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
