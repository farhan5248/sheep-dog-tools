package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlah2JsonRequestStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlah2Blah2JsonRequestStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("Blah2JsonRequestStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("Blah2JsonRequestStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java");
        MbtTransformerFactory.get("Blah2JsonRequestStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
