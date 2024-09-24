package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmeToolInputTxtFileStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/acmetool/AcmeToolInputTxtFileSteps.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsAcmetoolAcmeToolInputTxtFileStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmeToolInputTxtFileStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmeToolInputTxtFileStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmeToolInputTxtFileSteps.java");
        MbtTransformerFactory.get("AcmeToolInputTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
