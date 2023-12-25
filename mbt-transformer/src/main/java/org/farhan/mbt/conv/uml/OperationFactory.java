package org.farhan.mbt.conv.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;

public class OperationFactory extends PropertyFactory {

	Operation theOperation;
	Interaction anInteraction;

	public OperationFactory(Interface theInterface, String title) {
		theOperation = theInterface.getOwnedOperation(title, null, null);
		if (theOperation == null) {
			theOperation = theInterface.createOwnedOperation(title, null, null, null);
		}
	}

	public OperationFactory(Class theClass, String title) {

		theOperation = null;
		for (Operation o : theClass.getOwnedOperations()) {
			// TODO can you say spaghetti code?
			// In the future all cross references between keywords will go through the UML
			// model so move the method here eventually. Hmm, this needs some explaining. If
			// I just compared it one way, then it merges multiple keywords into one like
			// verify effective date is ${value} vs verify effective date is current date.
			// So only if both are matches, should it be considered equal as as verify
			// effective date is ${value} and verify effective date is ${notvalue} would be
			//if (RobotKeywordFinder.isMatchingKeyword(o.getName(), title) && RobotKeywordFinder.isMatchingKeyword(title, o.getName())) {
			//	theOperation = o;
			//}
		}
		if (theOperation == null) {
			theOperation = theClass.createOwnedOperation(title, null, null, null);
		}
	}

	public void addComment(String comment) {
		theOperation.createOwnedComment().setBody(comment);
	}

	public Parameter createParameter(String paramName, String defaultValue) {
		Parameter robotKeyword = theOperation.getOwnedParameter(paramName, null);
		if (robotKeyword == null) {
			robotKeyword = theOperation.createOwnedParameter(paramName, null);
			robotKeyword.setDefault(defaultValue);
		}
		return robotKeyword;
	}

	public OperationFactory getOperation(Class theClass, String title) {
		OperationFactory anOperationWrapper = new OperationFactory(theClass, title);
		// TODO remove these two lines and have the operation constructor do it all
		InteractionFactory aWrappedInteraction = new InteractionFactory(anOperationWrapper.theOperation, theClass);
		anOperationWrapper.anInteraction = aWrappedInteraction.anInteraction;
		Property aProperty = PropertyFactory.getProperty(theClass, "this", theClass);
		LifelineFactory.getLifeline(aWrappedInteraction.anInteraction, aProperty);
		return anOperationWrapper;
	}

}
