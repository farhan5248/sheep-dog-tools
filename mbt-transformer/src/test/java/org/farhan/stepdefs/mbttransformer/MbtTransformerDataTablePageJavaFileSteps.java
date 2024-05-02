package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerDataTablePageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DataTablePage.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahDataTablePageJavaFileWillBePresent() {
        MbtTransformerFactory.get("DataTablePageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DataTablePageJavaFile").setPath("src/test/java/org/farhan/objects/blah/DataTablePage.java");
        MbtTransformerFactory.get("DataTablePageJavaFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, DataTablePage.java file, Object section will be as follows$")
    public void theMbtTransformerPluginDataTablePageJavaFileObjectSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("DataTablePageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DataTablePageJavaFile").setPath("DataTablePage.java");
        MbtTransformerFactory.get("DataTablePageJavaFile").assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The mbt-transformer plugin, DataTablePage.java file, Fields section will be as follows$")
    public void theMbtTransformerPluginDataTablePageJavaFileFieldsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("DataTablePageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("DataTablePageJavaFile").setPath("DataTablePage.java");
        MbtTransformerFactory.get("DataTablePageJavaFile").assertInputOutputs(dataTable, "FieldsSection");
    }
}
