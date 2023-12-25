package org.farhan.objects.mbttransformerplugin;

import org.farhan.common.objects.TestObject;

public class MBTTransformerPluginFactory {

	// TODO make this a map of all objects later
	private static CucumberToUMLGoal cucumberToUMLGoal;
	private static UMLToCucumberGoal UMLTocucumberGoal;

	public static TestObject get(String className) {
		if (className.contentEquals("CucumberToUMLGoal")) {
			if (cucumberToUMLGoal == null) {
				cucumberToUMLGoal = new CucumberToUMLGoal();
			}
			return cucumberToUMLGoal;
		} else if (className.contentEquals("UmlToCucumberGoal")) {
			if (UMLTocucumberGoal == null) {
				UMLTocucumberGoal = new UMLToCucumberGoal();
			}
			return UMLTocucumberGoal;
		}
		return null;
	}

}
