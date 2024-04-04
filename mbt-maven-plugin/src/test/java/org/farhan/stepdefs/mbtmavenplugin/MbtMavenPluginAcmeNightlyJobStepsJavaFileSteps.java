package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeNightlyJobStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeNightlyJobSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeNightlyJobStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeNightlyJobStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeNightlyJobStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeNightlyJobSteps.java");
        MbtMavenPluginFactory.get("AcmeNightlyJobStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
