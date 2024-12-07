package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class CucumberToUmlGoalImpl extends GoalObject implements CucumberToUmlGoal {

	public void setTags(HashMap<String, String> keyMap) {
		attributes.put("tags", keyMap.get("Tags"));
	}

	@Override
	public void transition() {
		runGoalNew("org.farhan.mbt.convert.ConvertCucumberToUML");
	}

}
