package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;

import io.cucumber.guice.ScenarioScoped;
@ScenarioScoped
public class AsciidoctorToUmlGoalImpl extends GoalObject implements AsciidoctorToUmlGoal {

	public void setTags(HashMap<String, String> keyMap) {
		attributes.put("tags", keyMap.get("Tags"));
	}

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertAsciidoctorToUML");
	}
}