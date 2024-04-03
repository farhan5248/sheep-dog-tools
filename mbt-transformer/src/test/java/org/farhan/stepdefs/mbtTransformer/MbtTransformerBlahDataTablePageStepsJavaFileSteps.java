package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlahDataTablePageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDatatablePageSteps.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahDataTablePageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
