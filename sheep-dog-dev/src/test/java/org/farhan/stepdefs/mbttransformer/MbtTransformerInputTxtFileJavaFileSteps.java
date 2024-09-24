package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerInputTxtFileJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acmeTool/InputTxtFile.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmeToolInputTxtFileJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("InputTxtFileJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("InputTxtFileJavaFile").setPath("src/test/java/org/farhan/objects/acmeTool/InputTxtFile.java");
        MbtTransformerFactory.get("InputTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
