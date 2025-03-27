package org.farhan.objects.xtext.impl;

import org.farhan.common.TestObject;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.helper.Utilities;
import org.farhan.objects.xtext.ValidationAction;
import org.junit.jupiter.api.Assertions;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class ValidationActionImpl extends TestObject implements ValidationAction {

	public void transition() {
		try {
			getEclipseMock().setValidationMessage(StepDefinitionHelper.validateWarning(getEclipseMock()));
			getEclipseMock().setAlternateObjects(StepDefinitionHelper.getAlternateObjects(getEclipseMock()));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
