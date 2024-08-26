package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeNightlyJobStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeNightlyJobSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeNightlyJobStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeNightlyJobStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeNightlyJobStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeNightlyJobSteps.java");
        MbtTransformerFactory.get("AcmeNightlyJobStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
