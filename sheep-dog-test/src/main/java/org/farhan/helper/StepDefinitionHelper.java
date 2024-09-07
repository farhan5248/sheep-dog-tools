package org.farhan.helper;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class StepDefinitionHelper {

	public static TreeMap<String, String> getProposals(ILanguageAccess la) throws Exception {
		TreeMap<String, String> proposals = new TreeMap<String, String>();
		String component;
		String object;
		if (la.getStepName() == null) {
			component = "";
			object = "";
		} else {
			component = StepHelper.getComponent(la.getStepName());
			object = StepHelper.getObject(la.getStepName());
		}
		if (object.isEmpty()) {
			// if there's no object do the following
			if (component.isEmpty()) {
				for (String previousObject : getPreviousObjects(la)) {
					// TODO Just The, has previous steps
					// TODO Just The, has no previous steps
					proposals.put("The " + previousObject, "The " + previousObject);
				}
				for (String stepDefComponent : la.getProjectComponents()) {
					// TODO Just The, has existing component folders
					// TODO Just The, has no existing component folders
					proposals.put("The " + stepDefComponent + ",", "The " + stepDefComponent + ",");
				}
			} else {
				for (String stepDefObject : la.getComponentObjects(component)) {
					// TODO Just The component, has existing object
					proposals.put("The " + component + ", " + stepDefObject, stepDefObject);
				}
			}
		} else {
			// else if there's an object get a list of keywords for the suggestions
			for (String stepDef : getObjectDefinitions(la)) {
				// TODO component with object, has step def
				// TODO object, has step def
				proposals.put(stepDef, stepDef);
			}
		}
		return proposals;
	}

	public static void generate(ILanguageAccess la, Map<Object, Object> options) throws Exception {
		// TODO object doesn't exist
		Object thObject = la.getOrCreateStepObject(getObjectQualifiedName(la));
		// TODO object exists but not keyword
		Object theStepDef = getOrCreateStepDef(thObject, la);
		// TODO keyword exists but doesn't have parameter set
		getOrCreateParameters(theStepDef, la);
		la.saveObject(thObject, options);
	}

	public static String getProblems(ILanguageAccess la) throws Exception {

		String objectQualifiedName = getObjectQualifiedName(la);// check if the object exists
		if (la.getStepObject(objectQualifiedName) == null) {
			return "This object doesn't exist for: " + objectQualifiedName;
		}
		// check if the keyword exists
		Object thObject = la.getOrCreateStepObject(objectQualifiedName);
		Object theStepDef = getStepDef(thObject, la);
		if (theStepDef == null) {
			// TODO object exists but not keyword
			return "This object step definition doesn't exist for: " + objectQualifiedName;
		}
		// check if the parameters exist
		if (la.hasParameters(theStepDef)) {
			String headersString = la.getHeaderString();
			for (Object parameters : la.getParameters(theStepDef)) {
				String paramSetString = la.getParametersString((Object) parameters);
				if (headersString.contentEquals(paramSetString)) {
					return "";
				}
			}
			// TODO keyword exists but doesn't have parameter set
			return "This object step definition parameter set doesn't exist for: " + objectQualifiedName;
		}
		return "";
	}

	private static TreeSet<String> getPreviousObjects(ILanguageAccess la) {
		TreeSet<String> previousObjects = new TreeSet<String>();
		for (String stepName : la.getPreviousSteps()) {
			// TODO until the step definitions only keep the predicate, both the object
			// alone and the object with its path need to be suggested so that the prefix
			// matches
			String object = StepHelper.getObject(stepName);
			previousObjects.add(object);
			String[] objectParts = object.split("/");
			previousObjects.add(objectParts[objectParts.length - 1]);
		}
		return previousObjects;
	}

	private static TreeSet<String> getObjectDefinitions(ILanguageAccess la) throws Exception {
		TreeSet<String> objectDefinitions = new TreeSet<String>();
		String objectQualifiedName = getObjectQualifiedName(la);
		if (la.getStepObject(objectQualifiedName) != null) {
			Object thObject = la.getOrCreateStepObject(objectQualifiedName);
			for (Object stepDef : la.getStepDefinitions(thObject)) {
				objectDefinitions.add(la.getStepDefinitionName((Object) stepDef));
			}
		}
		return objectDefinitions;
	}

	private static String getObjectQualifiedName(ILanguageAccess la) {
		String component = StepHelper.getComponent(la.getStepName());
		String object = StepHelper.getObject(la.getStepName());

		// if there is a component and the object has a /, we're done
		if (!component.isEmpty() && object.contains("/")) {
			return component + "/" + object + ".feature";
		}
		// Create a list of previous steps in reverse order
		ArrayList<String> previousSteps = new ArrayList<String>();
		String lastComponent = "Unknown service";
		// TODO move getPreviousSteps to this class and add getScenarioSteps to la
		for (String aStep : la.getPreviousSteps()) {
			if (aStep.contentEquals(la.getStepName())) {
				break;
			} else {
				previousSteps.add(0, aStep);
				// keep track of the last component to assign to undeclared object components
				if (!StepHelper.getComponent(aStep).isEmpty()) {
					lastComponent = StepHelper.getComponent(aStep);
				}
			}
		}
		// search all previous steps for a more complete object path. While doing so,
		// if the component is empty, set it
		String[] objectParts = object.split("/");
		String objectKey = objectParts[objectParts.length - 1];
		for (String previousStep : previousSteps) {
			// if the step has a matching object
			String previousObject = StepHelper.getObject(previousStep);
			String previousComponent = StepHelper.getComponent(previousStep);
			if (previousObject.endsWith(objectKey)) {

				// if the object doesn't have / and the matching object does. Set it
				if (!object.contains("/") && previousObject.contains("/")) {
					object = previousObject;
				}
				// if the component is empty and the matching component isn't. Set it
				if (component.isEmpty() && !previousComponent.isEmpty()) {
					component = previousComponent;
				}
				// if we have both, we're done
				if (!component.isEmpty() && object.contains("/")) {
					break;
				}
			} else {
			}
		}
		// TODO, in the future, get the background too if there is one and search there
		// or throw an exception
		if (component.isEmpty()) {
			return lastComponent + "/" + object + ".feature";
		} else {
			return component + "/" + object + ".feature";
		}
	}

	private static void getOrCreateParameters(Object theStepDef, ILanguageAccess la) {
		if (la.hasParameters(theStepDef)) {
			// TODO this should be getStepHeadersList and put ListToString here
			String headersString = la.getHeaderString();
			for (Object parameters : la.getParameters(theStepDef)) {
				String paramSetString = la.getParametersString((Object) parameters);
				if (headersString.contentEquals(paramSetString)) {
					return;
				}
			}
		}
		la.createStepDefinitionParameters(theStepDef);
	}

	private static Object getOrCreateStepDef(Object theObject, ILanguageAccess la) {
		// TODO, shouldn't pass theObject since la will already know which step object
		// the step refers to
		Object stepDef = getStepDef(theObject, la);
		if (stepDef == null) {
			return la.addStepDefinition(theObject);
		} else {
			return stepDef;
		}
	}

	private static Object getStepDef(Object thObject, ILanguageAccess la) {

		for (Object stepDef : la.getStepDefinitions(thObject)) {
			if (la.getStepDefinitionName((Object) stepDef).contentEquals(la.getStepName())) {
				return (Object) stepDef;
			}
		}
		return null;
	}

}
