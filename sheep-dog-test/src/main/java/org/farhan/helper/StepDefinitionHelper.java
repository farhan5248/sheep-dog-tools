package org.farhan.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class StepDefinitionHelper {

	public static void generate(ILanguageAccess la, Map<Object, Object> options) throws Exception {
		URI objectURI = getObjectURI(la);
		Resource theResource = getOrCreateResource(objectURI);
		EObject theObject = getOrCreateObject(theResource, la);
		EObject theStepDef = getOrCreateStepDef(theObject, la);
		getOrCreateParameters(theStepDef, la);
		theResource.save(options);
	}

	private static Resource getOrCreateResource(URI objectURI) throws Exception {
		Resource theResource = new ResourceSetImpl().createResource(objectURI);
		if (new ResourceSetImpl().getURIConverter().exists(objectURI, null)) {
			theResource.load(new HashMap());
		}
		return theResource;
	}

	private static URI getObjectURI(ILanguageAccess la) {
		String projectName = la.getProjectName(la.getStepResource());
		String outputDir = la.getOutputName();
		String fileName = getObjectQualifiedName(la);
		return URI.createPlatformResourceURI("/" + projectName + "/" + outputDir + "/" + fileName, true);
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

	private static EObject getOrCreateObject(Resource res, ILanguageAccess la) {

		if (res.getContents().isEmpty()) {
			res.getContents().add(la.createStepObject());
		}
		return res.getContents().get(0);
	}

	private static EObject getOrCreateStepDef(EObject theObject, ILanguageAccess la) {

		for (Object stepDef : la.getStepDefinitions(theObject)) {
			if (la.getStepDefinitionName((EObject) stepDef).contentEquals(la.getStepName())) {
				return (EObject) stepDef;
			}
		}
		return la.addStepDefinition(theObject);
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

}
