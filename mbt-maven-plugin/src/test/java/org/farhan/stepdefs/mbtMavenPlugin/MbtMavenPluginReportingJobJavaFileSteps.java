package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginReportingJobJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/ReportingJob.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeReportingJobJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("ReportingJobJavaFile").assertInputOutputs("Content", docString);
    }
}
