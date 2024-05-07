package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlahObjectPageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows$")
    public void theMbtTransformerPluginBlahObjectPageStepsJavaFileFieldsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs(dataTable, "FieldsSection");
    }

    @Given("^The mbt-transformer plugin, BlahObjectPageSteps.java file, Object section will be as follows$")
    public void theMbtTransformerPluginBlahObjectPageStepsJavaFileObjectSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBePresent() {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs("Present");
    }
}
