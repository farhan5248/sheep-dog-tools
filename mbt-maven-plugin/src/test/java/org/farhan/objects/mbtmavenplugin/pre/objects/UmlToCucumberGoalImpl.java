package org.farhan.objects.mbtmavenplugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtmavenplugin.UmlToCucumberGoal;

public class UmlToCucumberGoalImpl extends GoalObject implements UmlToCucumberGoal{

    public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToCucumberMojo");
	}
}
