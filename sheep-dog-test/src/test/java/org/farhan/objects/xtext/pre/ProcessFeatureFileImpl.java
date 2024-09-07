package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ProcessFeatureFile;

public class ProcessFeatureFileImpl extends TestObject implements ProcessFeatureFile {

	public void setStepsSnippetStepName(HashMap<String, String> keyMap) {
		getLA().setStepName(keyMap.get("Step Name"));
	}

	@Override
	public void setStepsSnippetHeaders(HashMap<String, String> keyMap) {
		getLA().setStepParameters(keyMap.get("Headers"));
	}

}
