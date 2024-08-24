package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerReportingJobJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/ReportingJob.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeReportingJobJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("ReportingJobJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ReportingJobJavaFile").setPath("src/test/java/org/farhan/objects/acme/ReportingJob.java");
        MbtTransformerFactory.get("ReportingJobJavaFile").assertInputOutputs("Content", docString);
    }
}
