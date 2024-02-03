package org.farhan.mbt.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.uml.UMLProject;

public abstract class UMLToLayerConverter {

	protected UMLProject sourceProject;
	
	protected abstract ArrayList<?> selectLayerFiles() throws Exception;

	protected abstract String getLayer();

	protected abstract ArrayList<Class> getLayerObjects(String layer);

	protected void convertObjects() throws Exception {
		for (Class layerClass : getLayerObjects(getLayer())) {
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

	// TODO while I think I need the two below, not sure I need the two below those
	protected abstract String convertClassQualifiedNameToPath(String qualifiedName);

	protected abstract String convertPathToClassQualifiedName(String pathName);

	protected abstract String convertClassQualifiedNameToImport(String qualifiedName);

	protected abstract String convertImportToClassQualifiedName(String importName);

}
