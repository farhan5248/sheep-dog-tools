package org.farhan.common;

import org.farhan.helper.StepDefinitionHelper;
import org.junit.jupiter.api.Assertions;

public abstract class ActionObject extends TestObject {

	protected void runAction(String action) {
		try {
			if (action.contentEquals("validate")) {
				DialogObject.setMessage(
						StepDefinitionHelper.getProblems(new LanguageAccessMock(FeatureFileObject.getStep())));
			}
			if (action.contentEquals("generate")) {
				LanguageAccessMock la = new LanguageAccessMock(FeatureFileObject.getStep());
				StepDefinitionHelper.generate(la, null);				
			}

		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
