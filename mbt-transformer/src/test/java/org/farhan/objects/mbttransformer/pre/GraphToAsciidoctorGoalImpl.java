package org.farhan.objects.mbttransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.GraphToAsciidoctorGoal;

public class GraphToAsciidoctorGoalImpl extends GoalObject implements GraphToAsciidoctorGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertGraphToAsciiDoctor");
	}
}
