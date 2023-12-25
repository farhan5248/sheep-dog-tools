package org.farhan.mbt.conv.core;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;

public abstract class ToUMLOtherLayerLinker extends ToUMLLayerLinker {

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {
	}

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwner = (Class) targetInteraction.getOwner();
		return interactionOwner.getQualifiedName()
				.replace(Project.secondLayerPackageName, Project.thirdLayerPackageName).replace("Steps", "");
	}

}
