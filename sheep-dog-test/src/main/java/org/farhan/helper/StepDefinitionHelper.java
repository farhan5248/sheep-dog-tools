package org.farhan.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class StepDefinitionHelper {

	public static Object[] getAlternateObjects(ILanguageAccess la) throws Exception {

		// TODO change this to Proposal class for easier testing. The validator code has
		// to convert this to a string anyways
		String qualifiedName = getStepObjectQualifiedName(la);
		String[] nameParts = qualifiedName.split("/");
		String objectName = StepHelper.getObject(la.getStepName());
		ArrayList<String> alternateNames = new ArrayList<String>();
		for (String alternateName : la.getFilesRecursively(nameParts[0])) {
			if (!alternateName.contentEquals(qualifiedName)
					&& alternateName.endsWith(nameParts[nameParts.length - 1])) {
				alternateName = alternateName.replaceFirst(la.getFileExtension()+"$", "");
				alternateName = alternateName.replaceFirst(nameParts[0] + "/", "");
				alternateNames.add(la.getStepName().replace(objectName, alternateName));
			}
		}
		return alternateNames.toArray();
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

	public static void generate(ILanguageAccess la, Map<Object, Object> options) throws Exception {
		Object stepObject = la.createStepObject(getStepObjectQualifiedName(la));
		Object stepDefinition = createStepDefinition(stepObject, la);
		createStepDefinitionParameters(stepDefinition, la);
		la.saveObject(stepObject, options);
	}

	private static ArrayList<Proposal> getComponentCompletions(ILanguageAccess la) {

		ArrayList<Proposal> proposals = new ArrayList<Proposal>();
		if (la.getStepName() != null) {
			if (la.getStepName().startsWith("The ")) {
				Proposal proposal;
				for (String type : StepHelper.getComponentTypes()) {
					proposal = new Proposal(la.getStepName().replace("The ", "") + " " + type, type,
							la.getStepName() + " " + type + ",");
					proposals.add(proposal);
				}
			}
		}
		return proposals;
	}

	private static ArrayList<Proposal> getComponentObjects(ILanguageAccess la, String component) throws Exception {

		ArrayList<Proposal> proposals = new ArrayList<Proposal>();
		Proposal proposal;
		for (String fileName : la.getFilesRecursively(component)) {
			proposal = new Proposal();
			proposal.setDisplay(fileName.replace(component + "/", "").replaceFirst(la.getFileExtension()+"$", ""));
			proposal.setDocumentation(la.getStepObjectDescription(fileName));
			proposal.setReplacement("The " + component + ", " + proposal.getDisplay());
			proposals.add(proposal);
		}
		return proposals;
	}

	private static ArrayList<Proposal> getObjectCompletion(ILanguageAccess la) {
		ArrayList<Proposal> proposals = new ArrayList<Proposal>();
		if (la.getStepName() != null) {
			if (!la.getStepName().replaceFirst(".*,", "").isBlank()) {
				for (String type : StepHelper.getObjectVertexTypes()) {
					proposals.add(new Proposal(la.getStepName().replaceFirst(".*, ", "") + " " + type, type,
							la.getStepName() + " " + type));
				}
				for (String type : StepHelper.getObjectEdgeTypes()) {
					proposals.add(new Proposal(la.getStepName().replaceFirst(".*, ", "") + " " + type, type,
							la.getStepName() + " " + type));
				}
			}
		}
		return proposals;
	}

	private static ArrayList<Proposal> getObjectDefinitionCompletion(ILanguageAccess la) {
		ArrayList<Proposal> proposals = new ArrayList<Proposal>();
		if (la.getStepName() != null) {
			String upToModality = StepHelper.getUpToModality(la.getStepName());
			if (upToModality.isBlank()) {
				String predicate = StepHelper.getPredicate(la.getStepName());
				if (predicate.isEmpty()) {
					// TODO in the future get a list of words from existing definitions
					proposals.add(new Proposal("details name", "Specify section etc", la.getStepName() + " details"));
					for (String type : StepHelper.getStateModalityTypes()) {
						proposals.add(new Proposal(type, type, la.getStepName() + " " + type));
					}
				} else {
					if (StepHelper.hasDetails(la.getStepName())) {
						for (String type : StepHelper.getStateModalityTypes()) {
							proposals.add(new Proposal(type, type, la.getStepName() + " " + type));
						}
					} else {
						for (String type : StepHelper.getDetailTypes()) {
							proposals.add(new Proposal(type, type, la.getStepName() + " " + type));
						}
					}
				}
			} else {
				if (la.getStepName().replace(upToModality, "").isBlank()) {
					// TODO in the future get a list of words from existing definitions
					proposals.add(new Proposal("attribute name", "Specify created etc", la.getStepName() + " created"));
				} else {
					if (StepHelper.getAttachment(la.getStepName()).isBlank()) {
						for (String type : StepHelper.getAttachmentTypes()) {
							proposals.add(new Proposal(type, type, la.getStepName() + " " + type));
						}
					}
				}
			}
		}
		return proposals;
	}

	private static ArrayList<Proposal> getObjectDefinitions(ILanguageAccess la) throws Exception {
		ArrayList<Proposal> proposals = new ArrayList<Proposal>();
		Proposal proposal;
		String objectQualifiedName = getStepObjectQualifiedName(la);
		String component = StepHelper.getComponent(la.getStepName());
		String object = StepHelper.getObject(la.getStepName());
		if (la.getStepObject(objectQualifiedName) != null) {
			Object stepObject = la.getStepObject(objectQualifiedName);
			for (Object stepDef : la.getStepDefinitions(stepObject)) {
				proposal = new Proposal();
				proposal.setDisplay(la.getStepDefinitionName((Object) stepDef));
				proposal.setDocumentation(la.getStepDefinitionDescription((Object) stepDef));
				if (component.isEmpty()) {
					proposal.setReplacement("The " + object + " " + proposal.getDisplay());
				} else {
					proposal.setReplacement("The " + component + ", " + object + " " + proposal.getDisplay());
				}
				proposals.add(proposal);
			}
		}
		return proposals;
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

	private static Collection<Proposal> getPreviousObjects(ILanguageAccess la) {

		TreeMap<String, Proposal> proposals = new TreeMap<String, Proposal>();
		Proposal proposal;
		ArrayList<Object> allSteps = new ArrayList<Object>();
		allSteps.addAll(la.getBackgroundSteps());
		allSteps.addAll(la.getPreviousSteps());

		for (Object step : allSteps) {

			// This suggestion is to make referring to the last fully qualified name less
			// tedious. However it can only refer to the last object.
			proposal = new Proposal();
			proposal.setDisplay(getStepObjectWithoutPath(StepHelper.getObject(la.getStepName(step))));
			proposal.setDocumentation("Referred in: " + la.getStepName(step));
			proposal.setReplacement("The " + proposal.getDisplay());
			proposals.put(proposal.getDisplay(), proposal);

			// This proposal is to list the fully qualified name of an object in case two
			// objects with the same simple name have different paths like a batch job file
			// being moved between directories
			proposal = new Proposal();
			proposal.setDisplay(StepHelper.getObject(la.getStepName(step)));
			proposal.setDocumentation("Referred in: " + la.getStepName(step));
			proposal.setReplacement("The " + proposal.getDisplay());
			proposals.put(proposal.getDisplay(), proposal);
		}
		return proposals.values();
	}

	private static ArrayList<Proposal> getProjectComponents(ILanguageAccess la) throws Exception {

		ArrayList<Proposal> proposals = new ArrayList<Proposal>();
		Proposal proposal;
		for (String fileName : la.getFiles()) {
			proposal = new Proposal();
			proposal.setDisplay(fileName);
			proposal.setDocumentation(fileName);
			proposal.setReplacement("The " + fileName + ",");
			proposals.add(proposal);
		}
		return proposals;
	}

	private static Object getStepDefinition(Object stepObject, String predicate, ILanguageAccess la) {
		for (Object stepDef : la.getStepDefinitions(stepObject)) {
			if (la.getStepDefinitionName((Object) stepDef).contentEquals(predicate)) {
				return (Object) stepDef;
			}
		}
		return null;
	}

	private static String getStepObjectQualifiedName(ILanguageAccess la) {
		String component = StepHelper.getComponent(la.getStepName());
		String object = StepHelper.getObject(la.getStepName());

		// if there is a component and the object has a /, we're done
		if (!component.isEmpty() && object.contains("/")) {
			return component + "/" + object + la.getFileExtension();
		}
		// Create a list of previous steps in reverse order
		ArrayList<String> previousSteps = new ArrayList<String>();
		String lastComponent = "Unknown service";
		for (Object aStep : la.getPreviousSteps()) {
			previousSteps.add(0, la.getStepName(aStep));
			// keep track of the last component to assign to undeclared object components
			if (!StepHelper.getComponent(la.getStepName(aStep)).isEmpty()) {
				lastComponent = StepHelper.getComponent(la.getStepName(aStep));
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
			return lastComponent + "/" + object + la.getFileExtension();
		} else {
			return component + "/" + object + la.getFileExtension();
		}
	}

	private static String getStepObjectWithoutPath(String stepObject) {
		String[] objectParts = stepObject.split("/");
		return objectParts[objectParts.length - 1];
	}

	public static TreeMap<String, Proposal> proposeStepTable(ILanguageAccess la) throws Exception {
		TreeMap<String, Proposal> proposals = new TreeMap<String, Proposal>();
		Proposal proposal;
		if (StepHelper.isValid(la.getStepName())) {
			String objectQualifiedName = getStepObjectQualifiedName(la);
			Object stepObject = la.getStepObject(objectQualifiedName);
			if (stepObject != null) {
				Object stepDefinition = getStepDefinition(stepObject, getPredicate(la.getStepName()), la);
				if (stepDefinition != null) {
					for (Object parameters : la.getStepDefinitionParameters(stepDefinition)) {
						String paramSetString = la.getStepDefinitionParametersStringUnsorted((Object) parameters);
						proposal = new Proposal();
						proposal.setDisplay(paramSetString);
						proposal.setDocumentation(paramSetString);
						proposal.setReplacement(paramSetString);
						proposals.put(proposal.getReplacement(), proposal);
					}
				}
			}
		}
		return proposals;
	}

	public static TreeMap<String, Proposal> propose(ILanguageAccess la) throws Exception {
		TreeMap<String, Proposal> proposals = new TreeMap<String, Proposal>();
		String component = "";
		String object = "";
		if (la.getStepName() != null) {
			component = StepHelper.getComponent(la.getStepName());
			object = StepHelper.getObject(la.getStepName());
		}
		if (object.isEmpty()) {
			if (component.isEmpty()) {
				for (Proposal proposal : getProjectComponents(la)) {
					proposals.put(proposal.getReplacement(), proposal);
				}
				for (Proposal proposal : getComponentCompletions(la)) {
					proposals.put(proposal.getReplacement(), proposal);
				}
			} else {
				for (Proposal proposal : getComponentObjects(la, component)) {
					proposals.put(proposal.getReplacement(), proposal);
				}
			}
			for (Proposal proposal : getPreviousObjects(la)) {
				proposals.put(proposal.getReplacement(), proposal);
			}
			for (Proposal proposal : getObjectCompletion(la)) {
				proposals.put(proposal.getReplacement(), proposal);
			}
		} else {
			for (Proposal proposal : getObjectDefinitions(la)) {
				proposals.put(proposal.getReplacement(), proposal);
			}
			for (Proposal proposal : getObjectDefinitionCompletion(la)) {
				proposals.put(proposal.getReplacement(), proposal);
			}
		}
		return proposals;
	}

	public static String validateError(ILanguageAccess la) throws Exception {

		if (!StepHelper.isValid(la.getStepName())) {
			return StepHelper.getErrorMessage();
		} else {
			if (la.getAllSteps().getFirst().equals(la.getStep())) {
				if (StepHelper.getComponent(la.getStepName()).isEmpty()) {
					return "The first step must have a component";
				}
			}
		}
		return "";
	}

	public static String validateWarning(ILanguageAccess la) throws Exception {

		String stepObjectQualifiedName = getStepObjectQualifiedName(la);
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

}
