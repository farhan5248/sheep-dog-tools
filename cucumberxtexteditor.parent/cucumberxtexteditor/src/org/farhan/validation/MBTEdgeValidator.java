package org.farhan.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MBTEdgeValidator {

	// The
	// ( .*( application| service| project| plugin| batchjob),)?
	// (.*)( request| goal)
	// ( is| isn't)( executed| sent| triggered| invalid| valid)( with)?
	private static final String NAME_REGEX = "[^,]";
	private static final String COMPONENT_REGEX = "(( " + NAME_REGEX + "+)( application| service| plugin| batchjob),)?";
	private static final String OBJECT_REGEX = "( " + NAME_REGEX + "+)( request| goal| job)";
	private static final String STATE_REGEX = "(( is| isn't| will be| won't be)( executed| sent| triggered)( with)?)";
	private static final String TIME_REGEX = "( early| late| on time|( at| before| after| in)(.*))?";
	private static final String EDGE_REGEX = "The" + COMPONENT_REGEX + OBJECT_REGEX + STATE_REGEX + TIME_REGEX;
	public static final String INVALID_EDGE = "invalidEdge";

	public static String getErrorMessage() {
		String rules = "\nThe component is: " + COMPONENT_REGEX + "\nThe object is: " + OBJECT_REGEX
				+ "\nThe state is: " + STATE_REGEX + "\nThe time is: " + TIME_REGEX;
		String msg = "This is an invalid statement. These are the rules:" + rules;

		return msg;
	}

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

	public static boolean isComponentStep(String text) {
		String temp = getComponentName(text);
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

	public static boolean hasAttachment(String text) {
		String temp = getAttachment(text);
		if (temp != null) {
			return !temp.isEmpty();
		} else {
			return false;
		}
	}

	public static String getComponentName(String text) {
		return getGroup(text, 2);
	}

	public static String getComponentType(String text) {
		return getGroup(text, 3);
	}

	public static String getObjectName(String text) {
		return getGroup(text, 4);
	}

	public static String getObjectType(String text) {
		return getGroup(text, 5);
	}

	public static String getState(String text) {
		return getGroup(text, 6);
	}

	public static String getStateModality(String text) {
		return getGroup(text, 7);
	}

	public static String getStateType(String text) {
		return getGroup(text, 8);
	}

	public static String getAttachment(String text) {
		return getGroup(text, 9);
	}

	public static String getTime(String text) {
		return getGroup(text, 10);
	}

	public static boolean isValid(String text) {
		return text.matches(EDGE_REGEX);
	}

}
