package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ScenarioValidationDialog;
import org.junit.jupiter.api.Assertions;

public class ScenarioValidationDialogImpl extends TestObject implements ScenarioValidationDialog {

	public void assertMessage(HashMap<String, String> keyMap) {
		Assertions.assertEquals(keyMap.get("Message"), getLA().getValidationMessage());
	}

	@Override
	public void assertEmpty(HashMap<String, String> keyMap) {
		Assertions.assertTrue(getLA().getValidationMessage().isEmpty());
	}
}
