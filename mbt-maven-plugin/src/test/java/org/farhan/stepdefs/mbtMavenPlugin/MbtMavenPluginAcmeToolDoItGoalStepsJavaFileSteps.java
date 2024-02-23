package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeToolDoItGoalStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolDoItGoalSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeToolAcmeToolDoItGoalStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeToolDoItGoalStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
