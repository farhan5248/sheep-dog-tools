package org.farhan.objects.mbttransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;

public class AsciidoctorToUmlGoalImpl extends GoalObject implements AsciidoctorToUmlGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertAsciidoctorToUML");
	}
}
