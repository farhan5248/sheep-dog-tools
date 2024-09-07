package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextInputFileFeatureFileSteps {

	@Given("^The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows$")
	public void theSrcGenStepDefsDailyBatchjobInputFileFeatureFileWillBeCreatedAsFollows(DataTable dataTable) {
		XtextFactory.get("InputFileFeatureFile").setComponent("xtext");
		XtextFactory.get("InputFileFeatureFile").setPath("src-gen-step-defs/daily batchjob/Input file.feature");
		XtextFactory.get("InputFileFeatureFile").assertInputOutputs(dataTable);
	}
}
