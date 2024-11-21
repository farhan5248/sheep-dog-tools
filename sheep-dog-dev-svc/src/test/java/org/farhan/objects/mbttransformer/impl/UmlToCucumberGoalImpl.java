package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class UmlToCucumberGoalImpl extends RestService implements UmlToCucumberGoal {

	public void transition() {
		runGoal("umlToCucumber");
	}

	@Override
	public void setTags(HashMap<String, String> keyMap) {
		attributes.put("tags", keyMap.get("Tags"));
	}
}
