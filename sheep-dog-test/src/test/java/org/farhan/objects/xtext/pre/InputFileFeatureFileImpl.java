package org.farhan.objects.xtext.pre;

import java.util.ArrayList;
import java.util.HashMap;

import org.farhan.common.EclipseMock;
import org.farhan.common.TestObject;
import org.farhan.common.Utilities;
import org.farhan.objects.xtext.InputFileFeatureFile;
import org.junit.jupiter.api.Assertions;

public class InputFileFeatureFileImpl extends TestObject implements InputFileFeatureFile {

	@Override
	public void assertObjectName(HashMap<String, String> keyMap) {
		try {
			Assertions.assertNotNull(getLA().getStepObject(getSpecial("Object Name")));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void assertParameters(HashMap<String, String> keyMap) {
		try {
			getLA().createStepObject(keyMap.get("Object Name"));
			getLA().createStepDefinition(getSpecial(keyMap.get("Step Definition Name")));
			Assertions.assertTrue(getLA().getStepDefinitionParameters(getSpecial(keyMap.get("Step Definition Name"))).toString()
					.contains("[" + keyMap.get("Parameters") + "]"));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}

	}

	@Override
	public void assertStepDefinitionName(HashMap<String, String> keyMap) {
		try {
			Object stepObject = getLA().getStepObject(keyMap.get("Object Name"));
			Assertions.assertNotNull(stepObject);
			for (Object stepDef : getLA().getStepDefinitions(stepObject)) {
				if (getLA().getStepDefinitionName((Object) stepDef).contentEquals(getSpecial(keyMap.get("Step Definition Name")))) {
					return;
				}
			}
			Assertions.fail("No step defintion found");
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void setObjectName(HashMap<String, String> keyMap) {
		try {
			getLA().createStepObject(keyMap.get("Object Name"));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void setParameters(HashMap<String, String> keyMap) {
		try {
			getLA().createStepObject(keyMap.get("Object Name"));
			ArrayList<ArrayList<String>> stepDefinitionList = (ArrayList<ArrayList<String>>) getLA()
					.createStepDefinition(getSpecial(keyMap.get("Step Definition Name")));
			ArrayList<String> parameters = new ArrayList<String>();
			parameters.add(keyMap.get("Parameters"));
			stepDefinitionList.add(parameters);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void setStepDefinitionName(HashMap<String, String> keyMap) {
		try {
			getLA().createStepObject(keyMap.get("Object Name"));
			getLA().createStepDefinition(getSpecial(keyMap.get("Step Definition Name")));
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}
}
