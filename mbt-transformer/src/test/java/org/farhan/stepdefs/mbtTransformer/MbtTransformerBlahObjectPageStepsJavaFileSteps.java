package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlahObjectPageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
