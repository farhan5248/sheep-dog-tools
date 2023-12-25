package org.farhan.stepdefs.mbttransformerplugin;

import org.farhan.common.stepdefs.GoalSteps;
import org.farhan.objects.mbttransformerplugin.MBTTransformerPluginFactory;
import org.farhan.objects.mbttransformerplugin.UMLToCucumberGoal;

import io.cucumber.java.en.And;

public class UMLToCucumberGoalSteps extends GoalSteps {

	@And("^The mbt-transformer plugin, uml-to-cucumber goal is executed$")
	public void TheMbtTransformerPluginUmlToCucumberGoalIsExecuted() {
		UMLToCucumberGoal o = (UMLToCucumberGoal) MBTTransformerPluginFactory.get("UmlToCucumberGoal");
		o.execute();
	}
}
