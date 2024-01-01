package org.farhan.stepdefs.claim;

import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;
import org.farhan.common.objects.ClaimFactory;
import io.cucumber.datatable.DataTable;

public class ClaimProcessFeatureFileSteps extends TestSteps {

    @Given("^The claim project, src/test/resources/Cucumber/dept/process.feature file is as follows$")
    public void theClaimProjectSrcTestResourcesCucumberDeptProcessFeatureFileIsAsFollows(String docString) {
        ClaimFactory.get("ClaimProcessFeatureFile").setAttributes(docString);
    }
}
