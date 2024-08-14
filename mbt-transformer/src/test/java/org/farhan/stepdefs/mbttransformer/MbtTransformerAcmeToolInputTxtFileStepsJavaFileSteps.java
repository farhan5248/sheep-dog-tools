package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeToolInputTxtFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmetool/AcmeToolInputTxtFileSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmetoolAcmeToolInputTxtFileStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeToolInputTxtFileStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeToolInputTxtFileStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmeToolInputTxtFileSteps.java");
        MbtTransformerFactory.get("AcmeToolInputTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
