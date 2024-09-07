package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.FeatureFileObject;
import org.farhan.objects.xtext.ProcessFeatureFile;

public class ProcessFeatureFileImpl extends FeatureFileObject implements ProcessFeatureFile {

	public void setStepsSnippetStepName(HashMap<String, String> keyMap) {
		getLanguageAccess().setStepName(keyMap.get("Step Name"));
	}

	@Override
	public void setStepsSnippetHeaders(HashMap<String, String> keyMap) {
		getLanguageAccess().setStepHeaders(keyMap.get("Headers"));
	}

}
