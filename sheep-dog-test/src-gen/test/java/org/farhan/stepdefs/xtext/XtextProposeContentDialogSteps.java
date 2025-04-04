package org.farhan.stepdefs.xtext;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.xtext.ProposeContentDialog;

@ScenarioScoped
public class XtextProposeContentDialogSteps extends TestSteps {

    @Inject
    public XtextProposeContentDialogSteps(ProposeContentDialog object) {
        super(object);
    }

    @Given("^The xtext plugin, propose content dialog will be empty$")
    public void theXtextPluginProposeContentDialogWillBeEmpty() {
        object.setComponent("xtext");
        object.setPath("propose content");
        object.assertInputOutputs("Empty");
    }

    @Given("^The xtext plugin, propose content dialog will be set as follows$")
    public void theXtextPluginProposeContentDialogWillBeSetAsFollows(DataTable dataTable) {
        object.setComponent("xtext");
        object.setPath("propose content");
        object.assertInputOutputs(dataTable);
    }
}
