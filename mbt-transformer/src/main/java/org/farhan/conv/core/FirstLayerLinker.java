package org.farhan.conv.core;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.graph.validation.EdgeValidator;
import org.farhan.mbt.graph.validation.VerticeValidator;

public abstract class FirstLayerLinker extends LayerLinker {

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {

		if (VerticeValidator.isValid(m.getName())) {

			if (VerticeValidator.isValid(m.getName())) {
				createNextLayerInteractionMessagesFromInputMessage(targetInteraction, m);
			} else if (VerticeValidator.isValid(m.getName())) {
				createNextLayerInteractionMessagesFromOutputMessage(targetInteraction, m);
			} else if (EdgeValidator.isValid(m.getName())) {
				createNextLayerInteractionMessagesFromTransitionMessage(targetInteraction, m);
			} else if (VerticeValidator.isValid(m.getName())) {
				createNextLayerInteractionMessagesFromInitialMessage(targetInteraction, m);
			} else if (VerticeValidator.isValid(m.getName())) {
				createNextLayerInteractionMessagesFromFinalMessage(targetInteraction, m);
			}
		}
	}

	protected abstract void createNextLayerInteractionMessagesFromFinalMessage(Interaction targetInteraction,
			Message m);

	protected abstract void createNextLayerInteractionMessagesFromInitialMessage(Interaction targetInteraction,
			Message m);

	protected abstract void createNextLayerInteractionMessagesFromInputMessage(Interaction targetInteraction,
			Message m);

	protected abstract void createNextLayerInteractionMessagesFromOutputMessage(Interaction targetInteraction,
			Message m);

	protected abstract void createNextLayerInteractionMessagesFromTransitionMessage(Interaction targetInteraction,
			Message m);

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwningClass = (Class) targetInteraction.getOwner();
		return interactionOwningClass.getQualifiedName()
				.replace(Project.secondLayerPackageName, Project.thirdLayerPackageName).replace("Steps", "");
	}
}
