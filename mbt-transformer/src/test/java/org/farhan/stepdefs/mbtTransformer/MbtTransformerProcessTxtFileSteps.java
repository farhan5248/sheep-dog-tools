package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessTxtFileSteps {

    @Given("^The mbt-transformer plugin, target/Graphs/Process.txt file is as follows$")
    public void theMbtTransformerPluginTargetGraphsProcessTxtFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("MbtTransformerProcessTxtFile").setInputOutputs("Content", docString);
    }
}
