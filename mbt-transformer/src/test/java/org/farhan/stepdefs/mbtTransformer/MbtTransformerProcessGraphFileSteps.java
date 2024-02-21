package org.farhan.stepdefs.mbtTransformer;

import io.cucumber.java.en.Given;

import org.farhan.common.MbtTransformerFactory;

import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessGraphFileSteps {

	@Given("^The mbt-transformer plugin, target/Graphs/Process.graph file is as follows$")
	public void theMbtTransformerPluginTargetGraphsProcessGraphFileIsAsFollows(String docString) {
		MbtTransformerFactory.get("MbtTransformerProcessGraphFile").setInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, target/Graphs/Process.graph file will be present$")
	public void theMbtTransformerPluginTargetGraphsProcessGraphFileWillBePresent() {
		MbtTransformerFactory.get("MbtTransformerProcessGraphFile").assertInputOutputs("Present");
	}

	@Given("^The Process.graph file, Vertices section will be as follows$")
	public void theProcessGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerProcessGraphFile").assertInputOutputs(dataTable, "Vertices");
	}

	@Given("^The Process.graph file, Edges section will be as follows$")
	public void theProcessGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerProcessGraphFile").assertInputOutputs(dataTable, "Edges");
	}

	@Given("^The Process.graph file, Edges Graph Vertices section will be as follows$")
	public void theProcessGraphFileEdgesGraphVerticesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerProcessGraphFile").assertInputOutputs(dataTable,
				"Edges Graph Vertices");
	}

	@Given("^The Process.graph file, Edges Graph Edges section will be as follows$")
	public void theProcessGraphFileEdgesGraphEdgesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerProcessGraphFile").assertInputOutputs(dataTable, "Edges Graph Edges");
	}
}
