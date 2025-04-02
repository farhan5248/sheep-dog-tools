package org.farhan.stepdefs.codeprj.src.test.resources.cucumber.app;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.src.test.resources.cucumber.app.ProcessFeatureFile;

@ScenarioScoped
public class CodePrjProcessFeatureFileSteps extends TestSteps {

    @Inject
    public CodePrjProcessFeatureFileSteps(ProcessFeatureFile object) {
        super(object);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/app/Process.feature file is created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberAppProcessFeatureFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/app/Process.feature");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/resources/cucumber/app/Process.feature file will be created as follows$")
    public void theCodePrjProjectSrcTestResourcesCucumberAppProcessFeatureFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/resources/cucumber/app/Process.feature");
        object.assertInputOutputs("Content", docString);
    }
}
