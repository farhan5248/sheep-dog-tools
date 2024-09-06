package org.farhan.common;

import org.junit.jupiter.api.Assertions;

public abstract class ActionObject extends TestObject {

	protected void runAction(String action) {
		try {
			// select method based on name
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
