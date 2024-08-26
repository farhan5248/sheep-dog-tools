package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeReportingJobStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeReportingJobSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeReportingJobStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeReportingJobStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeReportingJobStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeReportingJobSteps.java");
        MbtTransformerFactory.get("AcmeReportingJobStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
