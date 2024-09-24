package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAccountSearchRequestJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acme/AccountSearchRequest.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmeAccountSearchRequestJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("AccountSearchRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("AccountSearchRequestJavaFile").setPath("src/test/java/org/farhan/objects/acme/AccountSearchRequest.java");
        MbtTransformerFactory.get("AccountSearchRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
