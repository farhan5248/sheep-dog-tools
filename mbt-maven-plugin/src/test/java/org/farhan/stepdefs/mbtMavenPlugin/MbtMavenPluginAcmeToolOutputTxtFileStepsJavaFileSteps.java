package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeToolOutputTxtFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolOutputTxtFileSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeToolAcmeToolOutputTxtFileStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeToolOutputTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
