package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerDocStringPageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DocStringPage.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahDocStringPageJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("DocStringPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DocStringPageJavaFile").setPath("src/test/java/org/farhan/objects/blah/DocStringPage.java");
        MbtTransformerFactory.get("DocStringPageJavaFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DocStringPage.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahDocStringPageJavaFileWillBePresent() {
        MbtTransformerFactory.get("DocStringPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DocStringPageJavaFile").setPath("src/test/java/org/farhan/objects/blah/DocStringPage.java");
        MbtTransformerFactory.get("DocStringPageJavaFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, DocStringPage.java file, Object section will be as follows$")
    public void theMbtTransformerPluginDocStringPageJavaFileObjectSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("DocStringPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DocStringPageJavaFile").setPath("DocStringPage.java");
        MbtTransformerFactory.get("DocStringPageJavaFile").assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The mbt-transformer plugin, DocStringPage.java file, Fields section will be as follows$")
    public void theMbtTransformerPluginDocStringPageJavaFileFieldsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("DocStringPageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DocStringPageJavaFile").setPath("DocStringPage.java");
        MbtTransformerFactory.get("DocStringPageJavaFile").assertInputOutputs(dataTable, "FieldsSection");
    }
}
