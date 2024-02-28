package org.farhan.common;

import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends GraphTestObject {
	protected void runGoal(String goal) {
		try {
			Class<?> mojoClass = Class.forName(goal);
			MojoGoal mojo = (MojoGoal) mojoClass.getConstructor().newInstance();
			mojo.mojoGoal();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
