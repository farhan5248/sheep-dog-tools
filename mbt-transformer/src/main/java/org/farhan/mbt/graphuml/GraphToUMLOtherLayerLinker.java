package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.core.ToUMLOtherLayerLinker;

public class GraphToUMLOtherLayerLinker extends ToUMLOtherLayerLinker {

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
