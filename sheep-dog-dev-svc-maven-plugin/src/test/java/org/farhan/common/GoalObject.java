package org.farhan.common;

import org.farhan.mbt.maven.MBTMojo;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;

public abstract class GoalObject extends TestObject {

	@Value("${server.host:sheep-dog-dev-svc}")
	private String serverHost;
	
	@Value("${server.port:30080}")
	private int serverPort;

	public GoalObject() {
		attributes.put("tags", "");
	}

	protected void runGoal(String goal) {
		try {
			Class<?> mojoClass = Class.forName(goal);
			MBTMojo mojo = (MBTMojo) mojoClass.getConstructor().newInstance();
			mojo.tag = attributes.get("tags");
			mojo.baseDir = "target/src-gen/";
			mojo.host = serverHost;
			mojo.port = serverPort;
			mojo.execute();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
