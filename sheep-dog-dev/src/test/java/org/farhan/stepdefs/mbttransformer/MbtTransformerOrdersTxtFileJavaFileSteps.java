package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerOrdersTxtFileJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/OrdersTxtFile.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeOrdersTxtFileJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("OrdersTxtFileJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("OrdersTxtFileJavaFile").setPath("src/test/java/org/farhan/objects/acme/OrdersTxtFile.java");
        MbtTransformerFactory.get("OrdersTxtFileJavaFile").assertInputOutputs("Content", docString);
    }
}
