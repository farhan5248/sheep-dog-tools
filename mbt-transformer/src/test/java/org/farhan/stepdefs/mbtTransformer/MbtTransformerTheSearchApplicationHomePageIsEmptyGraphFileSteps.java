package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerTheSearchApplicationHomePageIsEmptyGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/Graphs/stepdefs/The Search application Home page is empty.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsTheSearchApplicationHomePageIsEmptyGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("TheSearchApplicationHomePageIsEmptyGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("TheSearchApplicationHomePageIsEmptyGraphFile").setPath("target/Graphs/stepdefs/The Search application Home page is empty.graph");
        MbtTransformerFactory.get("TheSearchApplicationHomePageIsEmptyGraphFile").setInputOutputs("Content", docString);
    }
}
