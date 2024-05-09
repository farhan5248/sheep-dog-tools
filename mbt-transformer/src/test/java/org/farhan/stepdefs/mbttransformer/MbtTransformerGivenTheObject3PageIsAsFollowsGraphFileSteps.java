package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheObject3PageIsAsFollowsGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/stepdefs/Given The Object3 page is as follows.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheObject3PageIsAsFollowsGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheObject3PageIsAsFollowsGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObject3PageIsAsFollowsGraphFile").setPath("target/graphs/stepdefs/Given The Object3 page is as follows.graph");
        MbtTransformerFactory.get("GivenTheObject3PageIsAsFollowsGraphFile").setInputOutputs("Content", docString);
    }
}
