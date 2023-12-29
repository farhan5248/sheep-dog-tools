package org.farhan.mbt.graph.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EdgeValidator {

	// The
	// ( .*( application| service| project| plugin| batchjob),)?
	// (.*)( request| goal)
	// ( is| isn't)( executed| sent| triggered| invalid| valid)( with)?
	protected static final String CONTAINER_REGEX = "(( .*)( application| service| project| plugin| batchjob),)?";
	private static final String OBJECT_REGEX = "(.*)( request| goal)";
	private static final String DETAILS_REGEX = "(( is| isn't)( executed| sent| triggered| invalid| valid)( with)?)";
	private static final String EDGE_REGEX = "The" + CONTAINER_REGEX + OBJECT_REGEX + DETAILS_REGEX;
	public static final String INVALID_EDGE = "invalidEdge";

	private static String getGroup(String text, int group) {
		Matcher m = Pattern.compile(EDGE_REGEX).matcher(text);
		if (m.find()) {
			String temp = m.group(group);
			if (temp != null) {
				return temp.trim();
			} else {
				return "";
			}
		}
		return null;
	}

	public static boolean isNegativeStep(String text) {
		return getGroup(text, 7).contains("isn't");
	}

	public static boolean isContainerStep(String text) {
		String temp = getContainerName(text);
		if (temp != null) {
			return !temp.isEmpty();
		} else {
			return false;
		}
	}

	public static boolean isEdge(String text) {
		String temp = getObjectType(text);
		if (temp != null) {
			return !temp.isEmpty();
		} else {
			return false;
		}
	}

	public static String getContainerName(String text) {
		return getGroup(text, 2);
	}

	public static String getContainerType(String text) {
		return getGroup(text, 3);
	}

	public static String getObjectName(String text) {
		return getGroup(text, 4);
	}

	public static String getObjectType(String text) {
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
