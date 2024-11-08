package org.farhan.objects.xtext.impl;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ProcessFeatureFile;

import io.cucumber.guice.ScenarioScoped;
@ScenarioScoped
public class ProcessFeatureFileImpl extends TestObject implements ProcessFeatureFile {

	public void setStepsSnippetStepName(HashMap<String, String> keyMap) {
		getEclipseMock().addStep(getSpecial(keyMap.get("Step Name")));
	}

	@Override
	public void setStepsSnippetHeaders(HashMap<String, String> keyMap) {
		getEclipseMock().setStepParameters(keyMap.get("Headers"));
	}

	@Override
	public void setBackgroundstepsSnippetStepName(HashMap<String, String> keyMap) {
		getEclipseMock().addBackgroundStep(getSpecial(keyMap.get("Step Name")));
	}

}
