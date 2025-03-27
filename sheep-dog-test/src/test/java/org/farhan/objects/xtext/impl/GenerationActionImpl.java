package org.farhan.objects.xtext.impl;

import org.farhan.common.TestObject;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.helper.Utilities;
import org.farhan.objects.xtext.GenerationAction;
import org.junit.jupiter.api.Assertions;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class GenerationActionImpl extends TestObject implements GenerationAction {

    public void transition() {
		try {
			StepDefinitionHelper.generate(getEclipseMock(), null);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
