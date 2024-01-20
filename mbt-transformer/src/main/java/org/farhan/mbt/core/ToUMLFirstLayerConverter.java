package org.farhan.mbt.core;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Interaction;

public abstract class ToUMLFirstLayerConverter extends ToUMLLayerConverter {

	private StateMachine theMachine;

	private class StateMachine {
		String machineName;
		String currentState;
	}

	void setFSMName(String machineName) {
		theMachine.machineName = Utilities.toUpperCamelCase(machineName);
		theMachine.machineName = Utilities.removeDelimiterAndCapitalize(theMachine.machineName, "\\.");
		theMachine.machineName = Utilities.removeDelimiterAndCapitalize(theMachine.machineName, "\\-");
	}

	protected void setFSMState(String currentState) {
		theMachine.currentState = Utilities.toUpperCamelCase(currentState);
		// If the object is a file with a period, remove it and make the first letter
		// upper case
		theMachine.currentState = Utilities.removeDelimiterAndCapitalize(theMachine.currentState, "\\.");
		theMachine.currentState = Utilities.removeDelimiterAndCapitalize(theMachine.currentState, "\\-");
	}

	public String getFSMName() {
		return theMachine.machineName;
	}

	public String getFSMState() {
		return theMachine.currentState;
	}

	public ToUMLFirstLayerConverter() {
		super();
		theMachine = new StateMachine();
	}

	protected void resetCurrentContainerObject() {
		setFSMName("UnknownContainer");
		setFSMState("InitialState");
	}

	protected void setCurrentMachineAndState(String messageName) throws Exception {
		// the actual object name might have delimiters indicating folder or menu
		// structure
		String[] objectParts = Validator.getObjectName(messageName).split("/");
		// Capitalize the first letter of the type
		String objectType = StringUtils.capitalize(Validator.getObjectType(messageName));
		setFSMState(objectParts[objectParts.length - 1] + objectType);

		if (Validator.isContainerStep(messageName)) {
			setFSMName(StringUtils.capitalize(Validator.getContainerName(messageName)));
		}
	}

}
