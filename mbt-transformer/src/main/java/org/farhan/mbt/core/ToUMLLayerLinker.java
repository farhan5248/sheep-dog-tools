package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Property;
import org.farhan.mbt.uml.PackageFactory;
import org.farhan.mbt.uml.UMLProject;

public abstract class ToUMLLayerLinker {

	protected void linkLayerFiles(String layer) throws Exception {
		ArrayList<Interaction> layerInteractions = PackageFactory.getPackagedInteractions(UMLProject.theSystem, layer);
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

}
