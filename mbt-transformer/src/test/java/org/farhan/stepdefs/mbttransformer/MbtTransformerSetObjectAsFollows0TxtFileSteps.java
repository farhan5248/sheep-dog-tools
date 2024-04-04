package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerSetObjectAsFollows0TxtFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/resources/Set Object as follows-0.txt file will be as follows$")
    public void theMbtTransformerPluginTargetGraphsResourcesSetObjectAsFollows0TxtFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("SetObjectAsFollows0TxtFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("SetObjectAsFollows0TxtFile").setPath("target/graphs/resources/Set Object as follows-0.txt");
        MbtTransformerFactory.get("SetObjectAsFollows0TxtFile").assertInputOutputs("Content", docString);
    }
}
