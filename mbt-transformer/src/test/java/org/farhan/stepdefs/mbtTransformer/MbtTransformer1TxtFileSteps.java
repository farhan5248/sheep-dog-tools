package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformer1TxtFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/resources/1.txt file will be as follows$")
    public void theMbtTransformerPluginTargetGraphsResources1TxtFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("1TxtFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("1TxtFile").setPath("target/graphs/resources/1.txt");
        MbtTransformerFactory.get("1TxtFile").assertInputOutputs("Content", docString);
    }
}
