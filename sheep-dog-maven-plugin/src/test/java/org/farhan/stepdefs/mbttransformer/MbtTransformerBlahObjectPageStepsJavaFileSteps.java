package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;

public class MbtTransformerBlahObjectPageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, target/mbt/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is created as follows$")
    public void theMbtTransformerPluginTargetMbtJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("target/mbt/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/mbt/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows$")
    public void theMbtTransformerPluginTargetMbtJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("target/mbt/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
