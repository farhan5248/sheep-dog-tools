package org.farhan.graph.validation;

public class EdgeValidator {
	// When request for next response/state
	// TODO The (.*) is requested( for ( record| section))?
	private static final String TRANSITION_NAME_REGEX = "(The (.*) request)";
	private static final String TRANSITION_DETAILS_REGEX = "( is( sent| triggered| bad| good)( with| as follows)?)";
	private static final String TRANSITION_REGEX = TRANSITION_NAME_REGEX + TRANSITION_DETAILS_REGEX;
	public static final String INVALID_TRANSITION = "invalidTransition";

	public static boolean isValid(String name) {

		return name.matches(TRANSITION_REGEX);
	}

	public static String getErrorMessage() {
		// this applies to When
		String transitionEgs = "The blah request is good\r\n" + "The blah request is bad\r\n"
				+ "The blah request is sent with\r\n" + "The blah request is triggered with\r\n"
				+ "The blah request is sent as follows\r\n" + "The blah request is triggered as follows";

		String msg = "The state name and details are invalid. Examples:\n" + transitionEgs;

		return msg;
	}
}
