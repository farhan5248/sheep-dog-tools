package org.farhan.mbt.core;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
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
	protected UMLProject target;
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

	// TODO change Interaction to Object
	protected abstract void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception;

	protected abstract void convertMessage(Interaction anInteraction, Object anObject) throws Exception;

	protected abstract void convertObject(ConvertibleObject layerFile) throws Exception;

	protected abstract String convertObjectName(String fullName);

	protected abstract String getLayer();

	protected abstract String getNextLayerClassQualifiedName(Interaction targetInteraction);

	protected abstract ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m);

	// TODO change to getSource
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

	protected Interaction getInteraction(Class theClass, String interactionName, boolean add) {
		return getInteraction(theClass, interactionName, add, "");
	}

	protected Interaction getInteraction(Class theClass, String interactionName, boolean add, String annotationName) {
		Interaction anInteraction = (Interaction) theClass.getOwnedBehavior(interactionName);
		if (anInteraction == null && add) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(interactionName);
			theClass.setClassifierBehavior(anInteraction);
			Property aProperty = theClass.createOwnedAttribute("this", theClass);
			anInteraction.createLifeline(aProperty.getName()).setRepresents(aProperty);
		}
		if (!annotationName.isEmpty()) {
			createAnnotation(anInteraction, annotationName);
		}
		return anInteraction;
	}

	protected Message getMessage(Interaction anInteraction, Class nextLayerClass, String messageName) {
		Class owningClass = (Class) anInteraction.getOwner();

		// TODO turn each of these blocks into 2 methods
		// 1
		Property thisProperty = owningClass.getOwnedAttribute("this", owningClass);
		Lifeline thisLifeline = anInteraction.createLifeline(thisProperty.getName());
		thisLifeline.setRepresents(thisProperty);

		Property targetProperty = owningClass.getOwnedAttribute(nextLayerClass.getName(), nextLayerClass);
		Lifeline targetLifeline = anInteraction.createLifeline(targetProperty.getName());
		targetLifeline.setRepresents(targetProperty);

		Message aMessage = anInteraction.createMessage(messageName);
		MessageOccurrenceSpecification mosSrc;
		MessageOccurrenceSpecification mosDst;

		// 2
		mosSrc = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		mosSrc.setName("SendEvent");
		mosSrc.setEnclosingInteraction(anInteraction);
		mosSrc.setMessage(aMessage);
		mosSrc.setCovered(thisLifeline);

		mosDst = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		mosDst.setName("ReceiveEvent");
		mosDst.setEnclosingInteraction(anInteraction);
		mosDst.setMessage(aMessage);
		mosDst.setCovered(targetLifeline);

		aMessage.setSendEvent(mosSrc);
		aMessage.setReceiveEvent(mosDst);

		return aMessage;
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
		Lifeline targetLifeline = targetEvent.getCovered();
		Property targetProperty = (Property) targetLifeline.getRepresents();
		Class targetClass = (Class) targetProperty.getType();
		return targetClass;
	}

	protected void linkLayerFiles(String layer) throws Exception {
		ArrayList<ConvertibleObject> objects = target.getObjects(layer);
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
						} else if (!nextLayerInteraction.getMessages().isEmpty()
								&& (nextLayerInteraction.getName().endsWith("AsFollows")
										|| nextLayerInteraction.getName().endsWith("With"))) {
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

	protected ValueSpecification createArgument(Message aMessage, String name, String value, boolean add) {
		LiteralString ls = (LiteralString) aMessage.getArgument(name, null);
		if (ls == null && add) {
			ls = UMLFactory.eINSTANCE.createLiteralString();
			ls = (LiteralString) aMessage.createArgument(name, null, ls.eClass());
			ls.setName(name);
			ls.setValue(value);
		}
		return ls;
	}

	protected Parameter getParameter(Interaction anInteraction, String paramName, String defaultValue,
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

}
