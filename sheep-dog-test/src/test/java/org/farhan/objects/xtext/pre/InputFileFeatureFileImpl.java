package org.farhan.objects.xtext.pre;

import java.util.ArrayList;
import java.util.HashMap;

import org.farhan.common.FeatureFileObject;
import org.farhan.common.LanguageAccessMock;
import org.farhan.common.Utilities;
import org.farhan.objects.xtext.InputFileFeatureFile;
import org.junit.jupiter.api.Assertions;

public class InputFileFeatureFileImpl extends FeatureFileObject implements InputFileFeatureFile {

	@Override
	public void assertObjectName(HashMap<String, String> keyMap) {
		Assertions.assertEquals(keyMap.get("Object Name"), getLanguageAccess().getStepObjectName());
	}

	@Override
	public void assertStepName(HashMap<String, String> keyMap) {
		// TODO this should be step definition name
		Assertions.assertEquals(keyMap.get("Step Name"), getLanguageAccess().getStepDefinitionName());
	}

	@Override
	public void setObjectName(HashMap<String, String> keyMap) {
		try {
			getLanguageAccess().getOrCreateStepObject(keyMap.get("Object Name"));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void setStepName(HashMap<String, String> keyMap) {
		// TODO rename to StepDefinitionName
		try {
			LanguageAccessMock la = getLanguageAccess();
			la.getOrCreateStepObject(keyMap.get("Object Name"));
			la.createStepDefinition(keyMap.get("Step Name"));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void setParameters(HashMap<String, String> keyMap) {
		try {
			LanguageAccessMock la = getLanguageAccess();
			la.getOrCreateStepObject(keyMap.get("Object Name"));
			ArrayList<ArrayList<String>> stepDefinitionList = (ArrayList<ArrayList<String>>) la
					.createStepDefinition(keyMap.get("Step Name"));
			ArrayList<String> parameters = new ArrayList<String>();
			parameters.add(keyMap.get("Parameters"));
			stepDefinitionList.add(parameters);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void assertParameters(HashMap<String, String> keyMap) {
		try {
			LanguageAccessMock la = getLanguageAccess();
			la.getOrCreateStepObject(keyMap.get("Object Name"));
			la.createStepDefinition(keyMap.get("Step Name"));
			Assertions.assertTrue(la.getParameters(keyMap.get("Step Name")).toString()
					.contains("[" + keyMap.get("Parameters") + "]"));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}

	}
}
