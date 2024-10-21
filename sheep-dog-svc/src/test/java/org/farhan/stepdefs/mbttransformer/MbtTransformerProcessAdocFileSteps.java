package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessAdocFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.adoc file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAdocFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/app/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.adoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAdocFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAdocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAdocFile").setPath("src/test/resources/asciidoc/app/Process.adoc");
        MbtTransformerFactory.get("ProcessAdocFile").setInputOutputs("Content", docString);
    }
}
