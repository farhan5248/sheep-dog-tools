package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheObject1PageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The Object1 page is as follows.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheObject1PageIsAsFollowsGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheObject1PageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObject1PageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The Object1 page is as follows.graph");
        MbtTransformerFactory.get("GivenTheObject1PageIsAsFollowsGraphFile").setInputOutputs("Content", docString);
    }
}
