package org.farhan.objects.xtext.impl;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ScenarioValidationDialog;
import org.junit.jupiter.api.Assertions;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class ScenarioValidationDialogImpl extends TestObject implements ScenarioValidationDialog {

	public void assertMessage(HashMap<String, String> keyMap) {
		Assertions.assertEquals(keyMap.get("Message"), getEclipseMock().getValidationMessage());
	}

	@Override
	public void assertEmpty(HashMap<String, String> keyMap) {
		Assertions.assertTrue(getEclipseMock().getValidationMessage().isEmpty());
	}
}
