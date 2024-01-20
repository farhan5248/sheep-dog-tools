package org.farhan.mbt.core;

import org.farhan.mbt.graph.validation.MBTEdgeValidator;
import org.farhan.mbt.graph.validation.MBTVertexValidator;

public class Validator {

	public static boolean validateStepText(String messageName) {
		return MBTVertexValidator.isValid(messageName) || MBTEdgeValidator.isValid(messageName);
	}

	public static String getObjectName(String messageName) {
		if (MBTVertexValidator.isVertice(messageName)) {
			return MBTVertexValidator.getObjectName(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.getObjectName(messageName);
		}
		return null;
	}

	public static String getObjectType(String messageName) {
		if (MBTVertexValidator.isVertice(messageName)) {
			return MBTVertexValidator.getObjectType(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.getObjectType(messageName);
		}
		return null;
	}

	public static String getContainerName(String messageName) {
		if (MBTVertexValidator.isVertice(messageName)) {
			return MBTVertexValidator.getContainerName(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.getContainerName(messageName);
		}
		return null;
	}

	public static String getContainerType(String messageName) {
		if (MBTVertexValidator.isVertice(messageName)) {
			return MBTVertexValidator.getContainerType(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.getContainerType(messageName);
		}
		return null;
	}

	public static String getSection(String messageName) {
		if (MBTVertexValidator.isVertice(messageName)) {
			return MBTVertexValidator.getSection(messageName);
		}
		return null;
	}

	public static boolean isContainerStep(String messageName) {
		if (MBTVertexValidator.isVertice(messageName)) {
			return MBTVertexValidator.isContainerStep(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.isContainerStep(messageName);
		}
		return false;
	}

	public static boolean isNegativeStep(String messageName) {
		if (MBTVertexValidator.isVertice(messageName)) {
			return MBTVertexValidator.isNegativeStep(messageName);
		}
		if (MBTEdgeValidator.isEdge(messageName)) {
			return MBTEdgeValidator.isNegativeStep(messageName);
		}
		return false;
	}

}
