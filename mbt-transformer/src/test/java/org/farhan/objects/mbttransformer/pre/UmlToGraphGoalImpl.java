package org.farhan.objects.mbttransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToGraphGoal;

public class UmlToGraphGoalImpl extends GoalObject implements UmlToGraphGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertUMLToGraph");
	}
}
