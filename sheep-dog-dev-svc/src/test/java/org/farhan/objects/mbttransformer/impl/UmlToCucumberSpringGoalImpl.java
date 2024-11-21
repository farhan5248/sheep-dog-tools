package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class UmlToCucumberSpringGoalImpl extends RestService implements UmlToCucumberSpringGoal {

	public void transition() {
		runGoal("umlToCucumberSpring");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		attributes.put("tags", keyMap.get("Tags"));
	}
}
