package org.farhan.mbt.conv.uml;

import org.eclipse.uml2.uml.Class;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.farhan.mbt.conv.core.Utilities;

public class InteractionFactory extends PropertyFactory {

	public Interaction anInteraction;

	public InteractionFactory(Operation anOperation, Class theClass) {
		anInteraction = (Interaction) theClass.getOwnedBehavior(anOperation.getName());
		if (anInteraction == null) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(anOperation.getName());
			theClass.setClassifierBehavior(anInteraction);
			anInteraction.setSpecification(anOperation);
		}
	}

	public InteractionFactory(CallBehaviorAction anAction, Activity anActivity) {
		anInteraction = (Interaction) anActivity.getOwnedBehavior(anAction.getName());
		if (anInteraction == null) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(anAction.getName());
			anActivity.setClassifierBehavior(anInteraction);
			anAction.setBehavior(anInteraction);
		}
	}

	public InteractionOperand getFragment(String fragmentName, int operatorKind, InteractionOperand enclosingOperand,
			String guardName) {

		CombinedFragment aFragment;
		InteractionOperand anOperand;

		aFragment = UMLFactory.eINSTANCE.createCombinedFragment();
		aFragment.setName(fragmentName);
		aFragment.setEnclosingInteraction(anInteraction);

		aFragment.setInteractionOperator(InteractionOperatorKind.get(operatorKind));
		anOperand = aFragment.createOperand(fragmentName);
		anOperand.createGuard(guardName);

		if (enclosingOperand != null) {
			aFragment.setEnclosingOperand(enclosingOperand);
		}
		return anOperand;
	}

	public static Interaction getInteraction(Class theClass, String interactionName, boolean add) {
		return getInteraction(theClass, interactionName, add, "");
	}

	public static Interaction getInteraction(Class theClass, String interactionName, boolean add,
			String annotationName) {
		Interaction anInteraction = (Interaction) theClass.getOwnedBehavior(interactionName);
		if (anInteraction == null && add) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(interactionName);
			theClass.setClassifierBehavior(anInteraction);
			Property aProperty = PropertyFactory.getProperty(theClass, "this", theClass);
			LifelineFactory.getLifeline(anInteraction, aProperty);
		}
		if (!annotationName.isEmpty()) {
			AnnotationFactory.getAnnotation(anInteraction, annotationName);
		}

		return anInteraction;
	}

}
