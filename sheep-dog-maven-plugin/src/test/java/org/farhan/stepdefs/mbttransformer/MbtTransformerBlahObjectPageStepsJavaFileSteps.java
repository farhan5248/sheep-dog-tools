package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlahObjectPageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
