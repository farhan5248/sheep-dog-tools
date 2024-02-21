package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlahDocStringPageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahDocStringPageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("BlahDocStringPageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
