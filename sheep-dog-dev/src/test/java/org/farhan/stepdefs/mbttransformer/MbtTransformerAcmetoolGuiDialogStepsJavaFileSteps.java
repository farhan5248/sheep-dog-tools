package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmetoolGuiDialogStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmetool/AcmetoolGuiDialogSteps.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmetoolAcmetoolGuiDialogStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmetoolGuiDialogStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmetoolGuiDialogStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmetoolGuiDialogSteps.java");
        MbtTransformerFactory.get("AcmetoolGuiDialogStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
