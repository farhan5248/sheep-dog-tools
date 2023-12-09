package org.farhan.graph.validation;

public class VerticeValidator {

	// Given an input/transition or response/state then response/state
	private static final String OBJ_REGEX = "( .*)";
	private static final String APP_REGEX = "( .*( application| service),)?";
	private static final String STATE_NAME_REGEX = "The" + APP_REGEX + "(" + OBJ_REGEX;
	private static final String STATE_DETAILS_REGEX = " is (empty|present|as follows))";
	private static final String STATE_REGEX = STATE_NAME_REGEX + STATE_DETAILS_REGEX;
	public static final String INVALID_STATE = "invalidState";

	public static boolean isValid(String name) {
		return name.matches(STATE_REGEX);
	}

	public static String getErrorMessage() {
		// this applies to Given and Then
		String stateEgs = "The blah application, something/something/something/Object is empty\r\n"
				+ "The blah service, something/something/something/Object is empty\r\n"
				+ "The something/something/something/Object is empty\r\n" + "\r\n"
				+ "The blah application, something/something/something/Object is present\r\n"
				+ "The blah service, something/something/something/Object is present\r\n"
				+ "The something/something/something/Object is present\r\n" + "\r\n"
				+ "The blah application, something/something/something/Object is as follows\r\n"
				+ "The blah service, something/something/something/Object is as follows\r\n"
				+ "The something/something/something/Object is as follows";

		String msg = "The state name and details are invalid. Examples:\n" + stateEgs;

		return msg;
	}

}
