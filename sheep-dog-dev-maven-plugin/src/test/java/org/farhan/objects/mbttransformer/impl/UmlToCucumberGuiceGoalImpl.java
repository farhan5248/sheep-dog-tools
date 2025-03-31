package org.farhan.objects.mbttransformer.impl;

import org.farhan.common.Config;
import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class UmlToCucumberGuiceGoalImpl extends GoalObject implements UmlToCucumberGuiceGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToCucumberGuiceMojo", Config.getWorkingDir() + "code-prj/",
				Config.getWorkingDir() + "spec-prj/");
	}

}
