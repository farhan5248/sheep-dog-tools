package org.farhan.conv.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;

public abstract class LayerConverter {

	Logger log;
	protected Model theSystem;

	protected abstract ArrayList<File> selectLayerFiles(String layer) throws Exception;

	protected abstract File getLayerDir();

	protected abstract String getLayerFileType();

	protected void transformLayerFiles(ArrayList<File> layerFiles) throws Exception {

		for (File aFile : layerFiles) {
			try {
				Class layerClass = convertToClass(aFile);
				convertToImports(layerClass);
				convertToAttributes(layerClass);
				convertToBehaviours(layerClass);
			} catch (Exception e) {
				log.error(Utilities.getStackTraceAsString(e));
				log.error("Problem transforming file: " + aFile.getAbsolutePath());
			}
		}
	}

	protected abstract Class convertToClass(File theFile) throws Exception;

	protected abstract void convertToImports(Class layerClass) throws Exception;

	protected abstract void convertToAttributes(Class layerClass) throws Exception;

	protected abstract void convertToBehaviours(Class layerClass) throws Exception;

	protected abstract void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps)
			throws Exception;

	protected abstract void convertToMessage(Interaction anInteraction, Object o);

	protected abstract String convertClassQualifiedNameToPath(String qualifiedName);

	protected abstract String convertPathToClassQualifiedName(String pathName);

	protected abstract String convertClassQualifiedNameToImport(String qualifiedName);

	protected abstract String convertImportToClassQualifiedName(String importName);

}
