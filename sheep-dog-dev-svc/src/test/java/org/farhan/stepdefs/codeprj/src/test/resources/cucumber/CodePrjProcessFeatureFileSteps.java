package org.farhan.stepdefs.codeprj.src.test.resources.cucumber;

import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.src.test.resources.cucumber.ProcessFeatureFile;

public class CodePrjProcessFeatureFileSteps extends TestSteps {

    public CodePrjProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file is created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/Process.feature file will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/Process.feature");
        object.assertInputOutputs("Content", docString);
    }
}
