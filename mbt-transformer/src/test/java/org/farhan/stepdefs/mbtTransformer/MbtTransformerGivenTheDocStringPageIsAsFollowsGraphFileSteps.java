package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheDocStringPageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheDocStringPageIsAsFollowsGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The DocString page is as follows.graph");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file will be as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheDocStringPageIsAsFollowsGraphFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The DocString page is as follows.graph");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollowsGraphFile").assertInputOutputs("Content", docString);
    }
}
