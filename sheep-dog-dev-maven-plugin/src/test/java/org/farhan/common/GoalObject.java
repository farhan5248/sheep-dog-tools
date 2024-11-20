package org.farhan.common;

import java.io.File;

import org.farhan.mbt.maven.MBTMojo;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected void runGoal(String goal) {
		try {
			if (attributes.get("tags") == null) {
				attributes.put("tags", "");
			}
			Class<?> mojoClass = Class.forName(goal);
			MBTMojo mojo = (MBTMojo) mojoClass.getConstructor().newInstance();
			mojo.tag = attributes.get("tags");
			mojo.baseDir = Config.getWorkingDir() + attributes.get("component") + "/";
			mojo.execute();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
