package org.farhan.mbt.core;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Property;
import org.farhan.mbt.uml.PackageFactory;
import org.farhan.mbt.uml.UMLProject;

public abstract class ToUMLConverter {

	public ToUMLConverter() {
		theMachine = new StateMachine();
	}

	protected UMLProject targetProject;

	protected abstract void selectLayerObjects() throws Exception;

	protected abstract String getLayer();

	protected abstract ArrayList<ConvertibleObject> getLayerObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject layerFile : getLayerObjects(getLayer())) {
			Class layerClass = convertObject(layerFile);
			convertImports(layerClass);
			convertBehaviours(layerClass);
		}
	}

	protected abstract Class convertObject(ConvertibleObject layerFile) throws Exception;

	protected abstract void convertImports(Class layerClass) throws Exception;

	protected abstract void convertBehaviours(Class layerClass) throws Exception;

	protected abstract void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception;

	protected abstract void convertMessage(Interaction anInteraction, Object anObject) throws Exception;

	protected void linkLayerFiles(String layer) throws Exception {
		ArrayList<Interaction> layerInteractions = PackageFactory.getPackagedInteractions(targetProject.theSystem,
				layer);
		for (Interaction i : layerInteractions) {
			for (Message m : i.getMessages()) {
				for (String methodName : getNextLayerInteractionNamesfromMessage(m)) {
					Interaction nextLayerInteraction = addNextLayerInteraction(methodName, m);
					if (nextLayerInteraction.getMessages().isEmpty()
							&& nextLayerInteraction.getOwnedParameters().isEmpty()) {
						addNextLayerInteractionParameters(nextLayerInteraction, m);
						addNextLayerInteractionMessages(nextLayerInteraction, m);
					} else if (!nextLayerInteraction.getMessages().isEmpty()
							&& nextLayerInteraction.getName().endsWith("AsFollows")) {
						// TODO also check for executed with or the interaction's parameters
						// This is done in case there are new fields referenced in the step
						addNextLayerInteractionParameters(nextLayerInteraction, m);
					}
					m.setSignature(nextLayerInteraction);
				}
			}
		}
	}

	protected abstract Interaction addNextLayerInteraction(String methodName, Message m);

	protected abstract ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m);

	protected abstract void addNextLayerInteractionParameters(Interaction targetInteraction, Message m);

	protected abstract void addNextLayerInteractionMessages(Interaction targetInteraction, Message m);

	protected abstract String getNextLayerClassQualifiedName(Interaction targetInteraction);

	protected Class getNextLayerClassFromMessage(Message m) {
		MessageOccurrenceSpecification targetEvent = (MessageOccurrenceSpecification) m.getReceiveEvent();
		Lifeline targetLifeline = targetEvent.getCovered();
		Property targetProperty = (Property) targetLifeline.getRepresents();
		Class targetClass = (Class) targetProperty.getType();
		return targetClass;
	}

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
			setFSMName(StringUtils.capitalize(Validator.getComponentName(messageName)));
		}
	}

	protected abstract String convertFullName(String fullName);

	protected String getMethodName(String name, boolean keepNumbers) {
		// remove arguments
		String newName = name;
		newName = Utilities.removeDelimiterAndCapitalize(newName, "\\.");
		newName = Utilities.removeDelimiterAndCapitalize(newName, "\\-");
		newName = Utilities.removeDelimiterAndCapitalize(newName, "/");
		newName = Utilities.removeDelimiterAndCapitalize(newName, " ");
		newName = newName.replaceAll("[^a-zA-Z0-9]", "");
		if (!keepNumbers) {
			newName = newName.replaceAll("[^a-zA-Z]", "");
		}
		// change first character to lower case
		newName = Utilities.toLowerCamelCase(newName);
		return newName;
	}

}
