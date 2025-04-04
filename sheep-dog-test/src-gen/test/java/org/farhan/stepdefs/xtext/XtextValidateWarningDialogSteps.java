package org.farhan.stepdefs.xtext;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.xtext.ValidateWarningDialog;

@ScenarioScoped
public class XtextValidateWarningDialogSteps extends TestSteps {

    @Inject
    public XtextValidateWarningDialogSteps(ValidateWarningDialog object) {
        super(object);
    }

    @Given("^The xtext plugin, validate warning dialog will be set as follows$")
    public void theXtextPluginValidateWarningDialogWillBeSetAsFollows(DataTable dataTable) {
        object.setComponent("xtext");
        object.setPath("validate warning");
        object.assertInputOutputs(dataTable);
    }
}
