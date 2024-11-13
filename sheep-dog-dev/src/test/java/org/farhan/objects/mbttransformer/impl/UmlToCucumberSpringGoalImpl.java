package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class UmlToCucumberSpringGoalImpl extends GoalObject implements UmlToCucumberSpringGoal {

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		attributes.put("tags", keyMap.get("Tags"));
	}

	@Override
	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertUMLToCucumberSpring");
	}
}
