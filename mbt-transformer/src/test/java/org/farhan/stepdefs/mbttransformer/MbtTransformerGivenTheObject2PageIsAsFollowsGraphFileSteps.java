package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheObject2PageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The Object2 page is as follows.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheObject2PageIsAsFollowsGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheObject2PageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObject2PageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The Object2 page is as follows.graph");
        MbtTransformerFactory.get("GivenTheObject2PageIsAsFollowsGraphFile").setInputOutputs("Content", docString);
    }
}
