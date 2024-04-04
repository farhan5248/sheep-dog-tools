package org.farhan.objects.mbtmavenplugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtmavenplugin.CucumberToUmlGoal;

public class CucumberToUmlGoalImpl extends GoalObject implements CucumberToUmlGoal{

    public void transition() {
		runGoal("org.farhan.mbt.maven.CucumberToUMLMojo");
	}
}
