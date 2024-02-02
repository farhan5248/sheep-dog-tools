package org.farhan.mbt.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;

public abstract class UMLToLayerConverter {

	protected abstract ArrayList<?> selectLayerClasses(String layer) throws Exception;

	protected abstract ArrayList<Class> getLayerClasses(String layer);

	protected void transformLayerClasses(String layer) throws Exception {
		for (Class layerClass : getLayerClasses(layer)) {
			convertFromClass(layerClass);
			convertFromImports(layerClass);
			convertFromAttributes(layerClass);
			convertFromBehaviours(layerClass);
		}
	}

	protected abstract void convertFromClass(Class layerClass) throws Exception;

	protected abstract void convertFromImports(Class layerClass) throws Exception;

	protected abstract void convertFromAttributes(Class layerClass) throws Exception;

	protected abstract void convertFromBehaviours(Class layerClass) throws Exception;

	protected abstract void convertFromInteractionMessages(Interaction anInteraction, Object stepList) throws Exception;

	protected abstract void convertFromMessage(Message m, Object stepList) throws Exception;

	protected abstract String convertClassQualifiedNameToPath(String qualifiedName);

	protected abstract String convertPathToClassQualifiedName(String pathName);

	// TODO while I think I need the two above, not sure I need the two below to be
	// here
	protected abstract String convertClassQualifiedNameToImport(String qualifiedName);

	protected abstract String convertImportToClassQualifiedName(String importName);

}
