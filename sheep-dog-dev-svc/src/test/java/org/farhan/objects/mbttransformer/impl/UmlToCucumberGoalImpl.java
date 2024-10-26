package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;

public class UmlToCucumberGoalImpl extends RestService implements UmlToCucumberGoal {

	public void transition() {
		runGoal("umlToCucumberMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}
}
