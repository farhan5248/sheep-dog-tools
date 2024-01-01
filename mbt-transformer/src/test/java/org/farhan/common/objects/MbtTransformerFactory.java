package org.farhan.common.objects;

import org.farhan.objects.mbttransformer.MbtTransformerCucumberToUmlGoal;
import org.farhan.objects.mbttransformer.MbtTransformerUmlToCucumberGoal;

public class MbtTransformerFactory {

	// TODO make this a map of all objects later and then use a DI framework
	private static MbtTransformerCucumberToUmlGoal cucumberToUMLGoal;
	private static MbtTransformerUmlToCucumberGoal UMLTocucumberGoal;

	public static GoalObject get(String className) {
		if (className.contentEquals("MbtTransformerCucumberToUmlGoal")) {
			if (cucumberToUMLGoal == null) {
				cucumberToUMLGoal = new MbtTransformerCucumberToUmlGoal();
			}
			return cucumberToUMLGoal;
		} else if (className.contentEquals("UmlToCucumberGoal")) {
			if (UMLTocucumberGoal == null) {
				UMLTocucumberGoal = new MbtTransformerUmlToCucumberGoal();
			}
			return UMLTocucumberGoal;
		}
		return null;
	}

}
