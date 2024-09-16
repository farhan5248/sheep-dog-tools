package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.common.Utilities;
import org.farhan.helper.ScenarioHelper;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.objects.xtext.ScenarioValidationAction;
import org.junit.jupiter.api.Assertions;

public class ScenarioValidationActionImpl extends TestObject implements ScenarioValidationAction {

	public void transition() {
		try {
			getLA().setValidationMessage(ScenarioHelper.validate(getLA()));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
