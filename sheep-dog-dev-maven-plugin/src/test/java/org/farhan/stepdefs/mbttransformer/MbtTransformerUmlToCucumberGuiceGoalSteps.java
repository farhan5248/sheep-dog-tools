package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;
import com.google.inject.Inject;

import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;

@ScenarioScoped
public class MbtTransformerUmlToCucumberGuiceGoalSteps extends TestSteps {

	@Inject
	public MbtTransformerUmlToCucumberGuiceGoalSteps(UmlToCucumberGuiceGoal object) {
		super(object);
	}

	@Given("^The mbt-transformer plugin, uml-to-cucumber-guice goal is executed$")
	public void theMbtTransformerPluginUmlToCucumberGuiceGoalIsExecuted() {
		object.setComponent("mbt-transformer");
		object.setPath("uml-to-cucumber-guice");
		object.transition();
	}

	@Given("^The mbt-transformer plugin, uml-to-cucumber-guice goal is executed with$")
	public void theMbtTransformerPluginUmlToCucumberGuiceGoalIsExecutedWith(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml-to-cucumber-guice");
		object.setInputOutputs(dataTable);
		object.transition();
	}
}
