package org.farhan.objects.mbttransformer.impl;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class UmlToAsciidoctorGoalImpl extends GoalObject implements UmlToAsciidoctorGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToAsciiDoctorMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		keyValue.put("tags", keyMap.get("Tags"));
	}
}
