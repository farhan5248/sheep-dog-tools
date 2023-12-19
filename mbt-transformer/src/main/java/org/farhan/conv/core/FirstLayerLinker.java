package org.farhan.conv.core;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.conv.validation.Layer1Validator;
import org.farhan.mbt.graph.validation.EdgeValidator;
import org.farhan.mbt.graph.validation.VerticeValidator;

public abstract class FirstLayerLinker extends LayerLinker {

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {

		if (Layer1Validator.validateStepText(m.getName())) {

			if (VerticeValidator.isValid(m.getName())) {
				createNextLayerInteractionMessagesFromOutputMessage(targetInteraction, m);
			} else if (EdgeValidator.isValid(m.getName())) {
				createNextLayerInteractionMessagesFromTransitionMessage(targetInteraction, m);
			}
		}
	}

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
