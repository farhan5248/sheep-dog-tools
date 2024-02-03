package org.farhan.mbt.uml;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.farhan.mbt.core.Utilities;

// TODO delete this class after moving out all the name translations to the converter classes
public class UMLNameConverter {

	public static String filterClassName(String currentClassName) {
		if (currentClassName == null) {
			return "";
		}
		if (currentClassName.startsWith("Common")) {
			return currentClassName;
		}
		String newClassName = currentClassName;
		newClassName = newClassName.replace("-", "");
		newClassName = newClassName.replace("_", "");
		newClassName = newClassName.replace(" ", "");
		newClassName = newClassName.replace("'", "");
		newClassName = newClassName.replace("#", "");
		return newClassName;
	}

	

}
