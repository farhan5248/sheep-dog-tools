package org.farhan.mbt.cucumber;

import org.farhan.mbt.core.Utilities;

public class CucumberNameConverter {

	// TODO move this to Java file maybe?
	public static String getMethodName(String name, boolean keepNumbers) {
		// remove arguments
		String newName = name;
		newName = Utilities.removeDelimiterAndCapitalize(newName, "\\.");
		newName = Utilities.removeDelimiterAndCapitalize(newName, "\\-");
		newName = Utilities.removeDelimiterAndCapitalize(newName, "/");
		newName = Utilities.removeDelimiterAndCapitalize(newName, " ");
		newName = newName.replaceAll("[^a-zA-Z0-9]", "");
		if (!keepNumbers) {
			newName = newName.replaceAll("[^a-zA-Z]", "");
		}
		// change first character to lower case
		newName = Utilities.toLowerCamelCase(newName);
		return newName;
	}
}
