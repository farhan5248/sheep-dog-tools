package org.farhan.stepdefs.xtext;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.InputFileFeatureFile;
import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

@ScenarioScoped
public class XtextInputFileFeatureFileSteps {

	private TestObject object;

	@Inject
	public XtextInputFileFeatureFileSteps(InputFileFeatureFile object) {
		this.object = (TestObject) object;
	}
	
	@Given("^The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows$")
	public void theSrcGenStepDefsDailyBatchjobInputFileFeatureFileWillBeCreatedAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("src-gen-step-defs/daily batchjob/Input file.feature");
		object.assertInputOutputs(dataTable);
	}

	@Given("^The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows$")
	public void theSrcGenStepDefsDailyBatchjobInputFileFeatureFileIsCreatedAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("src-gen-step-defs/daily batchjob/Input file.feature");
		object.setInputOutputs(dataTable);
	}

	@Given("^The src-gen-step-defs/daily batchjob/app/Input file.feature file is created as follows$")
	public void theSrcGenStepDefsDailyBatchjobAppInputFileFeatureFileIsCreatedAsFollows(DataTable dataTable) {
		object.setComponent("xtext");
		object.setPath("src-gen-step-defs/daily batchjob/app/Input file.feature");
		object.setInputOutputs(dataTable);
	}
}
