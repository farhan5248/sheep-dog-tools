package org.farhan.objects.xtext.pre;

import org.farhan.common.TestObject;
import org.farhan.common.Utilities;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.objects.xtext.GenerationAction;
import org.junit.jupiter.api.Assertions;

public class GenerationActionImpl extends TestObject implements GenerationAction {

    public void transition() {
		try {
			StepDefinitionHelper.generate(getLA(), null);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}