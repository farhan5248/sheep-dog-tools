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

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBePresent() {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows$")
    public void theMbtTransformerPluginBlahObjectPageStepsJavaFileFieldsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs(dataTable, "FieldsSection");
    }

    @Given("^The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows$")
    public void theMbtTransformerPluginBlahObjectPageStepsJavaFileObjectSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").setPath("BlahObjectPageSteps.java");
        MbtTransformerFactory.get("BlahObjectPageStepsJavaFile").assertInputOutputs(dataTable, "ObjectSection");
    }
}
