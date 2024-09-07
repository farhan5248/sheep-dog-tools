package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextDailyBatchjobFileSteps {

    @Given("^The src-gen-step-defs/daily batchjob file is present$")
    public void theSrcGenStepDefsDailyBatchjobFileIsPresent() {
        XtextFactory.get("DailyBatchjobFile").setComponent("xtext");
        XtextFactory.get("DailyBatchjobFile").setPath("src-gen-step-defs/daily batchjob");
        XtextFactory.get("DailyBatchjobFile").setInputOutputs("Present");
    }
}
