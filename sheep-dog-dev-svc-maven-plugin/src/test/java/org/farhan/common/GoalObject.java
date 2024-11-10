package org.farhan.common;

import java.io.File;

import org.farhan.mbt.maven.MBTMojo;
import org.farhan.mbt.maven.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {
	protected void runGoal(String goal) {
		try {
			if (keyValue.get("tags") == null) {
				keyValue.put("tags", "");
			}
			Class<?> mojoClass = Class.forName(goal);
			MBTMojo mojo = (MBTMojo) mojoClass.getConstructor().newInstance();
			mojo.tag = keyValue.get("tags");
			mojo.port = 8080;
			mojo.srcDir = new File("target/src-gen/" + this.keyValue.get("component") + "/src/test/");
			mojo.execute();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
