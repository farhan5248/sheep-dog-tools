package org.farhan.mbt.conv.uml;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.farhan.conv.core.Utilities;

// TODO deleted this class after moving out all the name translations to the converter classes
public class UMLNameTranslator {

	public static String filterClassName(String currentClassName, boolean keepUnderscore) {
		if (currentClassName == null) {
			return "";
		}
		if (currentClassName.startsWith("Common")) {
			return currentClassName;
		}
		String newClassName = currentClassName;
		newClassName = newClassName.replace("page", "Page");
		newClassName = newClassName.replace("-", "");
		newClassName = newClassName.replace("_", "");
		newClassName = newClassName.replace(" ", "");
		newClassName = newClassName.replace("'", "");
		newClassName = newClassName.replace("#", "");

		return newClassName;
	}

	public static String getOtherLayerAppName(String qualifiedName) {
		// TODO maybe a split and split is faster than a regex?
		String packageName = Utilities.regexFind("pst::components::([^:]+)", qualifiedName, 1,
				"UnknownApplication");
		// This name is in lower case but we need the upper case version so let's get it
		// from the class name
		String className = getName(qualifiedName);
		// Now strip out anything that isn't part of the app name
		String appName = className.substring(0, packageName.length());
		return appName;
	}

	public static String getImportAlias(String keywordUsage) {
		// TODO, the keepUnderscore is a temporary hack until I can rename the second
		// layer file names
		String alias = Utilities.regexFind("([^\\.]+)(\\.)(.+)", keywordUsage, 1);
		return alias;
	}

	public static String getMessageName(String keywordUsage) {
		return Utilities.regexFind("([^\\.]+)(\\.)(.+)", keywordUsage, 3);
	}

	public static String getName(String qualifiedName) {
		return Utilities.regexFind("(.*::)?([^:]+)", qualifiedName, 2);
	}

	public static String getParameterName(String variableName) {
		return variableName.replace("${", "").replace("}", "").trim();
	}

	public static Map<String, String> getVariableValues(String signatureName, String messageName) throws Exception {
		// First escape characters in the keyword so that it's not mistaken as part of
		// the regular expression
		String pattern = escapeRegex(signatureName);
		// Get all the named groups (variable names) from the regular expression
		Set<String> variableNames = Utilities.getNamedGroupCandidates(pattern);
		for (String s : variableNames) {
			// Before finding the value, I need to remove underscores from the names.
			// They're fine in an online regex checker but not in Java
			String simpleName = s.replace("_", "").replace("#", "");
			// First I replace it in the pattern
			pattern = pattern.replace("(?<" + s + ">.*)", "(?<" + simpleName + ">.*)");
		}
		// Then I re-initialise the list of names. I could have just updated the Set
		// instead of doing the search again
		variableNames = Utilities.getNamedGroupCandidates(pattern);

		// Assign the value of those variables
		Map<String, String> variableValues = new TreeMap<String, String>();
		for (String s : variableNames) {
			variableValues.put(s, Utilities.regexFindByName(pattern, messageName, s));
		}

		return variableValues;
	}

	public static String escapeRegex(String pattern) {
		return pattern.replace("(", "\\(").replace(")", "\\)").replace(".", "\\.").replace("*", "\\*")
				.replace("?", "\\?").replace("${", "(?<").replace("}", ">.*)");

	}
}
