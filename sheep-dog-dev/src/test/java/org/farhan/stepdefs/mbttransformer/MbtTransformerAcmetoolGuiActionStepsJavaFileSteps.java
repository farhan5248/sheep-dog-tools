package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAcmetoolGuiActionStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/acmetool/AcmetoolGuiActionSteps.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsAcmetoolAcmetoolGuiActionStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AcmetoolGuiActionStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AcmetoolGuiActionStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmetool/AcmetoolGuiActionSteps.java");
        MbtTransformerFactory.get("AcmetoolGuiActionStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
