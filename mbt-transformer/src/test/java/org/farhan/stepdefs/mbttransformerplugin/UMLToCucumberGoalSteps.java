package org.farhan.stepdefs.mbttransformerplugin;

import org.farhan.objects.mbttransformerplugin.MBTTransformerPluginFactory;
import org.farhan.objects.mbttransformerplugin.UMLToCucumberGoal;
import org.farhan.stepdefs.common.GoalSteps;

import io.cucumber.java.en.And;

public class UMLToCucumberGoalSteps extends GoalSteps {

	@And("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
	public void TheMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
		UMLToCucumberGoal o = (UMLToCucumberGoal) MBTTransformerPluginFactory.get("UmlToCucumberGoal");
		o.execute();
	}
}
