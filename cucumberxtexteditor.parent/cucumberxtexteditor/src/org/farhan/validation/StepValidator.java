package org.farhan.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StepValidator {

	private static final String NAME_REGEX = "[^,]";
	private static final String COMPONENT_REGEX = "(( " + NAME_REGEX + "+)( application| service| plugin| batchjob),)?";
	private static final String OBJECT_VERTEX_REGEX = "( file| page| response)"; // 6
	private static final String OBJECT_EDGE_REGEX = "( request| goal| job)"; // 7
	private static final String OBJECT_REGEX = "( " + NAME_REGEX + "+)(" + OBJECT_VERTEX_REGEX + "|" + OBJECT_EDGE_REGEX
			+ ")";
	private static final String DETAILS_REGEX = "(,( " + NAME_REGEX + "+)( section| fragment| table| snippet))?";
	private static final String STATE_VERTEX_REGEX = "( empty| present| absent| enabled| disabled| valid| invalid| uploaded| downloaded| created)";
	private static final String STATE_EDGE_REGEX = "( executed| sent| triggered)";
	private static final String STATE_REGEX = "(( is| isn't| will be| won't be)(" + STATE_VERTEX_REGEX + "|"
			+ STATE_EDGE_REGEX + ")( with| as follows)?)";
	private static final String TIME_REGEX = "( early| late| on time|( at| before| after| in| on)(.*))?";
	private static final String REGEX = "The" + COMPONENT_REGEX + OBJECT_REGEX + DETAILS_REGEX + STATE_REGEX
			+ TIME_REGEX;

	public static String getErrorMessage() {
		String rules = "\nThe component is: " + COMPONENT_REGEX + "\nThe object is: " + OBJECT_REGEX
				+ "\nThe details are: " + DETAILS_REGEX + "\nThe state is: " + STATE_REGEX + "\nThe Time is: "
				+ TIME_REGEX;
		return "This is an invalid statement. These are the rules:" + rules;
	}

	public static String getGroup(String text, int group) {
		Matcher m = Pattern.compile(REGEX).matcher(text);
		if (m.find()) {
			String temp = m.group(group);
			if (temp != null) {
				return temp.trim();
			} else {
				return "";
			}
		}
		return "";
	}

	public static boolean isNegativeStep(String text) {
		return getGroup(text, 12).contains("isn't") || getGroup(text, 12).contains("won't be");
	}

	public static boolean isComponentStep(String text) {
		return !getComponentName(text).isEmpty();
	}

	public static boolean isEdge(String text) {
		return !getGroup(text, 7).isEmpty();
	}

	public static boolean isVertex(String text) {
		return !getGroup(text, 6).isEmpty();
	}

	public static boolean hasAttachment(String text) {
		return !getAttachment(text).isEmpty();
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

	public static String getDetails(String text) {
		return getGroup(text, 8);
	}

	public static String getDetailsName(String text) {
		return getGroup(text, 9);
	}

	public static String getDetailsType(String text) {
		return getGroup(text, 10);
	}

	public static String getState(String text) {
		return getGroup(text, 11);
	}

	public static String getStateModality(String text) {
		return getGroup(text, 12);
	}

	public static String getStateType(String text) {
		return getGroup(text, 13);
	}

	public static String getAttachment(String text) {
		return getGroup(text, 16);
	}

	public static boolean isValid(String text) {
		return text.matches(REGEX);
	}

	public static String getTime(String text) {
		return getGroup(text, 17);
	}

}
