package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;

public class AsciidoctorToUmlGoalImpl extends RestService implements AsciidoctorToUmlGoal {

	public void transition() {
		runGoal("asciiDoctorToUMLMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}
}
