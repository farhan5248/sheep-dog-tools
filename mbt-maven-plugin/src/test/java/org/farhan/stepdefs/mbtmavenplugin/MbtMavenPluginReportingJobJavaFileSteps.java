package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginReportingJobJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/ReportingJob.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeReportingJobJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("ReportingJobJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("ReportingJobJavaFile").setPath("src/test/java/org/farhan/objects/acme/ReportingJob.java");
        MbtMavenPluginFactory.get("ReportingJobJavaFile").assertInputOutputs("Content", docString);
    }
}
