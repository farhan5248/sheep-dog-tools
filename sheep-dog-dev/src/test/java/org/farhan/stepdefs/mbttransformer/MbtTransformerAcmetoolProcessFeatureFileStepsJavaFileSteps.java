package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmetoolProcessFeatureFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmetool/AcmetoolProcessFeatureFileSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmetoolAcmetoolProcessFeatureFileStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmetoolProcessFeatureFileStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmetoolProcessFeatureFileStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmetoolProcessFeatureFileSteps.java");
        MbtTransformerFactory.get("AcmetoolProcessFeatureFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
