package org.farhan.objects.mbttransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;

public class UmlToCucumberGoalImpl extends GoalObject implements UmlToCucumberGoal {

	public void transition() {
		runGoal("org.farhan.mbt.maven.UMLToCucumberMojo");
	}
}
