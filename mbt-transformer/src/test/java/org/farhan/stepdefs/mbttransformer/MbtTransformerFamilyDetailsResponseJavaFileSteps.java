package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerFamilyDetailsResponseJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/admin/FamilyDetailsResponse.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAdminFamilyDetailsResponseJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("FamilyDetailsResponseJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("FamilyDetailsResponseJavaFile").setPath("src/test/java/org/farhan/objects/admin/FamilyDetailsResponse.java");
        MbtTransformerFactory.get("FamilyDetailsResponseJavaFile").assertInputOutputs("Content", docString);
    }
}
