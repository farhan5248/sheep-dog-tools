package org.farhan.mbt.conv.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

public class MessageFactory {

	public static Message getMessage(Interaction aTestOrKeyword, Class importedKeywordsClass,
			String aTestOrKeywordStepName) {
		Class owningClass = (Class) aTestOrKeyword.getOwner();

		Property thisProperty = PropertyFactory.getProperty(owningClass, "this", owningClass);
		Lifeline thisLifeline = LifelineFactory.getLifeline(aTestOrKeyword, thisProperty);

		Property targetProperty = PropertyFactory.getProperty(owningClass, importedKeywordsClass.getName(),
				importedKeywordsClass);
		Lifeline targetLifeline = LifelineFactory.getLifeline(aTestOrKeyword, targetProperty);

		Message aMessage = aTestOrKeyword.createMessage(aTestOrKeywordStepName);
		MessageOccurrenceSpecification mosSrc;
		MessageOccurrenceSpecification mosDst;

		mosSrc = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		mosSrc.setName(aTestOrKeywordStepName + "SendEvent");
		mosSrc.setEnclosingInteraction(aTestOrKeyword);
		mosSrc.setMessage(aMessage);
		mosSrc.setCovered(thisLifeline);

		mosDst = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		mosDst.setName(aTestOrKeywordStepName + "ReceiveEvent");
		mosDst.setEnclosingInteraction(aTestOrKeyword);
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
