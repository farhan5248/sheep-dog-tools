package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerLogInRequestJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acme/LogInRequest.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmeLogInRequestJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("LogInRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("LogInRequestJavaFile").setPath("src/test/java/org/farhan/objects/acme/LogInRequest.java");
        MbtTransformerFactory.get("LogInRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
