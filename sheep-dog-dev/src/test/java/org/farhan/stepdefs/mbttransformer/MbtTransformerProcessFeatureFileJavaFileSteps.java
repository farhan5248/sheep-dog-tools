package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessFeatureFileJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acmetool/ProcessFeatureFile.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmetoolProcessFeatureFileJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessFeatureFileJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessFeatureFileJavaFile").setPath("src/test/java/org/farhan/objects/acmetool/ProcessFeatureFile.java");
        MbtTransformerFactory.get("ProcessFeatureFileJavaFile").assertInputOutputs("Content", docString);
    }
}
