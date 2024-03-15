package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheDocStringPageIsAsFollows0TxtFileSteps {

    @Given("^The mbt-transformer plugin, target/graphs/resources/Given The DocString page is as follows-0.txt file is as follows$")
    public void theMbtTransformerPluginTargetGraphsResourcesGivenTheDocStringPageIsAsFollows0TxtFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollows0TxtFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollows0TxtFile").setPath("target/graphs/resources/Given The DocString page is as follows-0.txt");
        MbtTransformerFactory.get("GivenTheDocStringPageIsAsFollows0TxtFile").setInputOutputs("Content", docString);
    }
}
