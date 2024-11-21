package org.farhan.common;

import org.farhan.mbt.maven.MBTMojo;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	public GoalObject() {
		attributes.put("tags", "");
	}

	protected void runGoal(String goal) {
		try {
			Class<?> mojoClass = Class.forName(goal);
			MBTMojo mojo = (MBTMojo) mojoClass.getConstructor().newInstance();
			mojo.tag = attributes.get("tags");
			mojo.baseDir = "target/src-gen/";
			mojo.port = 8087;
			mojo.execute();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
