package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerJsonRequestJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah2/JsonRequest.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlah2JsonRequestJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("JsonRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("JsonRequestJavaFile").setPath("src/test/java/org/farhan/objects/blah2/JsonRequest.java");
        MbtTransformerFactory.get("JsonRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
