package org.farhan.stepdefs.specprj.src.test.resources.asciidoc.stepdefs.dailybatchjob.app;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.src.test.resources.asciidoc.stepdefs.dailybatchjob.app.InputFileAsciidocFile;

@ScenarioScoped
public class SpecPrjInputFileAsciidocFileSteps extends TestSteps {

    @Inject
    public SpecPrjInputFileAsciidocFileSteps(InputFileAsciidocFile object) {
        super(object);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/app/Input file.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsDailyBatchjobAppInputFileAsciidocFileIsCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/daily batchjob/app/Input file.asciidoc");
        object.setInputOutputs(dataTable);
    }
}
