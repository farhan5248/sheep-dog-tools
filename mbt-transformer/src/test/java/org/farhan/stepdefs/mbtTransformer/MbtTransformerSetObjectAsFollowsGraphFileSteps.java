package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerSetObjectAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/Graphs/stepdefs/Set Object as follows.graph file will be present$")
    public void theMbtTransformerPluginTargetGraphsStepdefsSetObjectAsFollowsGraphFileWillBePresent() {
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").setPath("target/Graphs/stepdefs/Set Object as follows.graph");
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").assertInputOutputs("Present");
    }

    @Given("^The Set Object as follows.graph file, Edges section will be as follows$")
    public void theSetObjectAsFollowsGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").setPath("Set Object as follows.graph");
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").assertInputOutputs(dataTable, "EdgesSection");
    }

    @Given("^The Set Object as follows.graph file, Vertices section will be as follows$")
    public void theSetObjectAsFollowsGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").setPath("Set Object as follows.graph");
        MbtTransformerFactory.get("SetObjectAsFollowsGraphFile").assertInputOutputs(dataTable, "VerticesSection");
    }
}
