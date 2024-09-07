package org.farhan.objects.xtext.pre;

import org.farhan.common.TestObject;
import org.farhan.common.Utilities;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.objects.xtext.ValidationAction;
import org.junit.jupiter.api.Assertions;

public class ValidationActionImpl extends TestObject implements ValidationAction {

	public void transition() {
		try {
			getLA().setValidationMessage(StepDefinitionHelper.validate(getLA()));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}