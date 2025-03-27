package org.farhan.objects.xtext.impl;

import org.farhan.common.TestObject;
import org.farhan.helper.StepDefinitionHelper;
import org.farhan.helper.Utilities;
import org.farhan.objects.xtext.StepTableProposalAction;
import org.junit.jupiter.api.Assertions;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class StepTableProposalActionImpl extends TestObject implements StepTableProposalAction {

	public void transition() {
		try {
			getEclipseMock().setProposalList(StepDefinitionHelper.proposeStepTable(getEclipseMock()));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
