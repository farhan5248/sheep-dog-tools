package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGuiDialogJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acmetool/GuiDialog.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmetoolGuiDialogJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("GuiDialogJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GuiDialogJavaFile").setPath("src/test/java/org/farhan/objects/acmetool/GuiDialog.java");
        MbtTransformerFactory.get("GuiDialogJavaFile").assertInputOutputs("Content", docString);
    }
}
