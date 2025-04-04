package org.farhan.stepdefs.codeprj.srcgen.test.java.org.farhan.objects.blah;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.srcgen.test.java.org.farhan.objects.blah.ObjectPageJavaFile;

public class CodePrjObjectPageJavaFileSteps extends TestSteps {

    public CodePrjObjectPageJavaFileSteps(ObjectPageJavaFile object) {
        super(object);
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file Fields section will be created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanObjectsBlahObjectPageJavaFileFieldsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.assertInputOutputs(dataTable, "FieldsSection");
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file Object section will be created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanObjectsBlahObjectPageJavaFileObjectSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.assertInputOutputs(dataTable, "ObjectSection");
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file is created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanObjectsBlahObjectPageJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file will be created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file will be present$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBePresent() {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.assertInputOutputs("Present");
    }
}
