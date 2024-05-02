package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerWhenTheSearchApplicationHomePageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/When The Search application Home page is as follows.graph file will be present$")
    public void theMbtTransformerPluginTargetGraphsStepdefsWhenTheSearchApplicationHomePageIsAsFollowsGraphFileWillBePresent() {
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/When The Search application Home page is as follows.graph");
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").assertInputOutputs("Present");
    }

    @Given("^The When The Search application Home page is as follows.graph file, Edges section will be as follows$")
    public void theWhenTheSearchApplicationHomePageIsAsFollowsGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").setPath("When The Search application Home page is as follows.graph");
        MbtTransformerFactory.get("WhenTheSearchApplicationHomePageIsAsFollowsGraphFile").assertInputOutputs(dataTable, "EdgesSection");
    }
}
