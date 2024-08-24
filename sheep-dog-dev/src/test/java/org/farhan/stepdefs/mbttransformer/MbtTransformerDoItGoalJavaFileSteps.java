package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerDoItGoalJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acmeTool/DoItGoal.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeToolDoItGoalJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("DoItGoalJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DoItGoalJavaFile").setPath("src/test/java/org/farhan/objects/acmeTool/DoItGoal.java");
        MbtTransformerFactory.get("DoItGoalJavaFile").assertInputOutputs("Content", docString);
    }
}
