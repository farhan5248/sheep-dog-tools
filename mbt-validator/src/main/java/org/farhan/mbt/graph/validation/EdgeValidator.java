package org.farhan.mbt.graph.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EdgeValidator {

	// The
	// ( .*( application| service| project| plugin| batchjob),)?
	// (.*)( request| goal)
	// ( is| isn't)( executed| sent| triggered| invalid| valid)( with)?
	private static final String APP_REGEX = "(( .*)( application| service| project| plugin| batchjob),)?";
	private static final String OBJ_REGEX = "(.*)( request| goal)";
	private static final String DETAILS_REGEX = "(( is| isn't)( executed| sent| triggered| invalid| valid)( with)?)";
	private static final String EDGE_REGEX = "The" + APP_REGEX + OBJ_REGEX + DETAILS_REGEX;
	public static final String INVALID_EDGE = "invalidEdge";

	private static String getGroup(String text, int group) {
		Matcher m = Pattern.compile(EDGE_REGEX).matcher(text);
		if (m.find()) {
			return m.group(group).trim();
		}
		return null;
	}

	public static String getAppName(String text) {
		return getGroup(text, 2);
	}

	public static String getAppType(String text) {
		return getGroup(text, 3);
	}

	public static String getObjName(String text) {
		return getGroup(text, 4);
	}

	public static String getObjType(String text) {
		return getGroup(text, 5);
	}

	public static String getDetails(String text) {
		return getGroup(text, 6);
	}

	public static boolean isValid(String text) {

		return text.matches(EDGE_REGEX);
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
