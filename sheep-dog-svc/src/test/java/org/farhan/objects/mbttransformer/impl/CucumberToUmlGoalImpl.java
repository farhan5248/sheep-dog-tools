package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;

public class CucumberToUmlGoalImpl extends RestService implements CucumberToUmlGoal {

	public void setTags(HashMap<String, String> keyMap) {
		addParamter("tags", keyMap.get("Tags"));
	}

	@Override
	public void transition() {
		sendPostRequest("cucumberToUMLMojo", "");
	}
}
