package org.farhan.stepdefs.mbttransformer;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import io.cucumber.guice.ScenarioScoped;
import com.google.inject.Inject;
import org.farhan.objects.mbttransformer.ObjectPageJavaFile;
import io.cucumber.datatable.DataTable;

@ScenarioScoped
public class MbtTransformerObjectPageJavaFileSteps extends TestSteps {

    @Inject
    public MbtTransformerObjectPageJavaFileSteps(ObjectPageJavaFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file is created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.assertInputOutputs("Present");
    }

    @Given("^The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows$")
    public void theMbtTransformerPluginObjectPageJavaFileFieldsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("ObjectPage.java");
        object.assertInputOutputs(dataTable, "FieldsSection");
    }
}
