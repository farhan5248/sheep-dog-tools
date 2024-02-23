package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginOutputTxtFileJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeToolOutputTxtFileJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("OutputTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
