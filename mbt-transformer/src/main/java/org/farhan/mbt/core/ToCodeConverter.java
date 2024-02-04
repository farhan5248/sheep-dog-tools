package org.farhan.mbt.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.uml.UMLProject;

public abstract class ToCodeConverter {

	protected UMLProject source;

	protected abstract ArrayList<?> selectObjects() throws Exception;

	protected abstract String getLayer();

	protected abstract ArrayList<Class> getObjects(String layer);

	protected void convertObjects() throws Exception {
		for (Class layerClass : getObjects(getLayer())) {
			convertObject(layerClass);
			convertImports(layerClass);
			convertAttributes(layerClass);
			convertBehaviours(layerClass);
		}
	}

	protected abstract void convertObject(Class layerClass) throws Exception;

	protected abstract void convertImports(Class layerClass) throws Exception;

	protected abstract void convertAttributes(Class layerClass) throws Exception;

	protected abstract void convertBehaviours(Class layerClass) throws Exception;

	protected abstract void convertInteractionMessages(Interaction anInteraction, Object stepList) throws Exception;

	protected abstract void convertMessage(Message m, Object stepList) throws Exception;

	protected abstract String convertObjectName(String fullName);

}
