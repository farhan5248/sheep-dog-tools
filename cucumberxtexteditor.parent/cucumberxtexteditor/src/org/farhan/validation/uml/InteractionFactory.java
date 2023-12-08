package org.farhan.validation.uml;

import org.eclipse.uml2.uml.Class;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

public class InteractionFactory extends PropertyFactory {

	public Interaction anInteraction;

	public static Interaction getInteractionWithAnnotation(Class theClass, String methodName, String annotationName) {
		Interaction anInteraction = getInteraction(theClass, methodName, true);
		if (annotationName != null && anInteraction.getEAnnotations().isEmpty()) {
			anInteraction.createEAnnotation(annotationName);
		}
		return anInteraction;
	}

	public static Interaction getInteraction(Class theClass, String interactionName, boolean add) {
		Interaction anInteraction = (Interaction) theClass.getOwnedBehavior(interactionName);
		if (anInteraction == null && add) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(interactionName);
			theClass.setClassifierBehavior(anInteraction);
			Property aProperty = PropertyFactory.getProperty(theClass, "this", theClass);
			LifelineFactory.getLifeline(anInteraction, aProperty);
		}
		return anInteraction;
	}

}
