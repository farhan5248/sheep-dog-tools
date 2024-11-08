package org.farhan.objects.xtext.impl;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.common.Utilities;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.objects.xtext.ScenarioValidationAction;
import org.junit.jupiter.api.Assertions;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class ScenarioValidationActionImpl extends TestObject implements ScenarioValidationAction {

	public void transition() {
		try {
			getEclipseMock().setValidationMessage(StepDefinitionHelper.validateError(getEclipseMock()));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	@Override
	public void setSelectedStep(HashMap<String, String> keyMap) {
		getEclipseMock().setStepSelection(keyMap.get("Selected Step"));
	}
}
