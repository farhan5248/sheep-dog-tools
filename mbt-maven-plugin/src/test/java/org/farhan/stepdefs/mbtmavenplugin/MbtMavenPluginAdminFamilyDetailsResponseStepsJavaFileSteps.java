package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAdminFamilyDetailsResponseStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/admin/AdminFamilyDetailsResponseSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAdminAdminFamilyDetailsResponseStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AdminFamilyDetailsResponseStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AdminFamilyDetailsResponseStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/admin/AdminFamilyDetailsResponseSteps.java");
        MbtMavenPluginFactory.get("AdminFamilyDetailsResponseStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
