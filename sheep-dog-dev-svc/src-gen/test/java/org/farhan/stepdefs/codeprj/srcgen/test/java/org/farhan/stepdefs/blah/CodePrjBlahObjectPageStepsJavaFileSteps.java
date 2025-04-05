package org.farhan.stepdefs.codeprj.srcgen.test.java.org.farhan.stepdefs.blah;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.srcgen.test.java.org.farhan.stepdefs.blah.BlahObjectPageStepsJavaFile;

public class CodePrjBlahObjectPageStepsJavaFileSteps extends TestSteps {

    public CodePrjBlahObjectPageStepsJavaFileSteps(BlahObjectPageStepsJavaFile object) {
        super(object);
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
