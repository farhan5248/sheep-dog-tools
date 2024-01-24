package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import org.farhan.common.stepdefs.TestSteps;

public class MbtTransformerOneSectionOneVertexOneEdgeAdocFileSteps extends TestSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/AsciiDoc/oneSectionOneVertexOneEdge.adoc file is as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciiDocOneSectionOneVertexOneEdgeAdocFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("MbtTransformerOneSectionOneVertexOneEdgeAdocFile").setAttributes(docString);
    }
}
