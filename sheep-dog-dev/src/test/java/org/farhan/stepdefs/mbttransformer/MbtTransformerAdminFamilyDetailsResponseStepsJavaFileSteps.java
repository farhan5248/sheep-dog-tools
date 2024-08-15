package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAdminFamilyDetailsResponseStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/admin/AdminFamilyDetailsResponseSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAdminAdminFamilyDetailsResponseStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AdminFamilyDetailsResponseStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AdminFamilyDetailsResponseStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/admin/AdminFamilyDetailsResponseSteps.java");
        MbtTransformerFactory.get("AdminFamilyDetailsResponseStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
