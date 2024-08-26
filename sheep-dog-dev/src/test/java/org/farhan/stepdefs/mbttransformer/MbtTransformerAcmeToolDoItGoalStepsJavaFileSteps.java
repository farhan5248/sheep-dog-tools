package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeToolDoItGoalStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmetool/AcmeToolDoItGoalSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmetoolAcmeToolDoItGoalStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeToolDoItGoalStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeToolDoItGoalStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmeToolDoItGoalSteps.java");
        MbtTransformerFactory.get("AcmeToolDoItGoalStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
