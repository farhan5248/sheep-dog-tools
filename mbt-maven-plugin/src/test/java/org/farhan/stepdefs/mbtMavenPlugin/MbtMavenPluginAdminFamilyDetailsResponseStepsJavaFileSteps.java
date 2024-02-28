package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAdminFamilyDetailsResponseStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/admin/AdminFamilyDetailsResponseSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAdminAdminFamilyDetailsResponseStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AdminFamilyDetailsResponseStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
