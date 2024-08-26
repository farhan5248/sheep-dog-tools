package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAccountSearchRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acme/AccountSearchRequest.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmeAccountSearchRequestJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AccountSearchRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AccountSearchRequestJavaFile").setPath("src/test/java/org/farhan/objects/acme/AccountSearchRequest.java");
        MbtTransformerFactory.get("AccountSearchRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
