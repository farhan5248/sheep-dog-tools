package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerObjectPageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBePresent() {
        MbtTransformerFactory.get("ObjectPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ObjectPageJavaFile").setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        MbtTransformerFactory.get("ObjectPageJavaFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, ObjectPage.java file Object section will be created as follows$")
    public void theMbtTransformerPluginObjectPageJavaFileObjectSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ObjectPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ObjectPageJavaFile").setPath("ObjectPage.java");
        MbtTransformerFactory.get("ObjectPageJavaFile").assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows$")
    public void theMbtTransformerPluginObjectPageJavaFileFieldsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ObjectPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ObjectPageJavaFile").setPath("ObjectPage.java");
        MbtTransformerFactory.get("ObjectPageJavaFile").assertInputOutputs(dataTable, "FieldsSection");
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ObjectPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ObjectPageJavaFile").setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        MbtTransformerFactory.get("ObjectPageJavaFile").setInputOutputs("Content", docString);
    }
}
