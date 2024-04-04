package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginInputTxtFileJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acmeTool/InputTxtFile.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeToolInputTxtFileJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("InputTxtFileJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("InputTxtFileJavaFile").setPath("src/test/java/org/farhan/objects/acmeTool/InputTxtFile.java");
        MbtMavenPluginFactory.get("InputTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
