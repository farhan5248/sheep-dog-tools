package org.farhan.mbt.core;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public abstract class ToUMLConverter {

	protected String layer;
	protected UMLProject tgtPrj;
	private StateMachine theMachine;

	public ToUMLConverter() {
		theMachine = new StateMachine();
	}

	private class StateMachine {
		String currentState;
		String machineName;
	}

	protected abstract Interaction addNextLayerInteraction(String methodName, Message m);

	protected abstract void addNextLayerInteractionMessages(Interaction targetInteraction, Message m);

	protected abstract void addNextLayerInteractionParameters(Interaction targetInteraction, Message m);

	protected abstract void convertBehaviours(ConvertibleObject layerClass) throws Exception;

	protected abstract void convertImports(ConvertibleObject layerClass) throws Exception;

	protected abstract void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception;

	protected abstract void convertMessage(Interaction anInteraction, Object anObject) throws Exception;

	protected abstract void convertObject(ConvertibleObject object) throws Exception;

	protected abstract String convertObjectName(String fullName);

	protected String getLayer() {
		return layer;
	}

	protected abstract String getNextLayerClassQualifiedName(Interaction targetInteraction);

	protected abstract ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m);

	protected abstract ArrayList<ConvertibleObject> getObjects(String layer);

	protected abstract void selectObjects() throws Exception;

	protected void convertObjects() throws Exception {
		for (ConvertibleObject co : getObjects(getLayer())) {
			convertObject(co);
			convertImports(co);
			convertBehaviours(co);
		}
	}

	protected ElementImport createElementImport(Class owner, Class importedClass) {

		ElementImport ei = getElementImport(owner, importedClass);
		if (ei == null) {
			ei = owner.createElementImport(importedClass);
			ei.setAlias(importedClass.getName());
		}
		return ei;
	}

	protected ElementImport getElementImport(Class owner, Class importedClass) {
		for (ElementImport ei : owner.getElementImports()) {
			if (ei.getImportedElement().getQualifiedName().contentEquals(importedClass.getQualifiedName())) {
				return ei;
			}
		}
		return null;
	}

	public String getFSMName() {
		return theMachine.machineName;
	}

	public String getFSMState() {
		return theMachine.currentState;
	}

	protected Interaction createInteraction(Class theClass, String interactionName) {
		return createInteraction(theClass, interactionName, "");
	}

	protected Interaction createInteraction(Class theClass, String interactionName, String annotationName) {
		Interaction anInteraction = (Interaction) theClass.getOwnedBehavior(interactionName);
		if (anInteraction == null) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(interactionName);
			theClass.setClassifierBehavior(anInteraction);
			Property aProperty = createOwnedAttribute(theClass, "this", theClass);
			createLifeline(theClass, anInteraction, "this");
		}
		if (!annotationName.isEmpty()) {
			createAnnotation(anInteraction, annotationName);
		}
		return anInteraction;
	}

	protected Message getMessage(Interaction anInteraction, Class nextLayerClass, String messageName) {

		Class owningClass = (Class) anInteraction.getOwner();
		Lifeline srcLifeline = createLifeline(owningClass, anInteraction, "this");
		Lifeline tgtLifeline = createLifeline(nextLayerClass, anInteraction, nextLayerClass.getName());

		Message aMessage = anInteraction.createMessage(messageName);
		MessageOccurrenceSpecification mosSrc = createMessageOccurrenceSpecification(anInteraction, aMessage,
				srcLifeline, "SendEvent");
		MessageOccurrenceSpecification mosDst = createMessageOccurrenceSpecification(anInteraction, aMessage,
				tgtLifeline, "ReceiveEvent");

		aMessage.setSendEvent(mosSrc);
		aMessage.setReceiveEvent(mosDst);

		return aMessage;
	}

	private MessageOccurrenceSpecification createMessageOccurrenceSpecification(Interaction anInteraction,
			Message aMessage, Lifeline lifeline, String event) {
		MessageOccurrenceSpecification mosSrc = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		mosSrc.setName(event);
		mosSrc.setEnclosingInteraction(anInteraction);
		mosSrc.setMessage(aMessage);
		mosSrc.setCovered(lifeline);
		return mosSrc;
	}

	private Lifeline createLifeline(Class nextLayerClass, Interaction anInteraction, String name) {
		Class owningClass = (Class) anInteraction.getOwner();
		Property property = createOwnedAttribute(owningClass, name, nextLayerClass);
		Lifeline lifeline = anInteraction.getLifeline(property.getName());
		if (lifeline == null) {
			lifeline = anInteraction.createLifeline(property.getName());
		}
		lifeline.setRepresents(property);
		return lifeline;
	}

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

	protected Class getNextLayerClassFromMessage(Message m) {
		MessageOccurrenceSpecification targetEvent = (MessageOccurrenceSpecification) m.getReceiveEvent();
		return (Class) targetEvent.getCovered().getRepresents().getType();
	}

	protected void linkLayerFiles(String layer) throws Exception {
		ArrayList<ConvertibleObject> objects = tgtPrj.getObjects(layer);
		for (ConvertibleObject co : objects) {
			UMLClassWrapper ucw = (UMLClassWrapper) co;
			for (Behavior b : ((Class) ucw.get()).getOwnedBehaviors()) {
				Interaction i = (Interaction) b;
				for (Message m : i.getMessages()) {
					for (String methodName : getNextLayerInteractionNamesfromMessage(m)) {
						Interaction nextLayerInteraction = addNextLayerInteraction(methodName, m);
						if (nextLayerInteraction.getMessages().isEmpty()
								&& nextLayerInteraction.getOwnedParameters().isEmpty()) {
							addNextLayerInteractionParameters(nextLayerInteraction, m);
							addNextLayerInteractionMessages(nextLayerInteraction, m);
						} else if (!nextLayerInteraction.getMessages().isEmpty()) {
							addNextLayerInteractionParameters(nextLayerInteraction, m);
						}
						m.setSignature(nextLayerInteraction);
					}
				}
			}
		}
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

	protected ValueSpecification createArgument(Message aMessage, String name, String value) {
		LiteralString ls = (LiteralString) aMessage.getArgument(name, null);
		if (ls == null) {
			ls = UMLFactory.eINSTANCE.createLiteralString();
			ls = (LiteralString) aMessage.createArgument(name, null, ls.eClass());
			ls.setName(name);
			ls.setValue(value);
		}
		return ls;
	}

	protected Parameter createParameter(Interaction anInteraction, String paramName, String defaultValue,
			String direction) {
		Parameter aParameter = anInteraction.getOwnedParameter(paramName, null);
		if (aParameter == null) {
			aParameter = anInteraction.createOwnedParameter(paramName, null);
			aParameter.setDefault(defaultValue);
			aParameter.setDirection(ParameterDirectionKind.getByName(direction));
		}
		return aParameter;
	}

	protected EAnnotation createAnnotation(Interaction anInteraction, String name) {
		EAnnotation a = anInteraction.getEAnnotation(name);
		if (a == null) {
			a = anInteraction.createEAnnotation(name);
		}
		return a;
	}

	protected EAnnotation createAnnotation(Interaction anInteraction, String name, String key, String value) {
		EAnnotation a = createAnnotation(anInteraction, name);
		a.getDetails().put(key, value);
		return a;
	}

	protected EAnnotation createAnnotation(ValueSpecification vs, String name, String key, String value) {
		EAnnotation a = vs.getEAnnotation(name);
		if (a == null) {
			a = vs.createEAnnotation(name);
		}
		a.getDetails().put(key, value);
		return a;
	}

	protected Class createClassImport(String nextLayerClassName, Interaction nextLayerInteraction) {
		UMLClassWrapper ucw = (UMLClassWrapper) tgtPrj.createObject(nextLayerClassName);
		Class nextLayerClass = (Class) ucw.get();
		Class owningClass = (Class) nextLayerInteraction.getOwner();
		createElementImport(owningClass, nextLayerClass);
		createOwnedAttribute(owningClass, nextLayerClass.getName(), nextLayerClass);
		return nextLayerClass;
	}

	private Property createOwnedAttribute(Class owningClass, String name, Class nextLayerClass) {
		Property property = owningClass.getOwnedAttribute(name, nextLayerClass);
		if (property == null) {
			property = owningClass.createOwnedAttribute(name, nextLayerClass);
		}
		return property;
	}
}
