package org.farhan.objects.mbttransformerplugin;

import org.farhan.objects.common.TestObject;

public class MBTTransformerPluginFactory {

	// TODO make this a map of all objects later
	private static CucumberToUMLGoal cucumberToUMLGoal;

	public static TestObject get(String className) {
		if (className.contentEquals("CucumberToUMLGoal")) {
			if (cucumberToUMLGoal == null) {
				cucumberToUMLGoal = new CucumberToUMLGoal();
			}
			return cucumberToUMLGoal;
		}
		return null;
	}

}
