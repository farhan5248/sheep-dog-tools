package org.farhan.stepdefs.xtext;

import org.farhan.common.XtextFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class XtextGenerationActionSteps {

    @Given("^The generation action is performed$")
    public void theGenerationActionIsPerformed() {
        XtextFactory.get("GenerationAction").setComponent("xtext");
        XtextFactory.get("GenerationAction").setPath("generation");
        XtextFactory.get("GenerationAction").transition();
    }
}
