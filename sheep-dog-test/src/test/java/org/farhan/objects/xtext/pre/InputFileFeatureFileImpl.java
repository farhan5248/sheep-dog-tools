package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.FeatureFileObject;
import org.farhan.common.LanguageAccessMock;
import org.farhan.objects.xtext.InputFileFeatureFile;
import org.junit.jupiter.api.Assertions;

public class InputFileFeatureFileImpl extends FeatureFileObject implements InputFileFeatureFile {

	@Override
	public void assertObjectName(HashMap<String, String> keyMap) {
		LanguageAccessMock la = new LanguageAccessMock(getStep());
		Assertions.assertEquals(keyMap.get("Object Name"), la.getStepObjectName());
	}

	@Override
	public void assertStepName(HashMap<String, String> keyMap) {
		// TODO this should be step definition name
		LanguageAccessMock la = new LanguageAccessMock(getStep());
		Assertions.assertEquals(keyMap.get("Step Name"), la.getStepDefinitionName());
	}
}
