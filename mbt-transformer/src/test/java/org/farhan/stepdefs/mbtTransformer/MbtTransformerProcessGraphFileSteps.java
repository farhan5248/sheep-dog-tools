package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/Graphs/Process.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsProcessGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("target/Graphs/Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/Graphs/Process.graph file will be present$")
    public void theMbtTransformerPluginTargetGraphsProcessGraphFileWillBePresent() {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("target/Graphs/Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs("Present");
    }

    @Given("^The Process.graph file, Edges Graph Edges section will be as follows$")
    public void theProcessGraphFileEdgesGraphEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "EdgesGraphEdgesSection");
    }

    @Given("^The Process.graph file, Edges Graph Vertices section will be as follows$")
    public void theProcessGraphFileEdgesGraphVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "EdgesGraphVerticesSection");
    }

    @Given("^The Process.graph file, Edges section will be as follows$")
    public void theProcessGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "EdgesSection");
    }

    @Given("^The Process.graph file, Vertices section will be as follows$")
    public void theProcessGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "VerticesSection");
    }
}
