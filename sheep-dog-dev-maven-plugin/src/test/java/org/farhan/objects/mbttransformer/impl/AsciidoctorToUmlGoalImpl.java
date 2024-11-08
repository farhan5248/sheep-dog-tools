package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;

import io.cucumber.guice.ScenarioScoped;
@ScenarioScoped
public class AsciidoctorToUmlGoalImpl extends GoalObject implements AsciidoctorToUmlGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.AsciiDoctorToUMLMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}
}
