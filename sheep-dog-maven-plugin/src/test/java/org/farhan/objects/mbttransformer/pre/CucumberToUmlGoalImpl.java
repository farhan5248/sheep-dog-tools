package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;

public class CucumberToUmlGoalImpl extends GoalObject implements CucumberToUmlGoal {

	public void setTags(HashMap<String, String> keyMap) {
		this.tags = keyMap.get("Tags");
	}

	@Override
	public void transition() {
		runGoal("org.farhan.mbt.maven.CucumberToUMLMojo");
	}

}
