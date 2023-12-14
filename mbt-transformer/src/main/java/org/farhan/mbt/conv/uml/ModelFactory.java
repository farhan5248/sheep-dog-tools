package org.farhan.mbt.conv.uml;

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

	public static ArrayList<Component> getAppComponents(Model theSystem, String owningModelName) {
		Model owningModel = (Model) theSystem.getMember(owningModelName);
		ArrayList<Component> theApps = new ArrayList<Component>();
		for (NamedElement ne : owningModel.getOwnedMembers()) {
			if (ne instanceof Component) {
				theApps.add((Component) ne);
			}
		}
		return theApps;
	}

	public static ArrayList<Interface> getInterfaces(Component aComponent) {
		ArrayList<Interface> interfaces = new ArrayList<Interface>();
		for (NamedElement ne : aComponent.getOwnedMembers()) {
			if (ne instanceof Interface) {
				interfaces.add((Interface) ne);
			}
		}
		return interfaces;
	}

}
