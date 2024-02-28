package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginNightlyJobJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/NightlyJob.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeNightlyJobJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("NightlyJobJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("NightlyJobJavaFile").setPath("src/test/java/org/farhan/objects/acme/NightlyJob.java");
        MbtMavenPluginFactory.get("NightlyJobJavaFile").assertInputOutputs("Content", docString);
    }
}
