package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessGraphFileSteps {

    @Given("^The Process.graph file, Vertices section will be as follows$")
    public void theProcessGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("MbtTransformerProcessGraphFile").assertInputOutputs(dataTable, "Vertices");
    }

    @Given("^The Process.graph file, Edges section will be as follows$")
    public void theProcessGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("MbtTransformerProcessGraphFile").assertInputOutputs(dataTable, "Edges");
    }
}
