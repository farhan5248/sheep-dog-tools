package org.farhan.mbt.core;

import org.apache.commons.lang3.StringUtils;
import org.farhan.validation.MBTEdgeValidator;
import org.farhan.validation.MBTVertexValidator;

public class Validator {

	public static boolean validateStepText(String messageName) {
		return MBTVertexValidator.isValid(messageName) || MBTEdgeValidator.isValid(messageName);
	}

	public static String getObjectName(String messageName) {
		// TODO move this to setCurrentMachineAndState
		if (MBTVertexValidator.isVertex(messageName)) {
			return StringUtils.capitalize(MBTVertexValidator.getObjectName(messageName));
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return StringUtils.capitalize(MBTEdgeValidator.getObjectName(messageName));
		}
		return null;
	}

	public static String getObjectType(String messageName) {
		// TODO move this to setCurrentMachineAndState
		if (MBTVertexValidator.isVertex(messageName)) {
			return StringUtils.capitalize(MBTVertexValidator.getObjectType(messageName));
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return StringUtils.capitalize(MBTEdgeValidator.getObjectType(messageName));
		}
		return null;
	}

	public static String getComponentName(String messageName) {
		// TODO move this to setCurrentMachineAndState
		if (MBTVertexValidator.isVertex(messageName)) {
			return StringUtils.capitalize(MBTVertexValidator.getComponentName(messageName));
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return StringUtils.capitalize(MBTEdgeValidator.getComponentName(messageName));
		}
		return null;
	}

	public static boolean isContainerStep(String messageName) {
		if (MBTVertexValidator.isVertex(messageName)) {
			return MBTVertexValidator.isComponentStep(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.isComponentStep(messageName);
		}
		return false;
	}

	public static boolean isNegativeStep(String messageName) {
		if (MBTVertexValidator.isVertex(messageName)) {
			return MBTVertexValidator.isNegativeStep(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.isNegativeStep(messageName);
		}
		return false;
	}

}
