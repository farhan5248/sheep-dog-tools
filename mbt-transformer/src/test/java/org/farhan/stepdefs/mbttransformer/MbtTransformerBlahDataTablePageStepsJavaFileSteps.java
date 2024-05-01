package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerBlahDataTablePageStepsJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahDataTablePageStepsJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahDataTablePageStepsJavaFileWillBePresent() {
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, BlahDataTablePageSteps.java file, Object section will be as follows$")
    public void theMbtTransformerPluginBlahDataTablePageStepsJavaFileObjectSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setPath("BlahDataTablePageSteps.java");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The mbt-transformer plugin, BlahDataTablePageSteps.java file, Fields section will be as follows$")
    public void theMbtTransformerPluginBlahDataTablePageStepsJavaFileFieldsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").setPath("BlahDataTablePageSteps.java");
        MbtTransformerFactory.get("BlahDataTablePageStepsJavaFile").assertInputOutputs(dataTable, "FieldsSection");
    }
}
