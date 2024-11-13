package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class UmlToCucumberGoalGuiceImpl extends GoalObject implements UmlToCucumberGuiceGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToCucumberGuiceMojo");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		attributes.put("tags", keyMap.get("Tags"));
	}
}
