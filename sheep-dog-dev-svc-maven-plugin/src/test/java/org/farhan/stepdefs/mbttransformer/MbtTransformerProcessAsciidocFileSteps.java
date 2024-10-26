package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerProcessAsciidocFileSteps {

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").assertInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocAppProcessAsciidocFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("src/test/resources/asciidoc/app/Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").setInputOutputs("Content", docString);
    }

    @Given("^The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows$")
    public void theMbtTransformerPluginSrcTestResourcesAsciidocProcessAsciidocFileIsCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("ProcessAsciidocFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("ProcessAsciidocFile").setPath("src/test/resources/asciidoc/Process.asciidoc");
        MbtTransformerFactory.get("ProcessAsciidocFile").setInputOutputs("Content", docString);
    }
}
