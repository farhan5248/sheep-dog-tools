package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheObjectPageIsAsFollows0TxtFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/resources/Given The Object page is as follows-0.txt file is as follows$")
    public void theMbtTransformerPluginTargetGraphsResourcesGivenTheObjectPageIsAsFollows0TxtFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollows0TxtFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollows0TxtFile").setPath("target/graphs/resources/Given The Object page is as follows-0.txt");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollows0TxtFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, target/graphs/resources/Given The Object page is as follows-0.txt file will be as follows$")
    public void theMbtTransformerPluginTargetGraphsResourcesGivenTheObjectPageIsAsFollows0TxtFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollows0TxtFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollows0TxtFile").setPath("target/graphs/resources/Given The Object page is as follows-0.txt");
        MbtTransformerFactory.get("GivenTheObjectPageIsAsFollows0TxtFile").assertInputOutputs("Content", docString);
    }
}
