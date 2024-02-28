package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginFamilyDetailsResponseJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/admin/FamilyDetailsResponse.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAdminFamilyDetailsResponseJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("FamilyDetailsResponseJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("FamilyDetailsResponseJavaFile").setPath("src/test/java/org/farhan/objects/admin/FamilyDetailsResponse.java");
        MbtMavenPluginFactory.get("FamilyDetailsResponseJavaFile").assertInputOutputs("Content", docString);
    }
}
