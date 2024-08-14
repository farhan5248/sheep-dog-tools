package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeToolOutputTxtFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmetool/AcmeToolOutputTxtFileSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmetoolAcmeToolOutputTxtFileStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeToolOutputTxtFileStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeToolOutputTxtFileStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmeToolOutputTxtFileSteps.java");
        MbtTransformerFactory.get("AcmeToolOutputTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
