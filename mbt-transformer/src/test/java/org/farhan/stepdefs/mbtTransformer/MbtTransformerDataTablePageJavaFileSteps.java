package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerDataTablePageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DataTablePage.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahDataTablePageJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("DataTablePageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DataTablePageJavaFile").setPath("src/test/java/org/farhan/objects/blah/DataTablePage.java");
        MbtTransformerFactory.get("DataTablePageJavaFile").assertInputOutputs("Content", docString);
    }
}
