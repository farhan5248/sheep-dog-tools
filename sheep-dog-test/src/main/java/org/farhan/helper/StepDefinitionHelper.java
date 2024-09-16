package org.farhan.helper;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class StepDefinitionHelper {

	public static TreeMap<String, String[]> propose(ILanguageAccess la) throws Exception {
		TreeMap<String, String[]> proposals = new TreeMap<String, String[]>();
		String component;
		String object;
		String[] proposalDisplay;
		if (la.getStepName() == null) {
			component = "";
			object = "";
		} else {
			component = StepHelper.getComponent(la.getStepName());
			object = StepHelper.getObject(la.getStepName());
		}
		if (object.isEmpty()) {
			if (component.isEmpty()) {
				for (String stepDefComponent : la.getProjectComponents()) {
					proposalDisplay = new String[2];
					proposalDisplay[0] = "The " + stepDefComponent + ",";
					proposalDisplay[1] = proposalDisplay[0];
					proposals.put("The " + stepDefComponent + ",", proposalDisplay);
				}
			} else {
				for (String stepDefObject : la.getComponentObjects(component)) {
					proposalDisplay = new String[2];
					proposalDisplay[0] = stepDefObject;
					proposalDisplay[1] = proposalDisplay[0];
					proposals.put("The " + component + ", " + stepDefObject, proposalDisplay);
				}
			}
			for (String previousObject : getPreviousObjects(la)) {
				proposalDisplay = new String[2];
				proposalDisplay[0] = "The " + previousObject;
				proposalDisplay[1] = proposalDisplay[0];
				proposals.put("The " + previousObject, proposalDisplay);
			}
		} else {
			// else if there's an object get a list of keywords for the suggestions
			for (String[] stepDef : getObjectDefinitions(la)) {
				proposalDisplay = new String[2];
				proposalDisplay[0] = stepDef[0];
				proposalDisplay[1] = stepDef[1];
				if (component.isEmpty()) {
					proposals.put("The " + object + " " + stepDef[0], proposalDisplay);
				} else {
					proposals.put("The " + component + ", " + object + " " + stepDef[0], proposalDisplay);
				}
			}
		}
		return proposals;
	}

	public static void generate(ILanguageAccess la, Map<Object, Object> options) throws Exception {
		Object stepObject = la.createStepObject(getStepObjectQualifiedName(la));
		Object stepDefinition = createStepDefinition(stepObject, la);
		createStepDefinitionParameters(stepDefinition, la);
		la.saveObject(stepObject, options);
	}

	public static String validate(ILanguageAccess la) throws Exception {

		String stepObjectQualifiedName = getStepObjectQualifiedName(la);// check if the object exists
		if (la.getStepObject(stepObjectQualifiedName) == null) {
			return "This object doesn't exist for: " + stepObjectQualifiedName;
		}
		// check if the keyword exists
		Object stepObject = la.createStepObject(stepObjectQualifiedName);
		Object theStepDef = getStepDefinition(stepObject, getPredicate(la.getStepName()), la);
		if (theStepDef == null) {
			return "This object step definition doesn't exist for: " + stepObjectQualifiedName;
		}
		// check if the parameters exist
		if (la.hasParameters(theStepDef)) {
			String headersString = la.getStepParametersString();
			for (Object parameters : la.getStepDefinitionParameters(theStepDef)) {
				String paramSetString = la.getStepDefinitionParametersString((Object) parameters);
				if (headersString.contentEquals(paramSetString)) {
					return "";
				}
			}
			return "This object step definition parameter set doesn't exist for: " + stepObjectQualifiedName;
		}
		return "";
	}

	private static TreeSet<String> getPreviousObjects(ILanguageAccess la) {
		TreeSet<String> previousObjects = new TreeSet<String>();

		for (String stepName : la.getBackgroundSteps()) {
			String object = StepHelper.getObject(stepName);
			previousObjects.add(object);
		}

		for (String stepName : la.getPreviousSteps()) {
			String object = StepHelper.getObject(stepName);
			previousObjects.add(object);
			// Fix during Suggest an object only once when considering previous objects
			// String[] objectParts = object.split("/");
			// previousObjects.add(objectParts[objectParts.length - 1]);
		}
		return previousObjects;
	}

	private static ArrayList<String[]> getObjectDefinitions(ILanguageAccess la) throws Exception {
		ArrayList<String[]> objectDefinitions = new ArrayList<String[]>();
		String[] stepDefinition;
		String objectQualifiedName = getStepObjectQualifiedName(la);
		if (la.getStepObject(objectQualifiedName) != null) {
			Object stepObject = la.createStepObject(objectQualifiedName);
			for (Object stepDef : la.getStepDefinitions(stepObject)) {
				stepDefinition = new String[2];
				stepDefinition[0] = la.getStepDefinitionName((Object) stepDef);
				stepDefinition[1] = la.getStepDefinitionDescription((Object) stepDef);
				objectDefinitions.add(stepDefinition);
			}
		}
		return objectDefinitions;
	}

	private static String getStepObjectQualifiedName(ILanguageAccess la) {
		String component = StepHelper.getComponent(la.getStepName());
		String object = StepHelper.getObject(la.getStepName());

		// if there is a component and the object has a /, we're done
		if (!component.isEmpty() && object.contains("/")) {
			return component + "/" + object + ".feature";
		}
		// Create a list of previous steps in reverse order
		ArrayList<String> previousSteps = new ArrayList<String>();
		String lastComponent = "Unknown service";
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

	private static void createStepDefinitionParameters(Object theStepDef, ILanguageAccess la) {
		if (la.hasParameters(theStepDef)) {
			String headersString = la.getStepParametersString();
			for (Object parameters : la.getStepDefinitionParameters(theStepDef)) {
				String paramSetString = la.getStepDefinitionParametersString((Object) parameters);
				if (headersString.contentEquals(paramSetString)) {
					return;
				}
			}
			la.createStepDefinitionParameters(theStepDef);
		}
	}

	private static Object createStepDefinition(Object stepObject, ILanguageAccess la) {
		String predicate = getPredicate(la.getStepName());
		Object stepDef = getStepDefinition(stepObject, predicate, la);
		if (stepDef == null) {
			return la.createStepDefinition(stepObject, predicate);
		} else {
			return stepDef;
		}
	}

	private static Object getStepDefinition(Object stepObject, String predicate, ILanguageAccess la) {
		for (Object stepDef : la.getStepDefinitions(stepObject)) {
			if (la.getStepDefinitionName((Object) stepDef).contentEquals(predicate)) {
				return (Object) stepDef;
			}
		}
		return null;
	}

	private static String getPredicate(String stepName) {
		String component = StepHelper.getComponent(stepName);
		String stepObject = StepHelper.getObject(stepName);
		String predicate = stepName;
		predicate = predicate.replaceFirst("^The ", "").trim();
		predicate = predicate.replaceFirst("^" + component + ", ", "").trim();
		predicate = predicate.replaceFirst("^" + stepObject, "").trim();
		predicate = predicate.replaceFirst("^, ", "").trim();
		return predicate;
	}

}
