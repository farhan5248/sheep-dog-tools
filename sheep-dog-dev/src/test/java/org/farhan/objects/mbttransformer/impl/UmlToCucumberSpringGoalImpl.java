package org.farhan.objects.mbttransformer.impl;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class UmlToCucumberSpringGoalImpl extends GoalObject implements UmlToCucumberSpringGoal {

	@Override
	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertUMLToCucumberSpring");
	}
}
