package org.farhan.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MBTVertexValidator {

	// The
	// ( .*( application| service| project| plugin| batchjob),)?
	// ( .*)( file| page| config| resource)
	// (, (.*) section)?
	// ( is| isn't)( empty| present| as follows)

	// Given an input/transition or response/state then response/state
	private static final String CONTAINER_REGEX = "(( .*)( application| service| project| plugin| batchjob),)?";
	private static final String OBJECT_REGEX = "( .*)( file| page| config| resource)";
	private static final String SECTION_REGEX = "(, (.*) section)?";
	private static final String DETAILS_REGEX = "(( is| isn't| will be| won't be)( empty| present| as follows| valid))";
	private static final String VERTICE_REGEX = "The" + CONTAINER_REGEX + OBJECT_REGEX + SECTION_REGEX + DETAILS_REGEX;
	public static final String INVALID_VERTICE = "invalidVertice";

	private static String getGroup(String text, int group) {
		Matcher m = Pattern.compile(VERTICE_REGEX).matcher(text);
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

	public static boolean isVertice(String text) {
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

	public static String getSection(String text) {
		return getGroup(text, 7);
	}

	public static String getDetails(String text) {
		return getGroup(text, 8);
	}

	public static boolean isValid(String text) {
		return text.matches(VERTICE_REGEX);
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
