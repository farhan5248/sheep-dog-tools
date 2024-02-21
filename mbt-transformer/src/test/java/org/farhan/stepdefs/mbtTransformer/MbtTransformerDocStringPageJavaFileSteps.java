package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerDocStringPageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DocStringPage.java file will be as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahDocStringPageJavaFileWillBeAsFollows(String docString) {
        MbtTransformerFactory.get("DocStringPageJavaFile").assertInputOutputs("Content", docString);
    }
}
