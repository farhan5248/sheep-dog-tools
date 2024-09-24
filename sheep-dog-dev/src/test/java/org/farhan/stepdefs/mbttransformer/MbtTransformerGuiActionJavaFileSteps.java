package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGuiActionJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acmetool/GuiAction.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmetoolGuiActionJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("GuiActionJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GuiActionJavaFile").setPath("src/test/java/org/farhan/objects/acmetool/GuiAction.java");
        MbtTransformerFactory.get("GuiActionJavaFile").assertInputOutputs("Content", docString);
    }
}
