package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;

public class UmlToCucumberGoalImpl extends GoalObject implements UmlToCucumberGoal {

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertUMLToCucumber");
	}
}
