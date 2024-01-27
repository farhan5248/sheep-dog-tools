package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.core.UMLToFirstLayerConverter;

public class UMLToCucumberFirstLayerConverter extends UMLToFirstLayerConverter {

	@Override
	protected ArrayList<?> selectLayerClasses(String layer) throws Exception {
		// TODO get the first layer classes from the UML package
		return null;
	}

	@Override
	protected void convertFromClass(Class layerClass) throws Exception {
		// TODO feature name, statements from string
	}

	@Override
	protected void convertFromImports(Class layerClass) throws Exception {
	}

	@Override
	protected void convertFromAttributes(Class layerClass) throws Exception {
	}

	@Override
	protected void convertFromBehaviours(Class layerClass) throws Exception {
		// TODO there's no background or scenario outline, just scenario
		// create scenario from interaction, name from name, statements from comments
		// call convertFromInteractionMessages
	}

	@Override
	protected void convertFromInteractionMessages(Interaction anInteraction, Object stepList) throws Exception {
		// TODO loop through messages and create statements with * for now
		// message name to step name, convertFromMessage
		// message annotations to step data table, convertArgumentToDataTableF
	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertPathToClassQualifiedName(String pathName) {
		// TODO shouldn't be here
		return null;
	}

	@Override
	protected String convertClassQualifiedNameToImport(String qualifiedName) {
		// TODO shouldn't be here
		return null;
	}

	@Override
	protected String convertImportToClassQualifiedName(String importName) {
		// TODO shouldn't be here
		return null;
	}

	@Override
	protected void convertFromMessage(Message m, Object step) throws Exception {
		// TODO Auto-generated method stub
	}
}
