package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextStepObjectFeatureFileSteps {

    @Given("^The src/test/resources/cucumber/StepObject.feature file will be created as follows$")
    public void theSrcTestResourcesCucumberStepObjectFeatureFileWillBeCreatedAsFollows(String docString) {
        XtextFactory.get("StepObjectFeatureFile").setComponent("xtext");
        XtextFactory.get("StepObjectFeatureFile").setPath("src/test/resources/cucumber/StepObject.feature");
        XtextFactory.get("StepObjectFeatureFile").assertInputOutputs("Content", docString);
    }
}
