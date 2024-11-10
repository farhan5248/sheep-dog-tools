package org.farhan.objects.mbttransformer.impl;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class AsciidoctorToUmlGoalImpl extends GoalObject implements AsciidoctorToUmlGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.AsciiDoctorToUMLMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}
}
