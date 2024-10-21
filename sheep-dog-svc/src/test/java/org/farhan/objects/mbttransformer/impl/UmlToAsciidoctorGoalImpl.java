package org.farhan.objects.mbttransformer.impl;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;

public class UmlToAsciidoctorGoalImpl extends RestService implements UmlToAsciidoctorGoal {

	public void transition() {
		sendPostRequest("umlToAsciiDoctorMojo", "");
	}
}
