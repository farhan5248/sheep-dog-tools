package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerOutputTxtFileJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeToolOutputTxtFileJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("OutputTxtFileJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("OutputTxtFileJavaFile").setPath("src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java");
        MbtTransformerFactory.get("OutputTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
