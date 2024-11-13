package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;

import io.cucumber.guice.ScenarioScoped;
@ScenarioScoped
public class UmlToCucumberGuiceGoalImpl extends GoalObject implements UmlToCucumberGuiceGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToCucumberGuiceMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		attributes.put("tags", keyMap.get("Tags"));
	}
}
