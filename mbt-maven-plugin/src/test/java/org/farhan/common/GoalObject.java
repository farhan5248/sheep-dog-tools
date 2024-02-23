package org.farhan.common;

import org.apache.maven.plugin.AbstractMojo;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public class GoalObject extends GraphTestObject {
	protected void runGoal(String goal) {
		try {
			Class<?> mojoClass = Class.forName(goal);
			AbstractMojo mojo = (AbstractMojo) mojoClass.getConstructor().newInstance();
			mojo.execute();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
