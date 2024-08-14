package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeToolDoItGoalStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmetool/AcmeToolDoItGoalSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeToolAcmeToolDoItGoalStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeToolDoItGoalStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeToolDoItGoalStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmeToolDoItGoalSteps.java");
        MbtTransformerFactory.get("AcmeToolDoItGoalStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
