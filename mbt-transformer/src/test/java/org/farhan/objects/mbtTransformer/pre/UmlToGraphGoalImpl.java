package org.farhan.objects.mbtTransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtTransformer.UmlToGraphGoal;

public class UmlToGraphGoalImpl extends GoalObject implements UmlToGraphGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertUMLToGraph");
	}
}
