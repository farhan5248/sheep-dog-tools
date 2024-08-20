package org.farhan.validation;

public class StepWrapper {

	public static String getObjectAttachment(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getAttachment(stepName);
		} else {
			return MBTEdgeValidator.getAttachment(stepName);
		}
	}

	public static String getComponentType(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getComponentType(stepName);
		} else {
			return MBTEdgeValidator.getComponentType(stepName);
		}
	}

	public static String getComponentName(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getComponentName(stepName);
		} else {
			return MBTEdgeValidator.getComponentName(stepName);
		}
	}

	public static String getObjectName(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getObjectName(stepName);
		} else {
			return MBTEdgeValidator.getObjectName(stepName);
		}
	}

	public static String getObjectState(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getStateType(stepName);
		} else {
			return MBTEdgeValidator.getStateType(stepName);
		}
	}

	public static String getObjectType(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getObjectType(stepName);
		} else {
			return MBTEdgeValidator.getObjectType(stepName);
		}
	}

	public static boolean isContainerStep(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.isComponentStep(stepName);
		} else {
			return MBTEdgeValidator.isComponentStep(stepName);
		}
	}

	public static boolean isEdge(String stepName) {
		return MBTEdgeValidator.isEdge(stepName);
	}

	public static boolean isNegativeStep(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.isNegativeStep(stepName);
		} else {
			return MBTEdgeValidator.isNegativeStep(stepName);
		}
	}

	public static boolean validateStepText(String stepName) {
		return MBTVertexValidator.isValid(stepName) || MBTEdgeValidator.isValid(stepName);
	}

	public static String getDetailsName(String stepName) {
		return MBTVertexValidator.getDetailsName(stepName);
	}

	public static String getDetailsType(String stepName) {
		return MBTVertexValidator.getDetailsType(stepName);
	}

}
