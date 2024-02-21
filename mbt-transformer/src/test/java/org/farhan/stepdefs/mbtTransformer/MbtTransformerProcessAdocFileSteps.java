package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessAdocFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciiDocProcessAdocFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAdocFile").setInputOutputs("Content", docString);
    }
}
