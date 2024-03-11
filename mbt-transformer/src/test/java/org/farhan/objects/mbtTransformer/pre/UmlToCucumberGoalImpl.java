package org.farhan.objects.mbtTransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtTransformer.UmlToCucumberGoal;

public class UmlToCucumberGoalImpl extends GoalObject implements UmlToCucumberGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertUMLToCucumber");
	}
}
