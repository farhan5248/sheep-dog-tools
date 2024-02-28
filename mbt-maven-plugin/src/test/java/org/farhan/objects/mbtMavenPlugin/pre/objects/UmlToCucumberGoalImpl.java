package org.farhan.objects.mbtMavenPlugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtMavenPlugin.UmlToCucumberGoal;

public class UmlToCucumberGoalImpl extends GoalObject implements UmlToCucumberGoal{

    public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToCucumberMojo");
	}
}
