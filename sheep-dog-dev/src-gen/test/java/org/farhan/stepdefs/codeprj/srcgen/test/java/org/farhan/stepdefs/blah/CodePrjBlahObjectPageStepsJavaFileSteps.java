package org.farhan.stepdefs.codeprj.srcgen.test.java.org.farhan.stepdefs.blah;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.srcgen.test.java.org.farhan.stepdefs.blah.BlahObjectPageStepsJavaFile;

@ScenarioScoped
public class CodePrjBlahObjectPageStepsJavaFileSteps extends TestSteps {

    @Inject
    public CodePrjBlahObjectPageStepsJavaFileSteps(BlahObjectPageStepsJavaFile object) {
        super(object);
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileHeaderSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.assertInputOutputs(dataTable, "HeaderSection");
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileMethodsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.assertInputOutputs(dataTable, "MethodsSection");
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present$")
    public void theCodePrjProjectSrcGenTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBePresent() {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.assertInputOutputs("Present");
    }
}
