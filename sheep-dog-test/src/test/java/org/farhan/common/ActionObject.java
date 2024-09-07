package org.farhan.common;

import org.farhan.helper.StepDefinitionHelper;
import org.junit.jupiter.api.Assertions;

public abstract class ActionObject extends TestObject {

	protected void runAction(String action) {
		try {
			if (action.contentEquals("validate")) {
				DialogObject.setMessage(StepDefinitionHelper.getProblems(getLanguageAccess()));
			}
			if (action.contentEquals("generate")) {
				StepDefinitionHelper.generate(getLanguageAccess(), null);
			}

		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
