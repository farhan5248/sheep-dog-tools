package org.farhan.mbt.conv.uml;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Property;

public class LifelineFactory {

	Lifeline theLifeline;

	public LifelineFactory(Lifeline theLifeline) {
		this.theLifeline = theLifeline;
	}

	public static Lifeline getLifeline(Interaction anInteraction, Property theProperty) {
		Lifeline aLifeline = anInteraction.getLifeline(theProperty.getName());
		if (aLifeline == null) {
			aLifeline = anInteraction.createLifeline(theProperty.getName());
			aLifeline.setRepresents(theProperty);
		}
		return aLifeline;
	}

	public static Lifeline getLifeline(Interaction interaction, String name) {
		return interaction.getLifeline(name);
	}

}
