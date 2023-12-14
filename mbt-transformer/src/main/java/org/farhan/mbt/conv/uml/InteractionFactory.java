package org.farhan.mbt.conv.uml;

import org.eclipse.uml2.uml.Class;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.farhan.conv.core.Utilities;



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

	public static Interaction getInteractionByMatchingMessageToName(Class theClass, String messageName, boolean add) {
		for (Behavior b : theClass.getOwnedBehaviors()) {
			if (b instanceof Interaction) {
				if (isMatchingExpression(b.getName(), messageName)) {
					return (Interaction) b;
				}
			}
		}
		return getInteraction(theClass, messageName, add);
	}

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

	private static boolean isMatchingExpression(String keywordExpression, String keywordUsage) {

		try {
			String variableNamePattern = "\\$\\{[^\\}]*\\}";
			String testString = keywordExpression;
			testString = testString.replace("\\", "\\\\");
			testString = testString.replace("/", "\\/");
			testString = testString.replace("[", "\\[");
			testString = testString.replace("]", "\\]");
			testString = testString.replace("+", "\\+");
			testString = testString.replace("?", "\\?");
			testString = testString.replace(".", "\\.");
			testString = testString.replace(":", "\\:");
			testString = testString.replace("*", "\\*");
			testString = testString.replace("(", "\\(");
			testString = testString.replace(")", "\\)");
			testString = testString.replaceAll(variableNamePattern, ".*");
			testString = testString.replace("$", "\\$");
			testString = testString.replace("{", "\\{");
			testString = testString.replace("}", "\\}");
			// The split by double-space here handles matches with [Arguments] and inline
			// comments
			if (Utilities.regexFind("^" + testString + "$", keywordUsage.split("  ")[0].trim(), 0) == null) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
