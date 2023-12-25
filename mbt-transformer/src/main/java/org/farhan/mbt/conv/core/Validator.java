package org.farhan.mbt.conv.core;

import org.farhan.mbt.graph.validation.EdgeValidator;
import org.farhan.mbt.graph.validation.VerticeValidator;

public class Validator {

	public static boolean validateStepText(String messageName) {
		return VerticeValidator.isValid(messageName) || EdgeValidator.isValid(messageName);
	}

	public static String getObjectName(String messageName) {
		if (VerticeValidator.isVertice(messageName)) {
			return VerticeValidator.getObjectName(messageName);
		}
		if (EdgeValidator.isEdge(messageName)) {
			return EdgeValidator.getObjectName(messageName);
		}
		return null;
	}

	public static String getObjectType(String messageName) {
		if (VerticeValidator.isVertice(messageName)) {
			return VerticeValidator.getObjectType(messageName);
		}
		if (EdgeValidator.isEdge(messageName)) {
			return EdgeValidator.getObjectType(messageName);
		}
		return null;
	}

	public static String getContainerName(String messageName) {
		if (VerticeValidator.isVertice(messageName)) {
			return VerticeValidator.getContainerName(messageName);
		}
		if (EdgeValidator.isEdge(messageName)) {
			return EdgeValidator.getContainerName(messageName);
		}
		return null;
	}

	public static String getContainerType(String messageName) {
		if (VerticeValidator.isVertice(messageName)) {
			return VerticeValidator.getContainerType(messageName);
		}
		if (EdgeValidator.isEdge(messageName)) {
			return EdgeValidator.getContainerType(messageName);
		}
		return null;
	}

	public static String getSection(String messageName) {
		if (VerticeValidator.isVertice(messageName)) {
			return VerticeValidator.getSection(messageName);
		}
		return null;
	}

	public static boolean isContainerStep(String messageName) {
		if (VerticeValidator.isVertice(messageName)) {
			return VerticeValidator.isContainerStep(messageName);
		}
		if (EdgeValidator.isEdge(messageName)) {
			return EdgeValidator.isContainerStep(messageName);
		}
		return false;
	}

	public static boolean isNegativeStep(String messageName) {
		if (VerticeValidator.isVertice(messageName)) {
			return VerticeValidator.isNegativeStep(messageName);
		}
		if (EdgeValidator.isEdge(messageName)) {
			return EdgeValidator.isNegativeStep(messageName);
		}
		return false;
	}

}
