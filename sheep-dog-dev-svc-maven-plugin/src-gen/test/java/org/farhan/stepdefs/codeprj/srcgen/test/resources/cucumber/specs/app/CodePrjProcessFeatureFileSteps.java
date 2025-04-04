package org.farhan.stepdefs.codeprj.srcgen.test.resources.cucumber.specs.app;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.srcgen.test.resources.cucumber.specs.app.ProcessFeatureFile;

public class CodePrjProcessFeatureFileSteps extends TestSteps {

    public CodePrjProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/app/Process.feature file is created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsAppProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/app/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src-gen/test/resources/cucumber/specs/app/Process.feature file will be created as follows$")
    public void theCodePrjProjectSrcGenTestResourcesCucumberSpecsAppProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src-gen/test/resources/cucumber/specs/app/Process.feature");
        object.assertInputOutputs("Content", docString);
    }
}
