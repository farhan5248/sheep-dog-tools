package org.farhan.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

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
		URI objectURI = getObjectURI(la);
		Resource theResource = getOrCreateResource(objectURI);
		// TODO object doesn't exist
		EObject theObject = getOrCreateObject(theResource, la);
		// TODO object exists but not keyword
		EObject theStepDef = getOrCreateStepDef(theObject, la);
		// TODO keyword exists but doesn't have parameter set
		getOrCreateParameters(theStepDef, la);
		theResource.save(options);
	}

	public static String getProblems(ILanguageAccess la) throws Exception {
		// check if the object exists
		URI objectURI = getObjectURI(la);
		if (!(new ResourceSetImpl().getURIConverter().exists(objectURI, null))) {
			// TODO object doesn't exist
			return "This object doesn't exist for: " + objectURI.path();
		}
		// check if the keyword exists
		Resource theResource = getOrCreateResource(objectURI);
		EObject theObject = getOrCreateObject(theResource, la);
		EObject theStepDef = getStepDef(theObject, la);
		if (theStepDef == null) {
			// TODO object exists but not keyword
			return "This object step definition doesn't exist for: " + objectURI.path();
		}
		// check if the parameters exist
		if (la.hasParameters(theStepDef)) {
			String headersString = la.getHeaderString();
			for (Object parameters : la.getParameters(theStepDef)) {
				String paramSetString = la.getParametersString((EObject) parameters);
				if (headersString.contentEquals(paramSetString)) {
					return "";
				}
			}
			// TODO keyword exists but doesn't have parameter set
			return "This object step definition parameter set doesn't exist for: " + objectURI.path();
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
		URI objectURI = getObjectURI(la);
		if (new ResourceSetImpl().getURIConverter().exists(objectURI, null)) {
			Resource theResource = getOrCreateResource(objectURI);
			EObject theObject = getOrCreateObject(theResource, la);
			for (Object stepDef : la.getStepDefinitions(theObject)) {
				objectDefinitions.add(la.getStepDefinitionName((EObject) stepDef));
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

	private static URI getObjectURI(ILanguageAccess la) {
		String projectName = la.getProjectName(la.getStepResource());
		String outputDir = la.getOutputName();
		String fileName = getObjectQualifiedName(la);
		return URI.createPlatformResourceURI("/" + projectName + "/" + outputDir + "/" + fileName, true);
	}

	private static EObject getOrCreateObject(Resource res, ILanguageAccess la) {

		if (res.getContents().isEmpty()) {
			res.getContents().add(la.createStepObject());
		}
		return res.getContents().get(0);
	}

	private static void getOrCreateParameters(EObject theStepDef, ILanguageAccess la) {
		if (la.hasParameters(theStepDef)) {
			String headersString = la.getHeaderString();
			for (Object parameters : la.getParameters(theStepDef)) {
				String paramSetString = la.getParametersString((EObject) parameters);
				if (headersString.contentEquals(paramSetString)) {
					return;
				}
			}
		}
		la.createStepDefinitionParameters(theStepDef);
	}

	private static Resource getOrCreateResource(URI objectURI) throws Exception {
		Resource theResource = new ResourceSetImpl().createResource(objectURI);
		if (new ResourceSetImpl().getURIConverter().exists(objectURI, null)) {
			theResource.load(new HashMap());
		}
		return theResource;
	}

	private static EObject getOrCreateStepDef(EObject theObject, ILanguageAccess la) {
		Object stepDef = getStepDef(theObject, la);
		if (stepDef == null) {
			return la.addStepDefinition(theObject);
		} else {
			return (EObject) stepDef;
		}
	}

	private static EObject getStepDef(EObject theObject, ILanguageAccess la) {

		for (Object stepDef : la.getStepDefinitions(theObject)) {
			if (la.getStepDefinitionName((EObject) stepDef).contentEquals(la.getStepName())) {
				return (EObject) stepDef;
			}
		}
		return null;
	}

}
