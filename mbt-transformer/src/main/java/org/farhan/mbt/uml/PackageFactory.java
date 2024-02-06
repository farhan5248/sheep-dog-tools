package org.farhan.mbt.uml;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;

public class PackageFactory {

	// TODO delete after modifying link layer files
	private static Package getPackageRecursively(Package nestingPackage, String qualifiedName) {
		Package owningPackage = nestingPackage;
		String[] qualifiedNameParts = qualifiedName.replace(nestingPackage.getQualifiedName() + "::", "").split("::");
		for (int i = 0; i < qualifiedNameParts.length; i++) {
			owningPackage = owningPackage.getNestedPackage(qualifiedNameParts[i]);
		}
		return owningPackage;
	}

	// TODO move to UMLProject and make private after deleting
	// getPackagedInteractions
	public static ArrayList<Class> getPackagedClasses(Package aPackage) {
		ArrayList<Class> classes = new ArrayList<Class>();
		for (PackageableElement pe : aPackage.getPackagedElements()) {
			if (pe instanceof Class) {
				classes.add((Class) pe);
			} else if (pe instanceof Package) {
				classes.addAll(getPackagedClasses((Package) pe));
			}
		}
		return classes;
	}

	// TODO delete after modifying link layer files
	public static ArrayList<Interaction> getPackagedInteractions(Model theSystem, String layer) {

		ArrayList<Interaction> layerInteractions = new ArrayList<Interaction>();
		Package upperLayerPackage = PackageFactory.getPackageRecursively(theSystem, "pst::" + layer);
		if (upperLayerPackage != null) {
			ArrayList<Class> layerClasses = PackageFactory.getPackagedClasses(upperLayerPackage);
			for (Class c : layerClasses) {
				for (Behavior b : c.getOwnedBehaviors()) {
					Interaction i = (Interaction) b;
					layerInteractions.add(i);
				}
			}
		}
		return layerInteractions;
	}

}
