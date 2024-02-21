package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlahDataTablePageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahDataTablePageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
