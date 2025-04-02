package org.farhan.dsl.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStepNameHelper {

	private static final String NAME_REGEX = "[^,]";
	private static final String COMPONENT_REGEX = "(( " + NAME_REGEX + "+)" + getComponentRegex() + ",)?";
	private static final String OBJECT_REGEX = "(( " + NAME_REGEX + "+)(" + getObjectVertexRegex() + "|"
			+ getObjectEdgeRegex() + "))";
	private static final String DETAILS_REGEX = "(( " + NAME_REGEX + "+)" + getDetailRegex() + ")?";
	private static final String STATE_REGEX = "(" + getStateModalityRegex() + getStateAttributeRegex()
			+ getAttachmentRegex() + "?)";
	private static final String TIME_REGEX = "( early| late| on time|( at| before| after| in| on)(.*))?";
	private static final String PREDICATE_REGEX = "(" + DETAILS_REGEX + STATE_REGEX + TIME_REGEX + ")";
	private static final String REGEX = "The" + COMPONENT_REGEX + OBJECT_REGEX + PREDICATE_REGEX;

	private static String getStateAttributeRegex() {
		return "( \\S+)";
	}

	public static String getAttachment(String text) {
		return getGroup(text, 16);
	}

	private static String getAttachmentRegex() {
		return getRegexFromTypes(getAttachmentTypes());
	}

	public static String[] getAttachmentTypes() {
		String[] types = { "with", "as follows" };
		return types;
	}

	public static String getComponent(String text) {
		return getGroup("The" + COMPONENT_REGEX, text, 1).replace(",", "");
	}

	public static String getComponentName(String text) {
		return getGroup(text, 2);
	}

	private static String getComponentRegex() {
		return getRegexFromTypes(getComponentTypes());
	}

	public static String getComponentType(String text) {
		return getGroup(text, 3);
	}

	public static String[] getComponentTypes() {
		String[] types = { "application", "service", "plugin", "batchjob", "project" };
		return types;
	}

	private static String getDetailRegex() {
		return getRegexFromTypes(getDetailTypes());
	}

	public static String getDetails(String text) {
		return getGroup(text, 10);
	}

	public static String getDetailsName(String text) {
		return getGroup(text, 11);
	}

	public static String getDetailsType(String text) {
		return getGroup(text, 12);
	}

	public static String[] getDetailTypes() {
		String[] types = { "section", "fragment", "table", "snippet", "list" };
		return types;
	}

	public static String getErrorMessage() {
		String rules = "\nThe component is: " + COMPONENT_REGEX + "\nThe object is: " + OBJECT_REGEX
				+ "\nThe details are: " + DETAILS_REGEX + "\nThe state is: " + STATE_REGEX + "\nThe Time is: "
				+ TIME_REGEX;
		return "This is an invalid statement. These are the rules:" + rules;
	}

	public static String getGroup(String text, int group) {
		return getGroup(REGEX, text, group);
	}

	public static String getGroup(String regex, String text, int group) {
		Matcher m = Pattern.compile(regex).matcher(text);
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

	public static String getObject(String text) {
		return getGroup("The" + COMPONENT_REGEX + OBJECT_REGEX, text, 4);
	}

	private static String getObjectEdgeRegex() {
		return getRegexFromTypes(getObjectEdgeTypes());
	}

	public static String[] getObjectEdgeTypes() {
		String[] types = { "request", "goal", "job", "action" };
		return types;
	}

	public static String getObjectName(String text) {
		return getGroup(text, 5);
	}

	public static String getObjectType(String text) {
		return getGroup(text, 6);
	}

	private static String getObjectVertexRegex() {
		return getRegexFromTypes(getObjectVertexTypes());
	}

	public static String[] getObjectVertexTypes() {
		String[] types = { "file", "page", "response", "dialog", "directory" };
		return types;
	}

	public static String getPredicate(String text) {
		return getGroup("The" + COMPONENT_REGEX + OBJECT_REGEX + "(.*)", text, 9);
	}

	private static String getRegexFromTypes(String[] types) {
		String regex = "(";
		for (String componentType : types) {
			regex += " " + componentType + "|";
		}
		return regex.replaceAll("\\|$", ")");
	}

	public static String getState(String text) {
		return getGroup(text, 13);
	}

	public static String getStateModality(String text) {
		return getGroup(text, 14);
	}

	private static String getStateModalityRegex() {
		return getRegexFromTypes(getStateModalityTypes());
	}

	public static String[] getStateModalityTypes() {
		String[] types = { "is", "isn't", "will be", "won't be" };
		return types;
	}

	public static String getStateType(String text) {
		return getGroup(text, 15);
	}

	public static String getTime(String text) {
		return getGroup(text, 17);
	}

	public static boolean hasAttachment(String text) {
		return !getAttachment(text).isEmpty();
	}

	public static boolean hasComponent(String text) {
		return !getComponentName(text).isEmpty();
	}

	public static boolean hasDetails(String text) {
		return !getGroup("The" + COMPONENT_REGEX + OBJECT_REGEX + DETAILS_REGEX, text, 9).isBlank();
	}

	public static String getUpToModality(String text) {
		return getGroup("The" + COMPONENT_REGEX + OBJECT_REGEX + DETAILS_REGEX + getStateModalityRegex(), text, 0);
	}

	public static boolean isEdge(String text) {
		return !getGroup(text, 8).isEmpty();
	}

	public static boolean isNegativeStep(String text) {
		return getGroup(text, 14).contains("isn't") || getGroup(text, 14).contains("won't be");
	}

	public static boolean isValid(String text) {
		return text.matches(REGEX);
	}

	public static boolean isVertex(String text) {
		return !getGroup(text, 7).isEmpty();
	}

}
