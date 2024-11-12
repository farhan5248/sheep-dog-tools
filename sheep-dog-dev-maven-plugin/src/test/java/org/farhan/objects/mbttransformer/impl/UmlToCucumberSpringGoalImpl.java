package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;

import io.cucumber.guice.ScenarioScoped;
@ScenarioScoped
public class UmlToCucumberSpringGoalImpl extends GoalObject implements UmlToCucumberSpringGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToCucumberSpringMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}
}
