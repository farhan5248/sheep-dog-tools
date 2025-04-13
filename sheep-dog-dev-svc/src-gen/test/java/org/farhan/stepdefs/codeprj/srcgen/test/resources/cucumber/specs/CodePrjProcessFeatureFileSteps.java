package org.farhan.stepdefs.codeprj.srcgen.test.resources.cucumber.specs;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.srcgen.test.resources.cucumber.specs.ProcessFeatureFile;

public class CodePrjProcessFeatureFileSteps extends TestSteps {

    public CodePrjProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object, "code-prj", "src-gen/test/resources/cucumber/specs/Process.feature");
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file is created as follows$")
    public void isCreatedAsFollows(String docString) {
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file will be created as follows$")
    public void willBeCreatedAsFollows(String docString) {
        object.assertInputOutputs("Content", docString);
    }
}
