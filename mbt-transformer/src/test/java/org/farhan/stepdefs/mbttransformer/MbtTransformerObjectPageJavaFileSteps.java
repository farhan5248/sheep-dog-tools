package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerObjectPageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file is as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ObjectPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ObjectPageJavaFile").setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        MbtTransformerFactory.get("ObjectPageJavaFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("ObjectPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ObjectPageJavaFile").setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        MbtTransformerFactory.get("ObjectPageJavaFile").assertInputOutputs("Content", docString);
    }
}
