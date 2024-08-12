package org.farhan.objects.mbttransformer.pre;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;

public class UmlToAsciidoctorGoalImpl extends GoalObject implements UmlToAsciidoctorGoal {

	public void transition() {
		runGoal("org.farhan.mbt.convert.ConvertUMLToAsciidoctor");
	}
}
