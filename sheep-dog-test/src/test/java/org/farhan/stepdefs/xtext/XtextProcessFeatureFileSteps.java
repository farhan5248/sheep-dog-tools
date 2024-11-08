package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ProcessFeatureFile;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class XtextProcessFeatureFileSteps {

	private TestObject object;

	@Inject
	public XtextProcessFeatureFileSteps(ProcessFeatureFile object) {
		this.object = (TestObject) object;
	}

	@Given("^The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows$")
	public void theXtextPluginSrcTestResourcesCucumberProcessFeatureFileStepsSnippetIsCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("src/test/resources/cucumber/Process.feature");
		object.setInputOutputs(dataTable, "StepsSnippet");
	}

	@Given("^The xtext plugin, src/test/resources/cucumber/Process.feature file background steps snippet is created as follows$")
	public void theXtextPluginSrcTestResourcesCucumberProcessFeatureFileBackgroundStepsSnippetIsCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("src/test/resources/cucumber/Process.feature");
		object.setInputOutputs(dataTable, "BackgroundstepsSnippet");
	}

	@Given("^The Process.feature file steps snippet is created as follows$")
	public void theProcessFeatureFileStepsSnippetIsCreatedAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("Process.feature");
		object.setInputOutputs(dataTable, "StepsSnippet");
	}
}
