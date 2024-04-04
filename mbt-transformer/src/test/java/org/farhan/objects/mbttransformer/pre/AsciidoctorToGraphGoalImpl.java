package org.farhan.objects.mbttransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.AsciidoctorToGraphGoal;

public class AsciidoctorToGraphGoalImpl extends GoalObject implements AsciidoctorToGraphGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertAsciiDoctorToGraph");
	}
}
