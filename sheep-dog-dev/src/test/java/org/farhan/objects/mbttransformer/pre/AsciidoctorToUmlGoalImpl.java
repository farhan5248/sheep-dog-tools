package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;

public class AsciidoctorToUmlGoalImpl extends GoalObject implements AsciidoctorToUmlGoal {

	public void setTags(HashMap<String, String> keyMap) {
		this.tags = keyMap.get("Tags");
	}

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertAsciidoctorToUML");
	}
}
