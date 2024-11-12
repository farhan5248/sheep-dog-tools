package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerUmlToCucumberSpringGoalSteps extends TestSteps {

    @Inject
    public MbtTransformerUmlToCucumberSpringGoalSteps(UmlToCucumberSpringGoal object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber-spring goal is executed$")
    public void theMbtTransformerPluginUmlToCucumberSpringGoalIsExecuted() {
        object.setComponent("mbt-transformer");
        object.setPath("uml-to-cucumber-spring");
        object.transition();
    }

    @Given("^The mbt-transformer plugin, uml-to-cucumber-spring goal is executed with$")
    public void theMbtTransformerPluginUmlToCucumberSpringGoalIsExecutedWith(DataTable dataTable) {
    	object.setComponent("mbt-transformer");
    	object.setPath("uml-to-cucumber-spring");
    	object.setInputOutputs(dataTable);
    	object.transition();
    }
}
