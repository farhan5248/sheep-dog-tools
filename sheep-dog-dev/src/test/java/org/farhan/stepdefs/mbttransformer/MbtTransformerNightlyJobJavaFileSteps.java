package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerNightlyJobJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/NightlyJob.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeNightlyJobJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("NightlyJobJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("NightlyJobJavaFile").setPath("src/test/java/org/farhan/objects/acme/NightlyJob.java");
        MbtTransformerFactory.get("NightlyJobJavaFile").assertInputOutputs("Content", docString);
    }
}