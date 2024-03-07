package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/Graphs/specs/Process.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsSpecsProcessGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("target/Graphs/specs/Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/Graphs/specs/Process.graph file will be present$")
    public void theMbtTransformerPluginTargetGraphsSpecsProcessGraphFileWillBePresent() {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("target/Graphs/specs/Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs("Present");
    }

    @Given("^The Process.graph file, Edges section will be as follows$")
    public void theProcessGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "EdgesSection");
    }

    @Given("^The Process.graph file, Graph section will be as follows$")
    public void theProcessGraphFileGraphSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "GraphSection");
    }

    @Given("^The Process.graph file, Paths section will be as follows$")
    public void theProcessGraphFilePathsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "PathsSection");
    }

    @Given("^The Process.graph file, Vertices section will be as follows$")
    public void theProcessGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("ProcessGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessGraphFile").setPath("Process.graph");
        MbtTransformerFactory.get("ProcessGraphFile").assertInputOutputs(dataTable, "VerticesSection");
    }
}
