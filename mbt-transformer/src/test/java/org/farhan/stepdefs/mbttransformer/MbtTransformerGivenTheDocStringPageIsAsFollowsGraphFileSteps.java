package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheDocStringPageIsAsFollowsGraphFileSteps {

    @Given("^The Given The DocString page is as follows.graph file, Edges section will be as follows$")
    public void theGivenTheDocStringPageIsAsFollowsGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setPath("Given The DocString page is as follows.graph");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").assertInputOutputs(dataTable, "EdgesSection");
    }

    @Given("^The Given The DocString page is as follows.graph file, Vertices section will be as follows$")
    public void theGivenTheDocStringPageIsAsFollowsGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setPath("Given The DocString page is as follows.graph");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").assertInputOutputs(dataTable, "VerticesSection");
    }

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheDocStringPageIsAsFollowsGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The DocString page is as follows.graph");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file will be present$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheDocStringPageIsAsFollowsGraphFileWillBePresent() {
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The DocString page is as follows.graph");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").assertInputOutputs("Present");
    }
}
