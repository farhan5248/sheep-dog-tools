package org.farhan.mbt.conv.core;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.graph.validation.MBTEdgeValidator;
import org.farhan.mbt.graph.validation.MBTVertexValidator;

public abstract class ToUMLFirstLayerLinker extends ToUMLLayerLinker {

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {

		if (Validator.validateStepText(m.getName())) {
			if (MBTVertexValidator.isVertice(m.getName())) {
				createNextLayerInteractionMessagesFromVerticeMessage(targetInteraction, m);
			} else if (MBTEdgeValidator.isEdge(m.getName())) {
				createNextLayerInteractionMessagesFromEdgeMessage(targetInteraction, m);
			}
		}
	}

	protected abstract void createNextLayerInteractionMessagesFromVerticeMessage(Interaction targetInteraction,
			Message m);

	protected abstract void createNextLayerInteractionMessagesFromEdgeMessage(Interaction targetInteraction,
			Message m);

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwningClass = (Class) targetInteraction.getOwner();
		return interactionOwningClass.getQualifiedName()
				.replace(Project.secondLayerPackageName, Project.thirdLayerPackageName).replace("Steps", "");
	}
}
