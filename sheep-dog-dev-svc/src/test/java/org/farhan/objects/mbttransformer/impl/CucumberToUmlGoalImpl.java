package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;

public class CucumberToUmlGoalImpl extends RestService implements CucumberToUmlGoal {

	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}

	@Override
	public void transition() {
		runGoal("cucumberToUMLMojo");
	}
}
