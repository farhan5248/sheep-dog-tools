package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.core.ToUMLFirstLayerLinker;

public class GraphToUMLFirstLayerLinker extends ToUMLFirstLayerLinker {

	@Override
	protected void createNextLayerInteractionMessagesFromVerticeMessage(Interaction targetInteraction, Message m) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createNextLayerInteractionMessagesFromEdgeMessage(Interaction targetInteraction, Message m) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Interaction addNextLayerInteraction(String methodName, Message m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {
		// TODO Auto-generated method stub

	}

}
