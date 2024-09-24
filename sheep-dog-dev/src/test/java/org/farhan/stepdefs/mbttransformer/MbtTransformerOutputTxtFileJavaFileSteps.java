package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerOutputTxtFileJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmeToolOutputTxtFileJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("OutputTxtFileJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("OutputTxtFileJavaFile").setPath("src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java");
        MbtTransformerFactory.get("OutputTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
