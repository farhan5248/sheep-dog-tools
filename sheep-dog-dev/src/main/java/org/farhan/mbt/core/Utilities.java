package org.farhan.mbt.core;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Utilities {

	// TODO move this to classes that use it.

	public static String removeDelimiterAndCapitalize(String text, String delimiter) {
		String[] nameParts = text.split(delimiter);
		text = "";
		for (String s : nameParts) {
			text += StringUtils.capitalize(s);
		}
		return text;
	}

	public static String upperFirst(String text) {
		if (!text.isEmpty()) {
			return text.substring(0, 1).toUpperCase() + text.substring(1);
		}
		return text;
	}

	public static Object listAsCsv(ArrayList<String> list) {
		String csv = "";
		for (String listItem : list) {
			csv += "," + listItem;
		}
		return csv.replaceFirst(",", "");
	}
}
