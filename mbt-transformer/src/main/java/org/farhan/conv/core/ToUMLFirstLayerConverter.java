package org.farhan.conv.core;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Interaction;
import org.farhan.conv.validation.Layer1Validator;

public abstract class ToUMLFirstLayerConverter extends ToUMLLayerConverter {

	private StateMachine theMachine;

	private class StateMachine {
		String machineName;
		String currentState;
	}

	void setFSMName(String machineName) {
		theMachine.machineName = Utilities.toUpperCamelCase(machineName);
	}

	protected void setFSMState(String currentState) {
		theMachine.currentState = Utilities.toUpperCamelCase(currentState);
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
		String[] objectParts = Layer1Validator.getObjectName(messageName).split("/");
		// Capitalize the first letter of the type
		String objectType = StringUtils.capitalize(Layer1Validator.getObjectType(messageName));
		setFSMState(objectParts[objectParts.length - 1] + objectType);

		if (Layer1Validator.isContainerStep(messageName)) {
			setFSMName(Layer1Validator.getContainerName(messageName));
		}
	}

	protected void mergeComment(Interaction anInteraction, int index, String newComment) {
		if (anInteraction.getOwnedComments().size() >= index) {
			String oldComment = anInteraction.getOwnedComments().get(index).getBody();
			anInteraction.getOwnedComments().get(index).unsetBody();
			anInteraction.getOwnedComments().get(index).setBody(oldComment + "\n\n" + newComment);
		}
	}
}
