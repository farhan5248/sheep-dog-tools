package org.farhan.objects.mbtTransformer.impl;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtTransformer.AsciidoctorToGraphGoal;

public class AsciidoctorToGraphGoalImpl extends GoalObject implements AsciidoctorToGraphGoal {

	public void transition() {
		runGoal("org.farhan.mbt.asciidoctorgraph.ConvertAsciiDoctorToGraph");
	}
}
