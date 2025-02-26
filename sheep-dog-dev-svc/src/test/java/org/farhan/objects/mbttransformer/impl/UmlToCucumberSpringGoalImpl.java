package org.farhan.objects.mbttransformer.impl;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class UmlToCucumberSpringGoalImpl extends GoalObject implements UmlToCucumberSpringGoal {

	public void transition() {
		runGoal("ConvertUMLToCucumberSpring");
	}
}
