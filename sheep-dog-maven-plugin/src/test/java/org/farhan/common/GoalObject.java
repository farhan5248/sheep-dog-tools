package org.farhan.common;

import java.io.File;

import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.maven.MBTMojo;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected String tags = "";

	protected void runGoal(String goal) {
		try {
			Class<?> mojoClass = Class.forName(goal);
			MBTMojo mojo = (MBTMojo) mojoClass.getConstructor().newInstance();
			ConvertibleProject.baseDir = "target/src-gen/" + this.keyValue.get("component") + "/target/mbt/";
			mojo.tag = tags;
			mojo.srcDir = new File("target/src-gen/" + this.keyValue.get("component") + "/src/test/");
			mojo.execute();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
