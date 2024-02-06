package org.farhan.mbt.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

public class MessageFactory {

	public static Message getMessage(Interaction anInteraction, Class importedKeywordsClass,
			String aTestOrKeywordStepName) {
		Class owningClass = (Class) anInteraction.getOwner();

		Property thisProperty = PropertyFactory.getProperty(owningClass, "this", owningClass);
		Lifeline thisLifeline = anInteraction.createLifeline(thisProperty.getName());
		thisLifeline.setRepresents(thisProperty);

		Property targetProperty = PropertyFactory.getProperty(owningClass, importedKeywordsClass.getName(),
				importedKeywordsClass);
		Lifeline targetLifeline = anInteraction.createLifeline(targetProperty.getName());
		targetLifeline.setRepresents(targetProperty);

		Message aMessage = anInteraction.createMessage(aTestOrKeywordStepName);
		MessageOccurrenceSpecification mosSrc;
		MessageOccurrenceSpecification mosDst;

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

	public static Message getMessage(Interaction interaction, String name) {
		for (NamedElement ne : interaction.getOwnedMembers()) {
			if (ne.getName().contentEquals(name)) {
				return (Message) ne;
			}
		}
		return null;
	}

	public static MessageOccurrenceSpecification getMessageOccurence(Interaction interaction, String name) {
		for (NamedElement ne : interaction.getOwnedMembers()) {
			if (ne.getName().contentEquals(name)) {
				return (MessageOccurrenceSpecification) ne;
			}
		}
		return null;
	}

}
