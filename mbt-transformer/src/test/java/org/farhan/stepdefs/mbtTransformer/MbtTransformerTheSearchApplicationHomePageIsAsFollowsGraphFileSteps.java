package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerTheSearchApplicationHomePageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/Graphs/stepdefs/The Search application Home page is as follows.graph file will be as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsTheSearchApplicationHomePageIsAsFollowsGraphFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("TheSearchApplicationHomePageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("TheSearchApplicationHomePageIsAsFollowsGraphFile").setPath("target/Graphs/stepdefs/The Search application Home page is as follows.graph");
        MbtTransformerFactory.get("TheSearchApplicationHomePageIsAsFollowsGraphFile").assertInputOutputs("Content", docString);
    }
}
