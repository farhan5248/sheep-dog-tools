package org.farhan.common;

import org.junit.jupiter.api.Assertions;

public class DialogObject extends TestObject {

	private static String message;

	public static void setMessage(String message) {
		DialogObject.message = message;
	}

	protected void assertMessage(String message) {
		Assertions.assertEquals(message, DialogObject.message);
	}

}
