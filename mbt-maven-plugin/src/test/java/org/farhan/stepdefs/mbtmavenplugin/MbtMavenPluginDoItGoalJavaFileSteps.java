package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginDoItGoalJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acmeTool/DoItGoal.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeToolDoItGoalJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("DoItGoalJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("DoItGoalJavaFile").setPath("src/test/java/org/farhan/objects/acmeTool/DoItGoal.java");
        MbtMavenPluginFactory.get("DoItGoalJavaFile").assertInputOutputs("Content", docString);
    }
}
