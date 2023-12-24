package org.farhan.mbt.conv.core;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;

public abstract class ToUMLLayerConverter {

	protected abstract void selectLayerFiles(String layerSelectionCriteria) throws Exception;

	protected void transformLayerFiles(ArrayList<ConvertibleFile> layerFiles) throws Exception {

		for (ConvertibleFile layerFile : layerFiles) {
			Class layerClass = convertToClass(layerFile);
			convertToImports(layerClass);
			convertToAttributes(layerClass);
			convertToBehaviours(layerClass);
		}
	}

	protected abstract Class convertToClass(ConvertibleFile layerFile) throws Exception;

	protected abstract void convertToImports(Class layerClass) throws Exception;

	protected abstract void convertToAttributes(Class layerClass) throws Exception;

	protected abstract void convertToBehaviours(Class layerClass) throws Exception;

	protected abstract void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps)
			throws Exception;

	protected abstract void convertToMessage(Interaction anInteraction, Object anObject) throws Exception;

	protected abstract String convertClassQualifiedNameToPath(String qualifiedName);

	protected abstract String convertAbsolutePathToQualifiedName(String pathName);

	protected abstract String convertClassQualifiedNameToImport(String qualifiedName);

	protected abstract String convertImportToClassQualifiedName(String importName);

}
