package org.farhan.stepdefs.xtext;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.xtext.ValidateErrorAction;

@ScenarioScoped
public class XtextValidateErrorActionSteps extends TestSteps {

    @Inject
    public XtextValidateErrorActionSteps(ValidateErrorAction object) {
        super(object);
    }

    @Given("^The xtext plugin, validate error action is performed as follows$")
    public void theXtextPluginValidateErrorActionIsPerformedAsFollows(DataTable dataTable) {
        object.setComponent("xtext");
        object.setPath("validate error");
        object.setInputOutputs(dataTable);
        object.transition();
    }
}
