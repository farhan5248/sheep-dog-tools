package org.farhan.stepdefs.codeprj.src.test.java.org.farhan.stepdefs.blah;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.src.test.java.org.farhan.stepdefs.blah.BlahObjectPageStepsJavaFile;

@ScenarioScoped
public class CodePrjBlahObjectPageStepsJavaFileSteps extends TestSteps {

    @Inject
    public CodePrjBlahObjectPageStepsJavaFileSteps(BlahObjectPageStepsJavaFile object) {
        super(object);
    }

    @Given("^The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Fields section will be created as follows$")
    public void theCodePrjProjectSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileFieldsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("code-prj");
        object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.assertInputOutputs(dataTable, "FieldsSection");
    }

    @Given("^The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is created as follows$")
    public void theCodePrjProjectSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows$")
    public void theCodePrjProjectSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present$")
    public void theCodePrjProjectSrcTestJavaOrgFarhanStepdefsBlahBlahObjectPageStepsJavaFileWillBePresent() {
        object.setComponent("code-prj");
        object.setPath("src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java");
        object.assertInputOutputs("Present");
    }
}
