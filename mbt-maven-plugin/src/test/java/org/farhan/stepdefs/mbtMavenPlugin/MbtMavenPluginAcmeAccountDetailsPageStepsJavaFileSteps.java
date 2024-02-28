package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeAccountDetailsPageStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeAccountDetailsPageSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeAccountDetailsPageStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeAccountDetailsPageStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeAccountDetailsPageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeAccountDetailsPageSteps.java");
        MbtMavenPluginFactory.get("AcmeAccountDetailsPageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
