package org.farhan.mbt.graphuml;

import java.util.Collection;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.ToUMLOtherLayerConverter;

public class GraphToUMLOtherLayerConverter extends ToUMLOtherLayerConverter {

	@Override
	protected Class convertToClass(ConvertibleFile layerFile) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected void convertToBehaviours(Class layerClass) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected void convertToMessage(Interaction anInteraction, Object anObject) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected String convertQualifiedNameToAbsolutePath(String qualifiedName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertAbsolutePathToQualifiedName(String pathName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertQualifiedNameToImportName(String qualifiedName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertImportNameToQualifiedName(String importName) {
		// TODO Auto-generated method stub
		return null;
	}

}
