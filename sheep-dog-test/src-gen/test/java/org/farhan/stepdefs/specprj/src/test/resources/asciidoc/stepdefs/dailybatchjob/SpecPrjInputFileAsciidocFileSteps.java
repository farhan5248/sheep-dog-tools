package org.farhan.stepdefs.specprj.src.test.resources.asciidoc.stepdefs.dailybatchjob;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.src.test.resources.asciidoc.stepdefs.dailybatchjob.InputFileAsciidocFile;

@ScenarioScoped
public class SpecPrjInputFileAsciidocFileSteps extends TestSteps {

    @Inject
    public SpecPrjInputFileAsciidocFileSteps(InputFileAsciidocFile object) {
        super(object);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsDailyBatchjobInputFileAsciidocFileIsCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc");
        object.setInputOutputs(dataTable);
    }

    @Given("^The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file will be created as follows$")
    public void theSpecPrjProjectSrcTestResourcesAsciidocStepdefsDailyBatchjobInputFileAsciidocFileWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc");
        object.assertInputOutputs(dataTable);
    }
}
