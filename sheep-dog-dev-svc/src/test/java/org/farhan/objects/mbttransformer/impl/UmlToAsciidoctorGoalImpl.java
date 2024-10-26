package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;

public class UmlToAsciidoctorGoalImpl extends RestService implements UmlToAsciidoctorGoal {

	public void transition() {
		runGoal("umlToAsciiDoctorMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}
}
