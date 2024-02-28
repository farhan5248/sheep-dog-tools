package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeToolInputTxtFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolInputTxtFileSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeToolAcmeToolInputTxtFileStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeToolInputTxtFileStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeToolInputTxtFileStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolInputTxtFileSteps.java");
        MbtMavenPluginFactory.get("AcmeToolInputTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
