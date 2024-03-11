package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerWhenTheSearchApplicationHomePageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/When The Search application Home page is as follows.graph file will be as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsWhenTheSearchApplicationHomePageIsAsFollowsGraphFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/When The Search application Home page is as follows.graph");
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").assertInputOutputs("Content", docString);
    }
}
