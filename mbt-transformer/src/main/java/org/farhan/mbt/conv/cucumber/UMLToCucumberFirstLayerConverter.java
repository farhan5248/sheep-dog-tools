package org.farhan.mbt.conv.cucumber;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.farhan.mbt.conv.core.UMLToFirstLayerConverter;

public class UMLToCucumberFirstLayerConverter extends UMLToFirstLayerConverter {

	@Override
	protected ArrayList<?> selectLayerClasses(String layer) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void convertFromClass(Class layerClass) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	protected void convertFromImports(Class layerClass) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void convertFromAttributes(Class layerClass) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void convertFromBehaviours(Class layerClass) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void convertFromInteractionMessages(Interaction anInteraction, Object stepList) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void convertFromMessage(Interaction anInteraction, Object anObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertPathToClassQualifiedName(String pathName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertClassQualifiedNameToImport(String qualifiedName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertImportToClassQualifiedName(String importName) {
		// TODO Auto-generated method stub
		return null;
	}
}
