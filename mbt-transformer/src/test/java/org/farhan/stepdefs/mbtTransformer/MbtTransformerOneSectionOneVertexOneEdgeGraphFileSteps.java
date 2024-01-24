package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import org.farhan.common.stepdefs.TestSteps;

public class MbtTransformerOneSectionOneVertexOneEdgeGraphFileSteps extends TestSteps {

    @Given("^The oneSectionOneVertexOneEdge graph file, Vertices section will be as follows$")
    public void theOneSectionOneVertexOneEdgeGraphFileVerticesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("MbtTransformerOneSectionOneVertexOneEdgeGraphFile").assertAttributes(dataTable, "Vertices");
    }

    @Given("^The oneSectionOneVertexOneEdge graph file, Edges section will be as follows$")
    public void theOneSectionOneVertexOneEdgeGraphFileEdgesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("MbtTransformerOneSectionOneVertexOneEdgeGraphFile").assertAttributes(dataTable, "Edges");
    }
}
