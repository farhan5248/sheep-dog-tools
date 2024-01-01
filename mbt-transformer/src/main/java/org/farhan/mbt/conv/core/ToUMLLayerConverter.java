package org.farhan.mbt.conv.core;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;

public abstract class ToUMLLayerConverter {

	protected abstract void selectLayerFiles(String layerSelectionCriteria) throws Exception;

	protected void transformLayerFiles(ArrayList<ConvertibleFile> layerFiles) throws Exception {

		for (ConvertibleFile layerFile : layerFiles) {
			// TODO replace this with a logger
			System.out.println(layerFile.getFile().getAbsolutePath());
			Class layerClass = convertToClass(layerFile);
			convertToImports(layerClass);
			convertToBehaviours(layerClass);
		}
	}

	protected abstract Class convertToClass(ConvertibleFile layerFile) throws Exception;

	protected abstract void convertToImports(Class layerClass) throws Exception;

	protected abstract void convertToBehaviours(Class layerClass) throws Exception;

	protected abstract void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps)
			throws Exception;

	protected abstract void convertToMessage(Interaction anInteraction, Object anObject) throws Exception;

	protected abstract String convertQualifiedNameToAbsolutePath(String qualifiedName);

	protected abstract String convertAbsolutePathToQualifiedName(String pathName);

	protected abstract String convertQualifiedNameToImportName(String qualifiedName);

	protected abstract String convertImportNameToQualifiedName(String importName);

}
