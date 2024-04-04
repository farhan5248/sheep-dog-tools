package org.farhan.objects.mbttransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.GraphToUmlGoal;

public class GraphToUmlGoalImpl extends GoalObject implements GraphToUmlGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertGraphToUML");
	}
}
