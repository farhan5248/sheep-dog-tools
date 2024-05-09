package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheObjectPageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheObjectPageIsAsFollowsGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The Object page is as follows.graph");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheObjectPageIsAsFollowsGraphFileWillBePresent() {
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The Object page is as follows.graph");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").assertInputOutputs("Present");
    }

    @Given("^The Given The Object page is as follows.graph file, Vertices section will be as follows$")
    public void theGivenTheObjectPageIsAsFollowsGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setPath("Given The Object page is as follows.graph");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").assertInputOutputs(dataTable, "VerticesSection");
    }

    @Given("^The Given The Object page is as follows.graph file, Edges section will be as follows$")
    public void theGivenTheObjectPageIsAsFollowsGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").setPath("Given The Object page is as follows.graph");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollowsGraphFile").assertInputOutputs(dataTable, "EdgesSection");
    }
}
