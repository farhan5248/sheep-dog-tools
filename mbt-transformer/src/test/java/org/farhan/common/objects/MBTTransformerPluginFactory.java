package org.farhan.common.objects;

import org.farhan.objects.mbttransformerplugin.CucumberToUMLGoal;
import org.farhan.objects.mbttransformerplugin.UMLToCucumberGoal;

public class MBTTransformerPluginFactory {

	// TODO make this a map of all objects later and then use a DI framework
	private static CucumberToUMLGoal cucumberToUMLGoal;
	private static UMLToCucumberGoal UMLTocucumberGoal;

	public static GoalObject get(String className) {
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
