package org.farhan.stepdefs.blah;

import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import org.farhan.common.BlahFactory;

public class BlahObjectPageSteps {

    @Given("^The blah application, something/Object page is empty$")
    public void theBlahApplicationSomethingObjectPageIsEmpty() {
        BlahFactory.get("ObjectPage").setComponent("blah");
        BlahFactory.get("ObjectPage").setPath("something/Object");
        BlahFactory.get("ObjectPage").setInputOutputs("Empty");
    }

    @Given("^The blah application, something/Object page is created as follows$")
    public void theBlahApplicationSomethingObjectPageIsCreatedAsFollows(String docString) {
        BlahFactory.get("ObjectPage").setComponent("blah");
        BlahFactory.get("ObjectPage").setPath("something/Object");
        BlahFactory.get("ObjectPage").setInputOutputs("Content", docString);
    }
}
