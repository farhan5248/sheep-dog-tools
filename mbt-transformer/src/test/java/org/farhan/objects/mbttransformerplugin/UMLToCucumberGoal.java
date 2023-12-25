package org.farhan.objects.mbttransformerplugin;

import org.farhan.common.objects.GoalObject;
import org.farhan.mbt.conv.core.Utilities;
import org.farhan.mbt.conv.cucumber.ConvertUMLToCucumberPSTMojo;
import org.junit.jupiter.api.Assertions;

public class UMLToCucumberGoal extends GoalObject {

	public void execute() {

		try {
			ConvertUMLToCucumberPSTMojo mojo = new ConvertUMLToCucumberPSTMojo();
			mojo.mojoGoal();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
