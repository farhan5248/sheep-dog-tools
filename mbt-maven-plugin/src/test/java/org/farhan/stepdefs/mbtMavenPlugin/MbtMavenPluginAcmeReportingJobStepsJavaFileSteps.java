package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeReportingJobStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeReportingJobSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeReportingJobStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeReportingJobStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeReportingJobStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeReportingJobSteps.java");
        MbtMavenPluginFactory.get("AcmeReportingJobStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
