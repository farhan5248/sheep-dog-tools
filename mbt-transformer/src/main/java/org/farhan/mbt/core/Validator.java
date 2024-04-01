package org.farhan.mbt.core;

import org.apache.commons.lang3.StringUtils;
import org.farhan.validation.MBTEdgeValidator;
import org.farhan.validation.MBTVertexValidator;

public class Validator {

	public static String getObjectAttachment(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getAttachment(stepName);
		} else {
			return MBTEdgeValidator.getAttachment(stepName);
		}
	}

	public static String getComponentName(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return StringUtils.capitalize(MBTVertexValidator.getComponentName(stepName));
		} else {
			return StringUtils.capitalize(MBTEdgeValidator.getComponentName(stepName));
		}
	}

	public static String getObjectName(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return StringUtils.capitalize(MBTVertexValidator.getObjectName(stepName));
		} else {
			return StringUtils.capitalize(MBTEdgeValidator.getObjectName(stepName));
		}
	}

	public static String getObjectState(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return StringUtils.capitalize(MBTVertexValidator.getStateType(stepName));
		} else {
			return StringUtils.capitalize(MBTEdgeValidator.getStateType(stepName));
		}
	}

	public static String getObjectType(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return StringUtils.capitalize(MBTVertexValidator.getObjectType(stepName));
		} else {
			return StringUtils.capitalize(MBTEdgeValidator.getObjectType(stepName));
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
		return StringUtils.capitalize(MBTVertexValidator.getDetailsName(stepName));
	}

	public static String getDetailsType(String stepName) {
		return StringUtils.capitalize(MBTVertexValidator.getDetailsType(stepName));
	}

}
