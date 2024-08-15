package org.farhan.mbt.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MBTVertexValidator {

	// The
	// ( .*( application| service| project| plugin| batchjob),)?
	// ( .*)( file| page| config| resource)
	// (, (.*) section)?
	// ( is| isn't)( empty| present| as follows)

	// Given an input/transition or response/state then response/state
	private static final String NAME_REGEX = "[^,]";
	private static final String COMPONENT_REGEX = "(( " + NAME_REGEX + "+)( application| service| plugin| batchjob),)?";
	private static final String OBJECT_REGEX = "( " + NAME_REGEX + "+)( file| page| response)";
	private static final String DETAILS_REGEX = "(,( " + NAME_REGEX + "+)( section| fragment| table| snippet))?";
	private static final String STATE_REGEX = "(( is| isn't| will be| won't be)( empty| present| absent| enabled| disabled| valid| invalid| uploaded| downloaded)?( as follows)?)";
	private static final String VERTEX_REGEX = "The" + COMPONENT_REGEX + OBJECT_REGEX + DETAILS_REGEX + STATE_REGEX;
	public static final String INVALID_VERTEX = "invalidVertex";

	public static String getErrorMessage() {
		// this applies to Given and Then
		String rules = "\nThe component is: " + COMPONENT_REGEX + "\nThe object is: " + OBJECT_REGEX
				+ "\nThe details are: " + DETAILS_REGEX + "\nThe state is: " + STATE_REGEX;

		String msg = "This is an invalid statement. These are the rules:" + rules;

		return msg;
	}

	private static String getGroup(String text, int group) {
		Matcher m = Pattern.compile(VERTEX_REGEX).matcher(text);
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
		return getGroup(text, 7).contains("isn't") || getGroup(text, 7).contains("won't be");
	}

	public static boolean isComponentStep(String text) {
		String temp = getComponentName(text);
		if (temp != null) {
			return !temp.isEmpty();
		} else {
			return false;
		}
	}

	public static boolean isVertex(String text) {
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

	public static String getDetails(String text) {
		return getGroup(text, 6);
	}

	public static String getDetailsName(String text) {
		return getGroup(text, 7);
	}

	public static String getDetailsType(String text) {
		return getGroup(text, 8);
	}

	public static String getState(String text) {
		return getGroup(text, 9);
	}

	public static String getStateModality(String text) {
		return getGroup(text, 10);
	}

	public static String getStateType(String text) {
		return getGroup(text, 11);
	}

	public static String getAttachment(String text) {
		return getGroup(text, 12);
	}

	public static boolean isValid(String text) {
		return text.matches(VERTEX_REGEX);
	}

}
