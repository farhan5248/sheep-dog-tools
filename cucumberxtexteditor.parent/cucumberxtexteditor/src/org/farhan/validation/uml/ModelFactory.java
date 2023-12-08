package org.farhan.validation.uml;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interface;

public class ModelFactory {

	public static Model getModel(String name) {
		Model theModel = UMLFactory.eINSTANCE.createModel();
		theModel.setName(name);
		return theModel;
	}

	public static Model getSubModel(Model theSystem, String name, String comment) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(name);
		model.setNestingPackage(theSystem);
		model.createOwnedComment().setBody(comment);
		return model;
	}
}
