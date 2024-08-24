package org.farhan.validation;

public class StepWrapper {

	// TODO add getObjectPath to StepWrapper.
	// The (appname apptype, pathtoobject/)?objectname objecttype(, sectionname) is
	// predicate
	
	// TODO getObject
	// TODO getComponent

	
	public static String getObjectAttachment(String stepName) {
		return StepValidator.getAttachment(stepName);
	}

	public static String getComponentType(String stepName) {
		return StepValidator.getComponentType(stepName);
	}

	public static String getComponentName(String stepName) {
		return StepValidator.getComponentName(stepName);
	}

	public static String getObjectName(String stepName) {
		return StepValidator.getObjectName(stepName);
	}

	public static String getObjectState(String stepName) {
		return StepValidator.getStateType(stepName);
	}

	public static String getObjectType(String stepName) {
		return StepValidator.getObjectType(stepName);
	}

	public static boolean isContainerStep(String stepName) {
		return StepValidator.isComponentStep(stepName);
	}

	public static boolean isEdge(String stepName) {
		return StepValidator.isEdge(stepName);
	}

	public static boolean isNegativeStep(String stepName) {
		return StepValidator.isNegativeStep(stepName);
	}

	public static boolean validateStepText(String stepName) {
		return StepValidator.isValid(stepName) || StepValidator.isValid(stepName);
	}

	public static String getDetailsName(String stepName) {
		return StepValidator.getDetailsName(stepName);
	}

	public static String getDetailsType(String stepName) {
		return StepValidator.getDetailsType(stepName);
	}

}
