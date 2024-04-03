package org.farhan.mbt.core;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
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
		String[] nameParts;
		if (MBTVertexValidator.isVertex(stepName)) {
			nameParts = MBTVertexValidator.getComponentName(stepName).split("/");
		} else {
			nameParts = MBTEdgeValidator.getComponentName(stepName).split("/");
		}
		String name = nameParts[nameParts.length - 1];
		name = name.replaceAll("\\.", " ");
		name = name.replaceAll("\\-", " ");
		name = CaseUtils.toCamelCase(name, true, ' ');
		return name;
	}

	public static String getObject(String stepName) {
		if (MBTVertexValidator.isVertex(stepName)) {
			return MBTVertexValidator.getObjectName(stepName);
		} else {
			return MBTEdgeValidator.getObjectName(stepName);
		}
	}

	public static String getObjectName(String stepName) {
		String[] nameParts;
		if (MBTVertexValidator.isVertex(stepName)) {
			nameParts = MBTVertexValidator.getObjectName(stepName).split("/");
		} else {
			nameParts = MBTEdgeValidator.getObjectName(stepName).split("/");
		}
		String name = nameParts[nameParts.length - 1];
		name = name.replaceAll("\\.", " ");
		name = name.replaceAll("\\-", " ");
		name = CaseUtils.toCamelCase(name, true, ' ');
		return name;
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
		String text = StringUtils.capitalize(MBTVertexValidator.getDetailsName(stepName));
		if (text == null) {
			text = "";
		}
		return text;
	}

	public static String getDetailsType(String stepName) {
		String text = StringUtils.capitalize(MBTVertexValidator.getDetailsType(stepName));
		if (text == null) {
			text = "";
		}
		return text;
	}

}
