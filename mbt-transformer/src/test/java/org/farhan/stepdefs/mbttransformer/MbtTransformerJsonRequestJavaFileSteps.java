package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerJsonRequestJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah2/JsonRequest.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlah2JsonRequestJavaFileWillBePresent() {
        MbtTransformerFactory.get("JsonRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("JsonRequestJavaFile").setPath("src/test/java/org/farhan/objects/blah2/JsonRequest.java");
        MbtTransformerFactory.get("JsonRequestJavaFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, JsonRequest.java file, Object section will be as follows$")
    public void theMbtTransformerPluginJsonRequestJavaFileObjectSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("JsonRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("JsonRequestJavaFile").setPath("JsonRequest.java");
        MbtTransformerFactory.get("JsonRequestJavaFile").assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The mbt-transformer plugin, JsonRequest.java file, Fields section will be as follows$")
    public void theMbtTransformerPluginJsonRequestJavaFileFieldsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("JsonRequestJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("JsonRequestJavaFile").setPath("JsonRequest.java");
        MbtTransformerFactory.get("JsonRequestJavaFile").assertInputOutputs(dataTable, "FieldsSection");
    }
}
