package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerOrdersTxtFileJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acme/OrdersTxtFile.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmeOrdersTxtFileJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("OrdersTxtFileJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("OrdersTxtFileJavaFile").setPath("src/test/java/org/farhan/objects/acme/OrdersTxtFile.java");
        MbtTransformerFactory.get("OrdersTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
