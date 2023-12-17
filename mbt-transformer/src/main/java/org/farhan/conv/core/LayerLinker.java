package org.farhan.conv.core;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.PackageFactory;

public abstract class LayerLinker {

	protected Model theSystem;

	protected void linkLayerFiles(String layer) throws Exception {
		ArrayList<Interaction> layerInteractions = PackageFactory.getPackagedInteractions(theSystem, layer);
		for (Interaction i : layerInteractions) {
			for (Message m : i.getMessages()) {
				String annotationName = getNextLayerInteractionAnnotationfromMessage(m);
				for (String methodName : getNextLayerInteractionNamesfromMessage(m)) {
					Interaction targetInteraction = InteractionFactory
							.getInteractionWithAnnotation(getNextLayerClassFromMessage(m), methodName, annotationName);
					if (targetInteraction.getMessages().isEmpty() && targetInteraction.getOwnedParameters().isEmpty()) {
						addNextLayerInteractionParameters(targetInteraction, m);
						addNextLayerInteractionMessages(targetInteraction, m);
					} else if (!targetInteraction.getMessages().isEmpty() && targetInteraction.getName().endsWith("AsFollows")){
						addNextLayerInteractionParameters(targetInteraction, m);
					}
					m.setSignature(targetInteraction);
				}
			}
		}
	}

	protected abstract String getNextLayerInteractionAnnotationfromMessage(Message m);

	protected abstract ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m);

	protected abstract void addNextLayerInteractionMessages(Interaction targetInteraction, Message m);

	protected abstract void addNextLayerInteractionParameters(Interaction targetInteraction, Message m);

	protected Class getNextLayerClassFromMessage(Message m) {
		// get the target event, lifeline, property, imported class
		MessageOccurrenceSpecification targetEvent = (MessageOccurrenceSpecification) m.getReceiveEvent();
		Lifeline targetLifeline = targetEvent.getCovered();
		Property targetProperty = (Property) targetLifeline.getRepresents();
		Class targetClass = (Class) targetProperty.getType();
		return targetClass;
	}

	// TODO getMethodName or something should be in this class
	protected String getVariableName(String string) {
		return string.replace(" ", "");
	}

	protected abstract String getNextLayerClassQualifiedName(Interaction targetInteraction);

}
