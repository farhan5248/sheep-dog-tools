package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGuiDialogJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/acmetool/GuiDialog.java file will be created as follows$")
    public void theSrcTestJavaOrgFarhanObjectsAcmetoolGuiDialogJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("GuiDialogJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GuiDialogJavaFile").setPath("src/test/java/org/farhan/objects/acmetool/GuiDialog.java");
        MbtTransformerFactory.get("GuiDialogJavaFile").assertInputOutputs("Content", docString);
    }
}
