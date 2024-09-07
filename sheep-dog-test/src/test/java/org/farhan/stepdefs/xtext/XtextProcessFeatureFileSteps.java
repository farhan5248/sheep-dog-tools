package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextProcessFeatureFileSteps {

    @Given("^The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows$")
    public void theXtextPluginSrcTestResourcesCucumberProcessFeatureFileStepsSnippetIsCreatedAsFollows(DataTable dataTable) {
        XtextFactory.get("ProcessFeatureFile").setComponent("xtext");
        XtextFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/Process.feature");
        XtextFactory.get("ProcessFeatureFile").setInputOutputs(dataTable, "StepsSnippet");
    }
}