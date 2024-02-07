package org.farhan.mbt.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.uml.UMLProject;

public abstract class ToCodeConverter {

	protected String layer;
	protected UMLProject srcPrj;

	protected abstract void selectObjects() throws Exception;

	protected String getLayer() {
		return layer;
	}

	protected abstract ArrayList<ConvertibleObject> getObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject co : getObjects(getLayer())) {
			convertObject(co);
			convertImports(co);
			convertBehaviours(co);
		}
	}

	protected abstract void convertObject(ConvertibleObject co) throws Exception;

	protected abstract void convertImports(ConvertibleObject co) throws Exception;

	protected abstract void convertBehaviours(ConvertibleObject co) throws Exception;

	protected abstract void convertInteractionMessages(Interaction anInteraction, Object stepList) throws Exception;

	protected abstract void convertMessage(Message m, Object stepList) throws Exception;

	protected abstract String convertObjectName(String fullName);

}
