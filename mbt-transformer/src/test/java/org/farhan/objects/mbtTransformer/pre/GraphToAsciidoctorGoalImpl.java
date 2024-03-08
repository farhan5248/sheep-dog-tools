package org.farhan.objects.mbtTransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtTransformer.GraphToAsciidoctorGoal;

public class GraphToAsciidoctorGoalImpl extends GoalObject implements GraphToAsciidoctorGoal {

	public void transition() {
		runGoal("org.farhan.mbt.asciidoctorgraph.ConvertGraphToAsciiDoctor");
	}
}
