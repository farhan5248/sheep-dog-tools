package org.farhan.objects.mbttransformer.impl;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;

public class AsciidoctorToUmlGoalImpl extends RestService implements AsciidoctorToUmlGoal {

	public void transition() {
		runGoal("asciiDoctorToUMLMojo");
	}
}
