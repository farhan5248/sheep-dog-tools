package org.farhan.objects.mbttransformer.impl;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;

public class UmlToCucumberGoalImpl extends RestService implements UmlToCucumberGoal {

	public void transition() {
		sendPostRequest("umlToCucumberMojo", "");
	}
}
